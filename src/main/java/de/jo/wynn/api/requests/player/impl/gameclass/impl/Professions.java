package de.jo.wynn.api.requests.player.impl.gameclass.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

public class Professions {

    @Expose
    public Profession alchemism;
    @Expose
    public Profession armouring;
    @Expose
    public Profession combat;
    @Expose
    public Profession cooking;
    @Expose
    public Profession farming;
    @Expose
    public Profession fishing;
    @Expose
    public Profession jeweling;
    @Expose
    public Profession mining;
    @Expose
    public Profession scribing;
    @Expose
    public Profession tailoring;
    @Expose
    public Profession weaponsmithing;
    @Expose
    public Profession woodcutting;
    @Expose
    public Profession woodworking;


    public static class Profession {
        @Expose
        public int level;
        @Expose
        public float xp;

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
