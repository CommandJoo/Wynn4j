package de.jo.wynn.api.impl.network;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.WynnRequestData;
import de.jo.wynn.api.request.Response;

public class NetworkPlayerSumResponse extends Response {

    @Expose
    public int players_online;
    @Expose
    public WynnRequestData request;

}
