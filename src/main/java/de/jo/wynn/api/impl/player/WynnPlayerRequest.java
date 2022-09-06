package de.jo.wynn.api.impl.player;

import de.jo.wynn.api.request.impl.rest.RestRequest;

public class WynnPlayerRequest extends RestRequest {

    public WynnPlayerRequest(String nameOrUUID) {
        super(WynnPlayerResponse.class, "player/"+nameOrUUID+"/stats");
    }
}
