package de.jo.wynn.api.requests.item;

import com.google.gson.Gson;
import de.jo.wynn.api.requests.Request;
import de.jo.wynn.api.requests.Response;

public class ItemDatabaseRequest extends Request {
    public ItemDatabaseRequest(Query query, String search) {
        super(ItemDatabaseResponse.class, PHP_QUERY+"itemDB&"+query.getQueryName()+"="+search);
    }

    @Override
    public Response response(Gson gson, String json) {
        return super.response(gson, json);
    }

    public enum Query {
        NAME("search"), CATEGORY("category");

        private final String queryName;

        Query(String queryName) {
            this.queryName = queryName;
        }

        public String getQueryName() {
            return queryName;
        }
    }

}
