package fr.silenthill99.arcadia_mod.utils;

import fr.silenthill99.arcadia_mod.Main;
import fr.silenthill99.arcadia_mod.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum CustomArmorMaterials implements IArmorMaterial {

    URANIUM_ARMOR(Main.MODID + ":uranium",18, new int[]{2, 5, 7, 3}, 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.of(ModItems.URANIUM_INGOT.get())),
    VERENIUM_ARMOR(Main.MODID+":verenium", 74, new int[]{10, 10, 10, 10}, 30, SoundEvents.ARMOR_EQUIP_IRON,0.0f,0.0f, () -> Ingredient.of(ModItems.VERENIUM_INGOT.get())),
    RUBY_ARMOR(Main.MODID+":ruby", 23, new int[]{3, 8, 9, 3}, 14, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.of(ModItems.RUBY_GEM.get())),
    LEAD_ARMOR(Main.MODID+":lead", 66, new int[]{6, 12, 16, 6}, 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(ModItems.LEAD.get())),
    TITANIUM_ARMOR(Main.MODID+":titanium", 50, new int[]{5,9,12,5}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(ModItems.TITANIUM.get())),
    CHROMIUM_ARMOR(Main.MODID+":chromium", 30, new int[]{5,5,5,5}, 14, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.of(ModItems.CHROMIUM_INGOT.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    CustomArmorMaterials(String name, int durability, int[] slotProtection, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durability;
        this.slotProtections = slotProtection;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return HEALTH_PER_SLOT[p_200896_1_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.slotProtections[p_200902_1_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
