package de.jo.wynn.api.objects.player;

import de.jo.wynn.api.requests.player.WynnPlayerResponse;
import de.jo.wynn.api.requests.player.impl.GuildDataSimple;
import de.jo.wynn.api.requests.player.impl.PlayerNetworkInformation;
import de.jo.wynn.api.requests.player.impl.gameclass.WynnClass;

import java.util.List;

public class WynnPlayer {

    private final WynnPlayerResponse.WynnPlayerData data;

    public WynnPlayer(WynnPlayerResponse.WynnPlayerData data) {
        this.data = data;
    }

    public String getUUID() {
        return this.data.uuid;
    }

    public String getUsername() {
        return this.data.username;
    }



    public WynnRank getRank() {
        return WynnRank.byName(data.rank);
    }

    public PlayerNetworkInformation getNetworkInfo() {
        return this.data.meta;
    }

    public List<WynnClass> getPlayerClasses() {
        return this.data.classes;
    }

    public WynnClass getPlayerClass(String name) {
        for(WynnClass wynnClass : getPlayerClasses()) {
            if(wynnClass.name.equalsIgnoreCase(name)) return wynnClass;
        }
        return null;
    }

    public GuildDataSimple getGuild() {
        return this.data.guild;
    }

    public WynnPlayerResponse.RankingInformation getRanking() {
        return this.data.ranking;
    }


    public enum WynnRank {
        ADMIN("Administrator"), MOD("Moderator"), BUILDER("Builder"), ITEM("Item"), GAME_MASTER("Game Master"), CMD("CMD"), MUSIC("Music"), HYBRID("Hybrid"), MEDIA("Media"), PLAYER("Player");

        private final String id;

        WynnRank(String id) {
            this.id = id;
        }

        public static WynnRank byName(String name) {
            for(WynnRank wynnRank : values()) {
                if(wynnRank.getId().equalsIgnoreCase(name)) return wynnRank;
            }
            return PLAYER;
        }

        public String getId() {
            return id;
        }
    }

}
