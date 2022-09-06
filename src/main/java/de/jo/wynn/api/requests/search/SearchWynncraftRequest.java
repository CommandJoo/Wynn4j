package de.jo.wynn.api.requests.search;

import de.jo.wynn.api.requests.Request;

public class SearchWynncraftRequest extends Request {
    public SearchWynncraftRequest(String query) {
        super(SearchWynncraftResponse.class, PHP_QUERY+"statsSearch&search="+query);
    }
}
