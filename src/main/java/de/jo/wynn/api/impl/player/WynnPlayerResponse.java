package de.jo.wynn.api.impl.player;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.impl.player.impl.PlayerGlobal;
import de.jo.wynn.api.impl.player.impl.GuildDataSimple;
import de.jo.wynn.api.impl.player.impl.PlayerNetworkInformation;
import de.jo.wynn.api.impl.player.impl.PlayerRanking;
import de.jo.wynn.api.impl.player.impl.gameclass.WynnClass;
import de.jo.wynn.api.request.impl.rest.RestResponse;
import de.jo.wynn.util.StringHelper;

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
        public List<WynnClass> classes;
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
