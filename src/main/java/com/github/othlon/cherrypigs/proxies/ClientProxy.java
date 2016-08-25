package com.github.othlon.cherrypigs.proxies;/*
 * Created by Jen on 24-Aug-16.
 */

import com.github.othlon.cherrypigs.CherryPigs;
import com.github.othlon.cherrypigs.blocks.PigsBlocks;
import com.github.othlon.cherrypigs.blocks.PigsCherryLog;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.LoaderState;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static net.minecraftforge.common.MinecraftForge.*;

public class ClientProxy extends com.github.othlon.cherrypigs.proxies.CommonProxy {

        @Override
        public void preInit(FMLPreInitializationEvent pigEvent) {
            super.preInit(pigEvent);

            OBJLoader.INSTANCE.addDomain(CherryPigs.MODID);
            //ModelLoaderRegistry.registerLoader(new BakedModelLoader());

            // Typically initialization of models and such goes here:
            PigsBlocks.init();
            //PigsItems.initModels();
            //PigsEntities.initModels();
        }

        @Override
        public void init(FMLInitializationEvent pigEvent) {
            super.init(pigEvent);

            // Initialize our input handler so we can listen to keys
            //EVENT_BUS.register(new InputHandler());

        }
}
