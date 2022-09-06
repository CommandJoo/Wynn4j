package de.jo.wynn.api.requests.leaderboard;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.WynnRequestData;
import de.jo.wynn.api.data.leaderboard.WynnLeaderboardPlayerData;
import de.jo.wynn.api.requests.Response;

import java.util.List;

public class PvPLeaderboardResponse extends Response{

    @Expose
    public List<WynnLeaderboardPlayerData> data;

    @Expose
    public WynnRequestData request;

}
