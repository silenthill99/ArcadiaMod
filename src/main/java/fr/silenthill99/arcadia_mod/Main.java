package fr.silenthill99.arcadia_mod;


import fr.silenthill99.arcadia_mod.init.ModBlocks;
import fr.silenthill99.arcadia_mod.init.ModEntityTypes;
import fr.silenthill99.arcadia_mod.init.ModFeatures;
import fr.silenthill99.arcadia_mod.init.ModItems;
import fr.silenthill99.arcadia_mod.init.entities.cyclops.Cyclops;
import fr.silenthill99.arcadia_mod.init.entities.cyclops.CyclopsRenderer;
import fr.silenthill99.arcadia_mod.init.entities.redstonegolem.RedstoneGolem;
import fr.silenthill99.arcadia_mod.init.entities.redstonegolem.RedstoneGolemRenderer;
import fr.silenthill99.arcadia_mod.utils.ModSoundEvents;
import fr.silenthill99.arcadia_mod.world.biome.ModBiome;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {

    public static final String MODID = "arcadia_mod";

    public Main()
    {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::entityCreateAttributes);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(bus);
        ModSoundEvents.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModBiome.register(bus);
        ModEntityTypes.ENTITY_TYPES.register(bus);

    }

    private void clientSetup(FMLClientSetupEvent event)
    {
        ModFeatures features = new ModFeatures();
        features.init();
        MinecraftForge.EVENT_BUS.register(features);
        RenderTypeLookup.setRenderLayer(ModBlocks.OATS.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.CONTAINER.get(), RenderType.cutout());
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REDSTONE_GOLEM.get(), RedstoneGolemRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CYCLOPS.get(), CyclopsRenderer::new);
    }


    private void setup(FMLCommonSetupEvent event) {

    }

    private void entityCreateAttributes(EntityAttributeCreationEvent event)
    {
        event.put(ModEntityTypes.REDSTONE_GOLEM.get(), RedstoneGolem.setAttributes().build());
        event.put(ModEntityTypes.CYCLOPS.get(), Cyclops.setAttributes().build());
    }

}
