package com.github.othlon.cherrypigs.blocks;/*
 * Created by Jen on 25-Aug-16.
 */

import com.github.othlon.cherrypigs.CherryPigs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PigsCherryLog extends Block {



    public PigsCherryLog(Material pigMat)
    {
        super(Material.WOOD);

        //used for localization (en_US.lang)
        setUnlocalizedName(CherryPigs.MODID + ".cherrylog");

        // The unique name (within your mod) that identifies this block
        setRegistryName("cherrylog");

        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());

    }
}
