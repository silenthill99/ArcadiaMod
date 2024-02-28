package fr.silenthill99.arcadia_mod.world.dimension;

import fr.silenthill99.arcadia_mod.Main;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class ModDimensions {
    public static RegistryKey<World> KJDim = RegistryKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(Main.MODID, "example_dimension"));
}
