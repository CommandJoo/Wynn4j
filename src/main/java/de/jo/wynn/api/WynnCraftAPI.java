package de.jo.wynn.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import de.jo.wynn.api.data.WynnItemData;
import de.jo.wynn.api.requests.item.WynnItemRequest;
import de.jo.wynn.api.requests.item.WynnItemResponse;
import de.jo.wynn.api.requests.network.NetworkPlayerSumRequest;
import de.jo.wynn.api.requests.network.NetworkPlayerSumResponse;
import de.jo.wynn.api.requests.player.WynnPlayerRequest;
import de.jo.wynn.api.requests.player.WynnPlayerResponse;
import de.jo.wynn.api.objects.item.WynnItem;
import de.jo.wynn.api.objects.player.WynnPlayer;
import de.jo.wynn.api.requests.Request;
import de.jo.wynn.api.requests.Response;
import de.jo.wynn.api.requests.impl.ErrorResponse;
import de.jo.wynn.api.requests.impl.StatusResponse;
import de.jo.wynn.api.requests.impl.TooManyRequestsResponse;
import de.jo.wynn.util.Debugger;
import de.jo.wynn.util.StringHelper;
import de.jo.wynn.util.Timer;
import de.jo.wynn.util.URLHelper;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WynnCraftAPI {

    private final boolean debugging;
    private final Debugger debugger;

    private final Timer timer;
    private int requests;

    public WynnCraftAPI(boolean debugging) {
        this.debugging = debugging;
        this.debugger = new Debugger(this);

        this.timer = new Timer();
    }

    public Response request(Request r) {
        if (timer.check(30 * 60 * 1000)) {
            requests = 0;
            timer.reset();
        }
        if (requests >= 600) {
            return new TooManyRequestsResponse();
        }
        String base = "https://api.wynncraft.com/";
        debugger.debug("Request URL: " + base + r.url, Debugger.DebugType.INFO);
        String resp = URLHelper.readAll(this, new InputStreamReader(Objects.requireNonNull(URLHelper.read(this, base + r.url))));
        this.requests++;

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        assert resp != null;
        JsonObject obj = new JsonParser().parse(resp).getAsJsonObject();


        if (obj.get("error") != null) {
            debugger.debug("Found an Error response!", Debugger.DebugType.WARNING);
            return gson.fromJson(resp, ErrorResponse.class);
        } else if (obj.get("status") != null) {
            debugger.debug("Found a Status response!", Debugger.DebugType.WARNING);
            return gson.fromJson(resp, StatusResponse.class);
        }


        Response response = r.response(gson, StringHelper.prettyJson(resp));
        if (response == null) {
            debugger.debug("No Response found", Debugger.DebugType.WARNING);
        } else {
            debugger.debug("Found Response", Debugger.DebugType.INFO);
        }
        return response;
    }


    public WynnPlayer player(String nameOrUUID) {
        try {
            return new WynnPlayer(((WynnPlayerResponse) request(new WynnPlayerRequest(nameOrUUID))).data.get(0));
        } catch (Exception ex) {
            ex.printStackTrace();
            debugger.debug("Could not find WynnPlayer: " + nameOrUUID + "!", Debugger.DebugType.ERROR);
            return null;
        }
    }
    public int playercount() {
        try {
            return ((NetworkPlayerSumResponse)request(new NetworkPlayerSumRequest())).players_online;
        } catch(Exception ex) {
            debugger.debug("Could not get the current playercount!", Debugger.DebugType.ERROR);
            return -1;
        }
    }
    public List<WynnItem> items(String name) {
        try {
            List<WynnItemData> datas = (((WynnItemResponse)request(new WynnItemRequest(WynnItemRequest.Query.NAME, name)))).items;
            List<WynnItem> items = new ArrayList<>();
            for(WynnItemData data : datas) {
                items.add(new WynnItem(data));
            }
            return items;
        } catch(Exception ex) {
            debugger.debug("Could not find any Items containing the word "+name+" in their name!", Debugger.DebugType.ERROR);
            return null;
        }
    }

    public WynnItem item(String name, int index) {
        try {
            return items(name).get(index);
        } catch(Exception ex) {
            debugger.debug("Could not find the Item "+name+" at an index of "+index +"!", Debugger.DebugType.ERROR);
            return null;
        }
    }


    public boolean allowDebugging() {
        return debugging;
    }
    public Debugger getDebugger() {
        return debugger;
    }
}
