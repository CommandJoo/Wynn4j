package de.jo.wynn.api.requests.player;

import de.jo.wynn.api.requests.impl.rest.RestRequest;

public class WynnPlayerRequest extends RestRequest {

    public WynnPlayerRequest(String nameOrUUID) {
        super(WynnPlayerResponse.class, "player/"+nameOrUUID+"/stats");
    }
}
