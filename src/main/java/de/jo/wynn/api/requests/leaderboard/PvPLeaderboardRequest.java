package de.jo.wynn.api.requests.leaderboard;

import de.jo.wynn.api.requests.Request;

public class PvPLeaderboardRequest extends Request {
    public PvPLeaderboardRequest() {
        super(PvPLeaderboardResponse.class, PHP_QUERY+"statsLeaderboard&type=pvp&timeframe=alltime");
    }
}
