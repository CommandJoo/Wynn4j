package de.jo.wynn.api.requests.guild;

import de.jo.wynn.api.requests.Request;

public class GuildListRequest extends Request {

    public GuildListRequest() {
        super(GuildListResponse.class,PHP_QUERY+"guildList");
    }
}
