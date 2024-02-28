package fr.silenthill99.arcadia_mod.init;

import fr.silenthill99.arcadia_mod.Main;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class DimensionInit {
    public static final RegistryKey<World> EXAMPLE_DIMENSION_WORLD = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(Main.MODID, "example_dimension"));
}
