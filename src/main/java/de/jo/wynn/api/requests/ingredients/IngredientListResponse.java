package de.jo.wynn.api.requests.ingredients;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.requests.impl.rest.RestResponse;

import java.util.List;

public class IngredientListResponse extends RestResponse {

    @Expose
    public List<String> data;
}
