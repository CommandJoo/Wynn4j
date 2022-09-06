package de.jo.wynn.api.requests.guild;

import de.jo.wynn.api.requests.Request;

public class GuildStatsRequest extends Request {
    public GuildStatsRequest(String guildName) {
        super(GuildStatsResponse.class, PHP_QUERY+"guildStats&command="+guildName);
    }
}
