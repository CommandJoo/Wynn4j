package de.jo.wynn.api.impl.player.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

public class PlayerGlobal {

    @Expose
    public int chestsFound;
    @Expose
    public float blocksWalked;
    @Expose
    public int itemsIdentified;
    @Expose
    public int mobsKilled;
    @Expose
    public Level totalLevel;
    @Expose
    public PvP pvp;
    @Expose
    public int logins;
    @Expose
    public int deaths;
    @Expose
    public int discoveries;
    @Expose
    public int eventsWon;

    //Subclass -> for Global
    public static class Level {
        @Expose
        public float combat;
        @Expose
        public float profession;
        @Expose
        public float combined;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }
    }
    //Subclass -> for Global
    public static class PvP {
        @Expose
        public int kills;
        @Expose
        public int deaths;

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
