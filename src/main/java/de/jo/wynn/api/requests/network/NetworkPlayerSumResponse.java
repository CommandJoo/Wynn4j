package de.jo.wynn.api.requests.network;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.WynnRequestData;
import de.jo.wynn.api.requests.Response;

public class NetworkPlayerSumResponse extends Response {

    @Expose
    public int players_online;
    @Expose
    public WynnRequestData request;

}
