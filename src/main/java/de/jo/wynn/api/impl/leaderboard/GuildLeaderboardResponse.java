package de.jo.wynn.api.impl.leaderboard;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.leaderboard.WynnLeaderboardGuildData;
import de.jo.wynn.api.data.WynnRequestData;
import de.jo.wynn.api.request.Response;

import java.util.List;

public class GuildLeaderboardResponse extends Response{

    @Expose
    public List<WynnLeaderboardGuildData> data;

    @Expose
    public WynnRequestData request;

}
