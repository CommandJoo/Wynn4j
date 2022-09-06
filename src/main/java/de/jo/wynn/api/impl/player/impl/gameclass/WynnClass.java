package de.jo.wynn.api.impl.player.impl.gameclass;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.impl.player.impl.PlayerGlobal;
import de.jo.wynn.api.impl.player.impl.gameclass.impl.*;
import de.jo.wynn.util.StringHelper;

public class WynnClass {

    @Expose
    public String name;
    @Expose
    public float level;
    @Expose
    public Dungeons dungeons;
    @Expose
    public Quests quests;
    @Expose
    public int itemsIdentified;
    @Expose
    public int mobsKilled;
    @Expose
    public PlayerGlobal.PvP pvp;
    @Expose
    public int chestsFound;
    @Expose
    public float blocksWalked;
    @Expose
    public int logins;
    @Expose
    public int deaths;
    @Expose
    public int playtime;
    @Expose
    public GameMode gamemode;
    @Expose
    public Skills skills;
    @Expose
    public Professions professions;
    @Expose
    public int discoveries;
    @Expose
    public int eventsWon;
    @Expose
    public boolean preEconomyUpdate;

    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }

}
