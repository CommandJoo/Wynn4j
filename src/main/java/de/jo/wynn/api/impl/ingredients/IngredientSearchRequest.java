package de.jo.wynn.api.impl.ingredients;

import de.jo.wynn.api.request.impl.rest.RestRequest;

public class IngredientSearchRequest extends RestRequest {

    public IngredientSearchRequest(Query query, String queryArgs) {
        super(IngredientSearchResponse.class, "ingredient/search/"+query.getQueryName()+"/"+queryArgs);
    }

    public enum Query {
        NAME("name"), TIER("tier"), LEVEL("level"), SKILLS("skills"), SPRITE("sprite"), IDENTIFICATIONS("identifications"), ITEM_ONLY_IDS("itemOnlyIDs"), CONSUMABLE_ONLY_IDS("consumableOnlyIDs");

        private final String queryName;
        
        Query(String queryName) {
            this.queryName = queryName;
        }

        public String getQueryName() {
            return queryName;
        }
    }

}
