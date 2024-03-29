package fr.silenthill99.arcadia_mod.world.biome;

import fr.silenthill99.arcadia_mod.Main;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class ModConfiguredSurfaceBuilders {

    public static ConfiguredSurfaceBuilder<?> RIFT_SURFACE = register("rift_surface",
            SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                    Blocks.REDSTONE_BLOCK.defaultBlockState(),
                    Blocks.STONE.defaultBlockState(),
                    Blocks.RED_CONCRETE.defaultBlockState()
            )));

    private static <SC extends ISurfaceBuilderConfig>ConfiguredSurfaceBuilder<SC> register(String name,
                                                                                           ConfiguredSurfaceBuilder<SC> csb){
        return WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER,
                new ResourceLocation(Main.MODID, name), csb);
    }

}
