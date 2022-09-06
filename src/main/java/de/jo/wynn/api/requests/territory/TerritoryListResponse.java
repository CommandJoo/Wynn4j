package de.jo.wynn.api.requests.territory;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.WynnRequestData;
import de.jo.wynn.api.requests.Response;
import de.jo.wynn.util.StringHelper;

import java.util.HashMap;

public class TerritoryListResponse extends Response {

    @Expose
    public HashMap<String, Territory> territories;

    @Expose
    public WynnRequestData request;

    public static class Territory {

        @Expose
        public String territory;
        @Expose
        public String guild;
        @Expose
        public String acquired;
        @Expose
        public String attacker;
        @Expose
        public Location location;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }
    }

    public static class Location {

        @Expose
        public float startX, startY, endX, endY;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }

    }

}
