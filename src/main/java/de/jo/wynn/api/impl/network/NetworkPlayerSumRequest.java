package de.jo.wynn.api.impl.network;

import de.jo.wynn.api.request.Request;
import de.jo.wynn.api.request.Response;

public class NetworkPlayerSumRequest extends Request {
    public NetworkPlayerSumRequest() {
        super(NetworkPlayerSumResponse.class, PHP_QUERY+"onlinePlayersSum");
    }
}
