package de.jo.wynn.api.data;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

public class WynnItemData {

    @Expose
    public String name;
    @Expose
    public String displayName;

    /*
     * Normal, Unique, Rare, Set, Legendary, Mythic, unique, rare, legendary
     */
    @Expose
    public String tier;
    @Expose
    public String set;
    @Expose
    public int sockets;

    /*
     * Chestplate, Leggings, Wand, Dagger, Spear, Boots, Helmet, Bow, bow, wand, dagger, spear, boots, helmet, leggings, or chestplate
     */
    @Expose
    public String type;

    //Diamond, Iron, Leather, Chain, Golden, diamond, golden, iron, or chain
    @Expose
    public String armorType;

    //Format: "(red,green,blue)"
    @Expose
    public String armorColor;

    //null if this item has no lore
    @Expose
    public String addedLore;
    //Minecraft block/item ID + optional data value, pre-flattening. Format: "ID:DV"
    @Expose
    public String material;

    //never, lootchest, or dungeon
    @Expose
    public String dropType;

    //Untradeable, untradeable, or Quest Item
    @Expose
    public String restrictions;


    @Expose
    public String damage;
    @Expose
    public String fireDamage;
    @Expose
    public String waterDamage;
    @Expose
    public String airDamage;
    @Expose
    public String thunderDamage;
    @Expose
    public String earthDamage;

    //SUPER_SLOW, VERY_SLOW, SLOW, NORMAL, FAST, VERY_FAST, or SUPER_FAST
    @Expose
    public String attackSpeed;

    @Expose
    public float health;
    @Expose
    public float fireDefense;
    @Expose
    public float waterDefense;
    @Expose
    public float airDefense;
    @Expose
    public float thunderDefense;
    @Expose
    public float earthDefense;

    @Expose
    public int level;

    //null if no quest is required
    @Expose
    public String quest;

    //Assassin, Archer, Warrior, Mage, or null if no class is required
    @Expose
    public String classRequirement;

    @Expose
    public float strength;
    @Expose
    public float dexterity;
    @Expose
    public float intelligence;
    @Expose
    public float agility;
    @Expose
    public float defense;

    @Expose
    public float healthRegen;
    @Expose
    public float manaRegen;
    @Expose
    public float spellDamage;
    @Expose
    public float damageBonus;
    @Expose
    public float lifeSteal;
    @Expose
    public float manaSteal;
    @Expose
    public float xpBonus;
    @Expose
    public float lootBonus;
    @Expose
    public float reflection;

    @Expose
    public float strengthPoints;
    @Expose
    public float dexterityPoints;
    @Expose
    public float intelligencePoints;
    @Expose
    public float agilityPoints;
    @Expose
    public float defensePoints;

    @Expose
    public float thorns;
    @Expose
    public float exploding;
    @Expose
    public float speed;
    @Expose
    public float attackSpeedBonus;
    @Expose
    public float poison;
    @Expose
    public float healthBonus;
    @Expose
    public float soulPoints;
    @Expose
    public float emeraldStealing;

    @Expose
    public float healthRegenRaw;
    @Expose
    public float spellDamageRaw;
    @Expose
    public float damageBonusRaw;

    @Expose
    public float bonusFireDamage;
    @Expose
    public float bonusWaterDamage;
    @Expose
    public float bonusAirDamage;
    @Expose
    public float bonusThunderDamage;
    @Expose
    public float bonusEarthDamage;

    @Expose
    public float bonusFireDefense;
    @Expose
    public float bonusWaterDefense;
    @Expose
    public float bonusAirDefense;
    @Expose
    public float bonusThunderDefense;
    @Expose
    public float bonusEarthDefense;

    //Ring, Bracelet, Necklace, necklace, ring
    @Expose
    public String accessoryType;
    @Expose
    public boolean identified;

    //armor, weapon, or accessory
    @Expose
    public String category;

    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }
}
