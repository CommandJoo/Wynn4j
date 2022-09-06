package de.jo.wynn.api.impl.leaderboard;

import de.jo.wynn.api.request.Request;
import de.jo.wynn.api.request.Response;

public class GuildLeaderboardRequest extends Request {
    public GuildLeaderboardRequest() {
        super(GuildLeaderboardResponse.class, PHP_QUERY+"statsLeaderboard&type=guild&timeframe=alltime");
    }
}
