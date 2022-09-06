package de.jo.wynn.api.requests.territory;

import de.jo.wynn.api.requests.Request;

public class TerritoryListRequest extends Request {
    public TerritoryListRequest() {
        super(TerritoryListResponse.class, PHP_QUERY+"territoryList");
    }
}
