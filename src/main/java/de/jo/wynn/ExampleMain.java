package de.jo.wynn;

import de.jo.wynn.api.WynnCraftAPI;
import de.jo.wynn.api.data.WynnRecipeData;
import de.jo.wynn.api.objects.item.WynnItem;
import de.jo.wynn.api.objects.player.WynnPlayer;
import de.jo.wynn.api.requests.item.WynnItemRequest;
import de.jo.wynn.api.requests.item.WynnItemResponse;
import de.jo.wynn.api.requests.player.WynnPlayerRequest;
import de.jo.wynn.api.requests.player.WynnPlayerResponse;
import de.jo.wynn.api.requests.recipe.RecipeGetRequest;
import de.jo.wynn.api.requests.recipe.RecipeGetResponse;
import de.jo.wynn.api.requests.recipe.RecipeListRequest;
import de.jo.wynn.api.requests.recipe.RecipeListResponse;

public class ExampleMain {

    public static void main(String[] args) {
        WynnCraftAPI api = new WynnCraftAPI(true);

        /*
            WynnPlayer be accessed like this
        */
        WynnPlayer player = api.player("Name");
        //or
        WynnPlayerResponse playerResponse = (WynnPlayerResponse) api.request(new WynnPlayerRequest("Name"));
        WynnPlayer player2 = new WynnPlayer(playerResponse.data.get(0));

         /*
            WynnItem be accessed like this
        */
        WynnItem item = api.item("Name", 0);
        //or
        WynnItemResponse itemResponse = (WynnItemResponse) api.request(new WynnItemRequest(WynnItemRequest.Query.NAME, "Name"));
        WynnItem item2 = new WynnItem(itemResponse.items.get(0));

        /*
            To Get a specific WynnCraft Recipe you have to manually request it
        */
        RecipeGetResponse recipeResponse = (RecipeGetResponse) api.request(new RecipeGetRequest("Boots-3-5"));
        for(WynnRecipeData recipeData : recipeResponse.data) {
            System.out.println(recipeData.type);
        }
    }

}