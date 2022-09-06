package de.jo.wynn.api.requests.leaderboard;

import de.jo.wynn.api.requests.Request;

public class PlayerLeaderboardRequest extends Request {
    public PlayerLeaderboardRequest() {
        super(PlayerLeaderboardResponse.class, PHP_QUERY+"statsLeaderboard&type=player&timeframe=alltime");
    }
}
