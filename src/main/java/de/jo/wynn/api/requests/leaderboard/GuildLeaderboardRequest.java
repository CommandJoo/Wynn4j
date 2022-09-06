package de.jo.wynn.api.requests.leaderboard;

import de.jo.wynn.api.requests.Request;

public class GuildLeaderboardRequest extends Request {
    public GuildLeaderboardRequest() {
        super(GuildLeaderboardResponse.class, PHP_QUERY+"statsLeaderboard&type=guild&timeframe=alltime");
    }
}
