package de.jo.wynn.api.requests.player;

import de.jo.wynn.api.requests.impl.rest.RestRequest;

public class WynnPlayerRequestSimple extends RestRequest {
    public WynnPlayerRequestSimple(String username) {
        super(WynnPlayerResponseSimple.class, "player/"+username+"/uuid");
    }
}
