package fr.silenthill99.arcadia_mod.init;

import fr.silenthill99.arcadia_mod.Main;
import fr.silenthill99.arcadia_mod.init.entities.cyclops.Cyclops;
import fr.silenthill99.arcadia_mod.init.entities.redstonegolem.RedstoneGolem;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Main.MODID);

    public static final RegistryObject<EntityType<RedstoneGolem>> REDSTONE_GOLEM = ENTITY_TYPES.register("redstone_golem", () -> EntityType.Builder.of(RedstoneGolem::new, EntityClassification.MONSTER).sized(2.0f, 3.0f).build(new ResourceLocation(Main.MODID, "redstone_golem").toString()));
    public static final RegistryObject<EntityType<Cyclops>> CYCLOPS = ENTITY_TYPES.register("cyclops", () -> EntityType.Builder.of(Cyclops::new, EntityClassification.MONSTER).sized(4.0f, 5.0f).build(new ResourceLocation(Main.MODID, "cyclops").toString()));
}
