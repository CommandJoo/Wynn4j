package de.jo.wynn.api.impl.leaderboard;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.WynnRequestData;
import de.jo.wynn.api.data.leaderboard.WynnLeaderboardPlayerData;
import de.jo.wynn.api.request.Response;

import java.util.List;

public class PvPLeaderboardResponse extends Response{

    @Expose
    public List<WynnLeaderboardPlayerData> data;

    @Expose
    public WynnRequestData request;

}
