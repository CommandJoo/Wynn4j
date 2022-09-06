package de.jo.wynn.api.requests.network;

import de.jo.wynn.api.requests.Request;

public class NetworkPlayerSumRequest extends Request {
    public NetworkPlayerSumRequest() {
        super(NetworkPlayerSumResponse.class, PHP_QUERY+"onlinePlayersSum");
    }
}
