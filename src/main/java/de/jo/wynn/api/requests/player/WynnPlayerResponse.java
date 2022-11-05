package de.jo.wynn.api.requests.player;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.requests.player.impl.PlayerGlobal;
import de.jo.wynn.api.requests.player.impl.GuildDataSimple;
import de.jo.wynn.api.requests.player.impl.PlayerNetworkInformation;
import de.jo.wynn.api.requests.player.impl.PlayerRanking;
import de.jo.wynn.api.requests.player.impl.gameclass.WynnClass;
import de.jo.wynn.api.requests.impl.rest.RestResponse;
import de.jo.wynn.util.StringHelper;

import java.util.HashMap;
import java.util.List;

public class WynnPlayerResponse extends RestResponse {

    @Expose
    public List<WynnPlayerData> data;

    public static class WynnPlayerData {

        @Expose
        public String username;
        @Expose
        public String uuid;
        @Expose
        public String rank;
        @Expose
        public PlayerNetworkInformation meta;
        @Expose
        public HashMap<String, WynnClass> characters;
        @Expose
        public GuildDataSimple guild;
        @Expose
        public PlayerGlobal global;
        @Expose
        public RankingInformation ranking;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }

    }

    public static class RankingInformation {
        @Expose
        public GuildDataSimple guild;
        @Expose
        public PlayerRanking player;
        @Expose
        public PlayerGlobal.PvP pvp;

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
