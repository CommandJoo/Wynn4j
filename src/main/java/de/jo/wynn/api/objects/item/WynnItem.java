package de.jo.wynn.api.objects.item;

import de.jo.wynn.api.data.WynnItemData;

public class WynnItem {

    private final WynnItemData data;

    public WynnItem(WynnItemData data) {
        this.data = data;
    }

    public String getName() {
        return this.data.name;
    }

    public String getDisplayName() {
        return this.data.displayName;
    }

    public String getTier() {
        return this.data.tier;
    }

    public String getSet() {
        return this.data.set;
    }

    public String getItemType() {
        return this.data.type;
    }

    public String getLore() {
        return this.data.addedLore;
    }

    public String getMaterial() {
        return this.data.material;
    }

    public String getAttackSpeed() {
        return this.data.attackSpeed;
    }



    public WynnItemData getData() {
        return data;
    }
}
