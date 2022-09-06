package de.jo.wynn.api.impl.guild;

import de.jo.wynn.api.request.Request;

public class GuildStatsRequest extends Request {
    public GuildStatsRequest(String guildName) {
        super(GuildStatsResponse.class, PHP_QUERY+"guildStats&command="+guildName);
    }
}
