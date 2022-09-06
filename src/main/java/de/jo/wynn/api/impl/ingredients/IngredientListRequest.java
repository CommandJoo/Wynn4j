package de.jo.wynn.api.impl.ingredients;

import de.jo.wynn.api.request.impl.rest.RestRequest;

public class IngredientListRequest extends RestRequest {

    public IngredientListRequest() {
        super(IngredientListResponse.class, "ingredient/list");
    }
}
