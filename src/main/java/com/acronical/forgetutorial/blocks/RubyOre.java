package com.acronical.forgetutorial.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class RubyOre extends OreBlock {
    public RubyOre() {
        super(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 4.0f).sound(SoundType.STONE).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE));
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch){
    return 1;
    }
}
