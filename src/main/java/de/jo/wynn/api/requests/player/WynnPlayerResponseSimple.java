package de.jo.wynn.api.requests.player;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.requests.impl.rest.RestResponse;

import java.util.List;

public class WynnPlayerResponseSimple extends RestResponse {

    @Expose
    public List<PlayerDataSimple> data;

    public static class PlayerDataSimple {
        @Expose
        public String name;
        @Expose
        public String uuid;
    }

}
