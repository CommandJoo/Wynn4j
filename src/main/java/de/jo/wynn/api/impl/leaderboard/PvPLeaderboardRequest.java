package de.jo.wynn.api.impl.leaderboard;

import de.jo.wynn.api.request.Request;

public class PvPLeaderboardRequest extends Request {
    public PvPLeaderboardRequest() {
        super(PvPLeaderboardResponse.class, PHP_QUERY+"statsLeaderboard&type=pvp&timeframe=alltime");
    }
}
