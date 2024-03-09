package fr.silenthill99.arcadia_mod.data.loot_tables.blocks;

import fr.silenthill99.arcadia_mod.blocks.OatsBlock;
import fr.silenthill99.arcadia_mod.init.ModBlocks;
import fr.silenthill99.arcadia_mod.init.ModItems;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.item.Item;
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
        cropDrop((OatsBlock) ModBlocks.OATS.get(), 7, ModItems.OATS.get(), ModBlocks.OATS.get().asItem());
//        ILootCondition.IBuilder oats_drop_condition = BlockStateProperty.hasBlockStateProperties(ModBlocks.OATS.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OatsBlock.AGE, 3));
//        add(ModBlocks.OATS.get(), block -> createCropDrops(block, ModItems.OATS.get(), ModBlocks.OATS.get().asItem(), oats_drop_condition));
    }

    private <T extends CropsBlock> void cropDrop(T cropsBlock, int age, Item item1, Item item2) {
        ILootCondition.IBuilder drop_condition = BlockStateProperty.hasBlockStateProperties(cropsBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(T.AGE, age));
        add(cropsBlock, block -> createCropDrops(block, item1, item2, drop_condition));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries()
                .stream()
                .map(RegistryObject::get)
                .collect(Collectors.toList());
    }

}
