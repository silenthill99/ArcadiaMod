package fr.silenthill99.arcadia_mod.data;

import fr.silenthill99.arcadia_mod.Main;
import fr.silenthill99.arcadia_mod.data.loot_tables.LootTableGenerator;
import fr.silenthill99.arcadia_mod.data.recipes.RecipeGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new RecipeGenerator(generator));
            generator.addProvider(new LootTableGenerator(generator));
        }
    }
}
