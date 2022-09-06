package de.jo.wynn.api.impl.territory;

import de.jo.wynn.api.request.Request;
import de.jo.wynn.api.request.Response;

public class TerritoryListRequest extends Request {
    public TerritoryListRequest() {
        super(TerritoryListResponse.class, PHP_QUERY+"territoryList");
    }
}
