package com.asyncronous.exo.items;

import com.asyncronous.exo.EXO;
import com.asyncronous.exo.items.armour.ItemEXOArmourBoots;
import com.asyncronous.exo.items.armour.ItemEXOArmourChest;
import com.asyncronous.exo.items.armour.ItemEXOArmourHelm;
import com.asyncronous.exo.items.armour.ItemEXOArmourLeggings;
import com.asyncronous.exo.items.core.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class EXOItems{
    private static EXOItems instance;

    public static final Item ITEM_ASSASSIN_CORE = new ItemAssassinCore();
    public static final Item ITEM_BERZERKER_CORE = new ItemBerzerkerCore();
    public static final Item ITEM_BULLDOZER_CORE = new ItemBulldozerCore();
    public static final Item ITEM_EMPTY_CORE = new ItemEmptyCore();
    public static final Item ITEM_FROST_CORE = new ItemFrostCore();
    public static final Item ITEM_GHOST_CORE = new ItemGhostCore();
    public static final Item ITEM_INFERNAL_CORE = new ItemInfernalCore();
    public static final Item ITEM_MYSTIC_CORE = new ItemMysticCore();
    public static final Item ITEM_RECON_CORE = new ItemReconCore();
    public static final Item ITEM_REFLEX_CORE = new ItemReflexCore();
    public static final Item ITEM_SKYBOUND_CORE = new ItemSkyboundCore();

    public static final Item ITEM_ARMOUR_HELMET = new ItemEXOArmourHelm();
    public static final Item ITEM_ARMOUR_CHEST = new ItemEXOArmourChest();
    public static final Item ITEM_ARMOUR_LEGGINGS = new ItemEXOArmourLeggings();
    public static final Item ITEM_ARMOUR_BOOTS = new ItemEXOArmourBoots();

    private EXOItems(){}

    public static EXOItems getInstance(){
        return instance == null ? instance = new EXOItems() : instance;
    }

    public void registerItems(){
        this.register(EXOItems.ITEM_ASSASSIN_CORE, "assassinCore");
        this.register(EXOItems.ITEM_BERZERKER_CORE, "berzerkerCore");
        this.register(EXOItems.ITEM_BULLDOZER_CORE, "bulldozerCore");
        this.register(EXOItems.ITEM_EMPTY_CORE, "emptyCore");
        this.register(EXOItems.ITEM_FROST_CORE, "frostCore");
        this.register(EXOItems.ITEM_GHOST_CORE, "ghostCore");
        this.register(EXOItems.ITEM_INFERNAL_CORE, "infernalCore");
        this.register(EXOItems.ITEM_MYSTIC_CORE, "mysticCore");
        this.register(EXOItems.ITEM_RECON_CORE, "reconCore");
        this.register(EXOItems.ITEM_REFLEX_CORE, "reflexCore");
        this.register(EXOItems.ITEM_SKYBOUND_CORE, "skyboundCore");

        this.register(EXOItems.ITEM_ARMOUR_HELMET, "helmet");
        this.register(EXOItems.ITEM_ARMOUR_CHEST, "chestplate");
        this.register(EXOItems.ITEM_ARMOUR_LEGGINGS, "leggings");
        this.register(EXOItems.ITEM_ARMOUR_BOOTS, "boots");
    }

    public void register(Item item, String uid){
        GameRegistry.registerItem(item, "exo:" + uid, EXO.MOD_ID);
    }
}