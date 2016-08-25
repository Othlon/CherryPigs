package com.github.othlon.cherrypigs.proxies;/*
 * Created by Jen on 24-Aug-16.
 */

import com.github.othlon.cherrypigs.CherryPigs;
import com.github.othlon.cherrypigs.Conpig;
import com.github.othlon.cherrypigs.blocks.PigsBlocks;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import java.io.File;

public class CommonProxy {

    // Config instance
    public static Configuration conpig;

    public void preInit(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        conpig = new Configuration(new File(directory.getPath(), "cherrypigs.cfg"));
        Conpig.readConpig();


        // Initialization of blocks and items typically goes here:
        PigsBlocks.init();

        //PigsItems.init();
        // ModEntities.init();
        // ModDimensions.init();

        //MainCompatHandler.registerWaila();
        //MainCompatHandler.registerTOP();

    }

    public void init(FMLInitializationEvent e)
    {
       //NetworkRegistry.INSTANCE.registerGuiHandler(CherryPigs.instance, new GuiProxy());
    }

    public void postInit(FMLPostInitializationEvent e)
    {
      if (conpig.hasChanged()) {
           conpig.save();
       }
    }
}