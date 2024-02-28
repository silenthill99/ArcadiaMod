package fr.silenthill99.arcadia_mod.init;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModFeatures {

    public ConfiguredFeature<?, ?> URANIUM_ORE_FEATURE;
    public ConfiguredFeature<?,?> VERENIUM_ORE_FEATURE;
    public ConfiguredFeature<?,?> RUBY_ORE_FEATURE;
    private ConfiguredFeature<?,?> LEAD_ORE_FEATURE;
    private ConfiguredFeature<?,?> TITANIUM_ORE_FEATURE;
    private ConfiguredFeature<?,?> CHROMIUM_ORE_FEATURE;

    public void init()
    {
        URANIUM_ORE_FEATURE = register("ore_uranium", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.URANIUM_ORE.get().defaultBlockState(), 6))
        .squared()
        .range(18)
        .count(20));

        VERENIUM_ORE_FEATURE = register("ore_verenium",Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.VERENIUM_ORE.get().defaultBlockState(), 2))
        .squared()
        .range(5)
        .count(1));

        RUBY_ORE_FEATURE = register("ore_ruby",Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.RUBY_ORE.get().defaultBlockState(), 5))
        .squared()
        .range(20)
        .count(10));

        LEAD_ORE_FEATURE = register("ore_lead",Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.LEAD_ORE.get().defaultBlockState(), 4))
        .squared()
        .range(40)
        .count(7));

        TITANIUM_ORE_FEATURE = register("ore_titanium",Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.TITANIUM_ORE.get().defaultBlockState(), 6))
        .squared()
        .range(30)
        .count(9));

        CHROMIUM_ORE_FEATURE = register("ore_chromium",Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.CHROMIUM_ORE.get().defaultBlockState(), 5))
        .squared()
        .range(25)
        .count(12));
    }

    public <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> feature)
    {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, name, feature);
    }

    @SubscribeEvent
    public void biomeloading(BiomeLoadingEvent event)
    {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if(event.getCategory() != Biome.Category.NETHER)
        {
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, URANIUM_ORE_FEATURE);
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, VERENIUM_ORE_FEATURE);
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, RUBY_ORE_FEATURE);
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, LEAD_ORE_FEATURE);
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, TITANIUM_ORE_FEATURE);
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, CHROMIUM_ORE_FEATURE);
        }
    }

}
