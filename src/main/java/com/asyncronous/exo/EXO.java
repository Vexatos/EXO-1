package com.asyncronous.exo;

import com.asyncronous.exo.blocks.EXOBlocks;
import com.asyncronous.exo.items.EXOItems;
import com.asyncronous.exo.server.ServerProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = EXO.MOD_ID, name = EXO.MOD_NAME, version = EXO.MOD_VERSION)
public final class EXO {
    public static final String MOD_ID = "EXO";
    public static final String MOD_NAME = "Exoskeleton";
    public static final String MOD_VERSION = "0.0.0";

    @SidedProxy(clientSide = "com.asyncronous.exo.client.ClientProxy", serverSide = "com.asyncronous.exo.server.ServerProxy")
    public static ServerProxy proxy;

    @Mod.Instance(EXO.MOD_ID)
    public static EXO instance;

    public static final Logger LOGGER = LogManager.getLogger(EXO.class.getSimpleName());
    public static final CreativeTabs TAB = new CreativeTabs("exo") {
        @Override
        public Item getTabIconItem() {
            return EXOItems.ITEM_ASSASSIN_CORE;
        }
    };

    @Mod.EventHandler()
    public void preInit(FMLPreInitializationEvent event) {
        EXO.LOGGER.info("Pre-Initializing");

        EXO.LOGGER.info("Registering Items & Blocks");
        EXOItems.getInstance().registerItems();
        EXOBlocks.getInstance().registerBlocks();
    }

    @Mod.EventHandler()
    public void init(FMLInitializationEvent event) {
        EXO.LOGGER.info("Initializing");
    }

    @Mod.EventHandler()
    public void postInit(FMLPostInitializationEvent event) {
        EXO.LOGGER.info("Post-Initializing");
    }

    @Mod.EventHandler()
    public void serverStarting(FMLServerStartingEvent event) {
        EXO.LOGGER.info("Server-Starting");
    }
}