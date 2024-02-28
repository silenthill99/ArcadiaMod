package fr.silenthill99.arcadia_mod.data.loot_tables.blocks;

import fr.silenthill99.arcadia_mod.blocks.OatsBlock;
import fr.silenthill99.arcadia_mod.init.ModBlocks;
import fr.silenthill99.arcadia_mod.init.ModItems;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.conditions.BlockStateProperty;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class BlockLootTablesGenerator extends BlockLootTables {
    @Override
    protected void addTables() {
        dropSelf(ModBlocks.URANIUM_BLOCK.get());
        dropSelf(ModBlocks.RED_BLOCK.get());
        dropSelf(ModBlocks.URANIUM_ORE.get());
        dropSelf(ModBlocks.VERENIUM_ORE.get());
        dropSelf(ModBlocks.VERENIUM_BLOCK.get());
        dropSelf(ModBlocks.RUBY_ORE.get());
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.LEAD_ORE.get());
        dropSelf(ModBlocks.LEAD_BLOCK.get());
        dropSelf(ModBlocks.TITANIUM_ORE.get());
        dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        dropSelf(ModBlocks.CHROMIUM_ORE.get());
        dropSelf(ModBlocks.CHROMIUM_BLOCK.get());
        dropSelf(ModBlocks.OCTORIUM.get());
        dropSelf(ModBlocks.DISPLAY_CASE.get());
        dropSelf(ModBlocks.CONTAINER.get());
        dropOther(ModBlocks.OATS.get(), ModItems.OATS.get());
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries()
                .stream()
                .map(RegistryObject::get)
                .collect(Collectors.toList());
    }
}
