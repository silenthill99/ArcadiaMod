package fr.silenthill99.arcadia_mod.utils;

import fr.silenthill99.arcadia_mod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum CustomItemTiers implements IItemTier {
    URANIUM(7, 420, 4.8f, 3f, 20, new LazyValue<>(() -> Ingredient.of(ModItems.URANIUM_INGOT.get()))),
    VERENIUM(8, 4062, 18.0f, 8f, 30, new LazyValue<>(() -> Ingredient.of(ModItems.VERENIUM_INGOT.get()))),
    RUBY(3,375,9f,3f,21, new LazyValue<>(() -> Ingredient.of(ModItems.RUBY_GEM.get()))),
    LEAD(6, 3122, 16f, 6f, 20, new LazyValue<>(() -> Ingredient.of(ModItems.LEAD.get()))),
    TITANIUM(5, 2342, 12f, 4.5f, 15, new LazyValue<>(() -> Ingredient.of(ModItems.TITANIUM.get()))),
    CHROMIUM(2, 250, 6.0f, 2.0f, 14, new LazyValue<>(() -> Ingredient.of(ModItems.CHROMIUM_INGOT.get()))),
    SHACK_SWORD(12, 1561*4, 32.0F, 12.0F, 40, new LazyValue<>(() -> Ingredient.of(Items.DIAMOND)));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    CustomItemTiers(int level, int uses, float speed, float damage, int enchantmentValue, LazyValue<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
