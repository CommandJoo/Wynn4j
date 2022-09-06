package de.jo.wynn.api.impl.recipe;

import de.jo.wynn.api.request.impl.rest.RestRequest;

public class RecipeSearchRequest extends RestRequest {
    public RecipeSearchRequest(Query query, String queryArgs) {
        super(RecipeSearchResponse.class, "recipe/search/"+query.getQueryName()+"/"+queryArgs);
    }

    public enum Query {

        TYPE("type"), SKILL("skill"), LEVEL("level"), DURABILITY("durability"), HEALTH_OR_DAMAGE("healthOrDamage"), DURATION("duration"), BASIC_DURATION("basicDuration");

        private final String queryName;

        Query(String queryName) {
            this.queryName = queryName;
        }

        public String getQueryName() {
            return queryName;
        }
    }

}
