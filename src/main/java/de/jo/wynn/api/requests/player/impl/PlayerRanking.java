package de.jo.wynn.api.requests.player.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

public class PlayerRanking {

    @Expose
    public SoloPlayerRanking solo;
    @Expose
    public OverallPlayerRanking overall;

    public static class SoloPlayerRanking {
        @Expose
        public int combat;
        @Expose
        public int woodcutting;
        @Expose
        public int mining;
        @Expose
        public int fishing;
        @Expose
        public int farming;
        @Expose
        public int alchemism;
        @Expose
        public int armouring;
        @Expose
        public int cooking;
        @Expose
        public int jeweling;
        @Expose
        public int scribing;
        @Expose
        public int tailoring;
        @Expose
        public int weaponsmithing;
        @Expose
        public int woodworking;
        @Expose
        public int profession;
        @Expose
        public int overall;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }
    }
    public static class OverallPlayerRanking {
        @Expose
        public float all;
        @Expose
        public float combat;
        @Expose
        public float profession;

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
