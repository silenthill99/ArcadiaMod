package fr.silenthill99.arcadia_mod.blocks;

import fr.silenthill99.arcadia_mod.world.dimension.KJTeleporter;
import fr.silenthill99.arcadia_mod.world.dimension.ModDimensions;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

public class VereniumBlock extends Block {
    public VereniumBlock() {
        super(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(6f, 15f).requiresCorrectToolForDrops().harvestLevel(3));
    }

    @Override
    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isClientSide()) {
            if (!player.isCrouching()) {
                MinecraftServer server = worldIn.getServer();

                if (server != null) {
                    if (worldIn.dimension() == ModDimensions.KJDim) {
                        ServerWorld overWorld = server.getLevel(World.OVERWORLD);
                        if (overWorld != null) {
                            player.changeDimension(overWorld, new KJTeleporter(pos, false));
                        }
                    } else {
                        ServerWorld kjDim = server.getLevel(ModDimensions.KJDim);
                        if (kjDim != null) {
                            player.changeDimension(kjDim, new KJTeleporter(pos, true));
                        }
                    }
                    return ActionResultType.SUCCESS;
                }
            }
        }

        return super.use(state, worldIn, pos, player, handIn, hit);
    }
}
