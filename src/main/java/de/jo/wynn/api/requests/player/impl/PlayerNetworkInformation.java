package de.jo.wynn.api.requests.player.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

public class PlayerNetworkInformation {

    @Expose
    public String firstJoin;
    @Expose
    public String lastJoin;
    @Expose
    public Location location;
    @Expose
    public float playtime;
    @Expose
    public Tag tag;
    @Expose
    public boolean veteran;

    //Subclass -> for meta
    public static class Location {
        @Expose
        public boolean online;
        @Expose
        public String server;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }
    }
    //Subclass -> for meta
    public static class Tag{
        @Expose
        public boolean display;
        @Expose
        public String value;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }
    }

    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }

}
