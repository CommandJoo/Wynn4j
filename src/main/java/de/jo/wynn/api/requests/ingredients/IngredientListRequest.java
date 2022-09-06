package de.jo.wynn.api.requests.ingredients;

import de.jo.wynn.api.requests.impl.rest.RestRequest;

public class IngredientListRequest extends RestRequest {

    public IngredientListRequest() {
        super(IngredientListResponse.class, "ingredient/list");
    }
}
