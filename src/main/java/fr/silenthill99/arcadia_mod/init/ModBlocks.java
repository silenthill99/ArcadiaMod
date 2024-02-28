package fr.silenthill99.arcadia_mod.init;

import fr.silenthill99.arcadia_mod.Main;
import fr.silenthill99.arcadia_mod.blocks.BlockRed;
import fr.silenthill99.arcadia_mod.blocks.DisplayCase;
import fr.silenthill99.arcadia_mod.blocks.OatsBlock;
import fr.silenthill99.arcadia_mod.blocks.VereniumBlock;
import fr.silenthill99.arcadia_mod.blocks.Container;
import fr.silenthill99.arcadia_mod.utils.ModItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    public static final RegistryObject<Block> URANIUM_BLOCK = createBlock("uranium_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(7).requiresCorrectToolForDrops().strength(6f)), ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> RED_BLOCK = createBlock("red_block", BlockRed::new, null);
    //Ici, le .strenght() = .hardnessAndResistance()
    public static final RegistryObject<Block> URANIUM_ORE = createBlock("uranium_ore", ()-> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3f, 15f).requiresCorrectToolForDrops()), ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> VERENIUM_ORE = createBlock("verenium_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(6f, 15f).requiresCorrectToolForDrops().harvestLevel(3)), ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> VERENIUM_BLOCK = createBlock("verenium_block", VereniumBlock::new, ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> RUBY_ORE = createBlock("ruby_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(4f,10f).requiresCorrectToolForDrops().harvestLevel(2)), ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> RUBY_BLOCK = createBlock("ruby_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(4f,10f).requiresCorrectToolForDrops().harvestLevel(2)), ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> LEAD_ORE  = createBlock("lead_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(6f, 15f).harvestLevel(2).requiresCorrectToolForDrops()), ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> LEAD_BLOCK = createBlock("lead_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(6f,15f).harvestLevel(2).requiresCorrectToolForDrops()), ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> TITANIUM_ORE = createBlock("titanium_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(8f, 10f).harvestLevel(2).requiresCorrectToolForDrops()), ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> TITANIUM_BLOCK = createBlock("titanium_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(8f, 10f).harvestLevel(2).requiresCorrectToolForDrops()), ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> CHROMIUM_ORE = createBlock("chromium_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(7f,12.5f).harvestLevel(2).requiresCorrectToolForDrops()), ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> CHROMIUM_BLOCK = createBlock("chromium_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(7f, 12.5f).harvestLevel(2).requiresCorrectToolForDrops()), ModItemGroups.ArcadiaModMinerais);
    public static final RegistryObject<Block> OATS = createBlock("oats_crop", () -> new OatsBlock(AbstractBlock.Properties.copy(Blocks.WHEAT)), ItemGroup.TAB_MATERIALS);
    public static final RegistryObject<Block> OCTORIUM = createBlock("octorium_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(8f, 10f).requiresCorrectToolForDrops()), ModItemGroups.ArcadiaModMinerais);
    //Le bloc juste en dessous est juste un bloc de test
    public static final RegistryObject<Block> DISPLAY_CASE = createBlock("display_case", DisplayCase::new, ItemGroup.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> CONTAINER = createBlock("container", Container::new, ItemGroup.TAB_BUILDING_BLOCKS);

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier, ItemGroup group) {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(group)));
        return block;
    }
}
