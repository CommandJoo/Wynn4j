package de.jo.wynn.api.impl.ingredients;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.WynnIngredientData;
import de.jo.wynn.api.request.impl.rest.RestResponse;

import java.util.List;

public class IngredientSearchResponse extends RestResponse {

    @Expose
    public List<WynnIngredientData> data;

}
