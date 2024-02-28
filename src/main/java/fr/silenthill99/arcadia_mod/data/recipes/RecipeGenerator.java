package fr.silenthill99.arcadia_mod.data.recipes;

import fr.silenthill99.arcadia_mod.Main;
import fr.silenthill99.arcadia_mod.init.ModBlocks;
import fr.silenthill99.arcadia_mod.init.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider
{
    public RecipeGenerator(DataGenerator p_i48262_1_)
    {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer)
    {
        ShapedRecipeBuilder.shaped(ModItems.AKU_AKU.get())
                .pattern("000")
                .pattern("010")
                .pattern("000")
                .define('0', ItemTags.PLANKS)
                .define('1', Items.FEATHER)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(Items.FEATHER))
                .unlockedBy("unlock_2", has(ItemTags.PLANKS))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.BANANA_JUICE.get())
                .requires(ModItems.BANANA.get())
                .requires(ModItems.CUP.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.BANANA.get(), ModItems.CUP.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.BAZOOKA.get())
                .pattern("000")
                .pattern("010")
                .pattern("000")
                .define('0', ModItems.PART_OF_VERENIUM_BLOCK.get())
                .define('1', Blocks.TNT)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.PART_OF_VERENIUM_BLOCK.get(), Blocks.TNT))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.RUBY_BOOTS.get())
                .pattern("0 0")
                .pattern("0 0")
                .define('0', ModItems.RUBY_GEM.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.RUBY_GEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.CHROMIUM_AXE.get())
                .pattern("00")
                .pattern("01")
                .pattern(" 1")
                .define('0', ModItems.CHROMIUM_INGOT.get())
                .define('1', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.CHROMIUM_INGOT.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.CHROMIUM_BLOCK.get())
                .pattern("000")
                .pattern("000")
                .pattern("000")
                .define('0', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.CHROMIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.CHROMIUM_BOOTS.get())
                .pattern("0 0")
                .pattern("0 0")
                .define('0', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.CHROMIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.CHROMIUM_CHESTPLATE.get())
                .pattern("0 0")
                .pattern("000")
                .pattern("000")
                .define('0', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.CHROMIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.CHROMIUM_HELMET.get())
                .pattern("000")
                .pattern("0 0")
                .define('0', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.CHROMIUM_INGOT.get()))
                .save(consumer);
    }
}