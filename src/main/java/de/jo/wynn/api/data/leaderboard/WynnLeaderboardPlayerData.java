package de.jo.wynn.api.data.leaderboard;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

public class WynnLeaderboardPlayerData {

    @Expose
    public String name;
    @Expose
    public String uuid;
    @Expose
    public float kills;
    @Expose
    public int level;
    @Expose
    public float xp;
    @Expose
    public float minPlayed;

    //HERO, VIP+, or VIP
    @Expose
    public String tag;

    //Administrator, Moderator, Builder, Item, Game Master, CMD, Music, Hybrid, Media. Default: Player
    @Expose
    public String rank;
    @Expose
    public String displayTag;
    @Expose
    public String veteran;
    @Expose
    public String guildTag;
    @Expose
    public String guild;
    @Expose
    public int num;


    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }

}
