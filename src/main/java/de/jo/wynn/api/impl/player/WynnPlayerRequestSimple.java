package de.jo.wynn.api.impl.player;

import de.jo.wynn.api.request.impl.rest.RestRequest;

public class WynnPlayerRequestSimple extends RestRequest {
    public WynnPlayerRequestSimple(String username) {
        super(WynnPlayerResponseSimple.class, "player/"+username+"/uuid");
    }
}
