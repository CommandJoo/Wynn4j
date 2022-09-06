package de.jo.wynn;

import de.jo.wynn.api.WynnCraftAPI;
import de.jo.wynn.api.objects.item.WynnItem;

public class Main {

    public static void main(String[] args) {
        WynnCraftAPI api = new WynnCraftAPI(true);

        WynnItem item = api.item("Scorpion", 0);
    }

}