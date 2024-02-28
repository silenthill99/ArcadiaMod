package fr.silenthill99.arcadia_mod.blocks;

import fr.silenthill99.arcadia_mod.tileentity.TileEntityRedBlock;
import fr.silenthill99.arcadia_mod.utils.ModSoundEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class BlockRed extends Block {
    public BlockRed() {
        super(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops().strength(6f));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new TileEntityRedBlock();
    }

    @Override
    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {

        if(worldIn.getBlockEntity(pos) instanceof TileEntityRedBlock)
        {
            TileEntityRedBlock te = (TileEntityRedBlock) worldIn.getBlockEntity(pos);
            player.displayClientMessage(new StringTextComponent("Counter : " + te.getCounter()), true);
            worldIn.playSound(null, pos, ModSoundEvents.ON_M_APPELLE_FUZE_III.get(), SoundCategory.MASTER,1,1);
            return ActionResultType.SUCCESS;
        }

        return ActionResultType.PASS;
    }

}
