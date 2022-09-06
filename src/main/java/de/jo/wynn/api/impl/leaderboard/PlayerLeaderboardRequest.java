package de.jo.wynn.api.impl.leaderboard;

import de.jo.wynn.api.request.Request;

public class PlayerLeaderboardRequest extends Request {
    public PlayerLeaderboardRequest() {
        super(PlayerLeaderboardResponse.class, PHP_QUERY+"statsLeaderboard&type=player&timeframe=alltime");
    }
}
