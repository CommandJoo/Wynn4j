package de.jo.wynn.api.impl.guild;

import de.jo.wynn.api.request.Request;

public class GuildListRequest extends Request {

    public GuildListRequest() {
        super(GuildListResponse.class,PHP_QUERY+"guildList");
    }
}
