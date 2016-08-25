package com.github.othlon.cherrypigs.blocks;/*
 * Created by Jen on 25-Aug-16.
 */

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PigsBlocks {


    public static PigsCherryLog cherryLog;

    public static void init() {
        cherryLog = new PigsCherryLog(Material.WOOD);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {


    }

    @SideOnly(Side.CLIENT)
    public static void initItemModels() {
        //bakedModelBlock.initItemModel();
    }
}
