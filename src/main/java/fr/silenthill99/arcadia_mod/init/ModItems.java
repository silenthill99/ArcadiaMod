package fr.silenthill99.arcadia_mod.init;

import fr.silenthill99.arcadia_mod.Main;
import fr.silenthill99.arcadia_mod.utils.CustomArmorMaterials;
import fr.silenthill99.arcadia_mod.utils.CustomItemTiers;
import fr.silenthill99.arcadia_mod.utils.ModItemGroups;
import fr.silenthill99.arcadia_mod.utils.ModSoundEvents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);
    //public static final DeferredRegister<Potion> POTION = DeferredRegister.create(ForgeRegistries.POTIONS, Main.MODID);

    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", ()->new Item(new Item.Properties().tab(ModItemGroups.ArcadiaModMinerais)));
    public static final RegistryObject<Item> URANIUM_STICK = ITEMS.register("uranium_stick", ()->new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> AKU_AKU = ITEMS.register("aku_aku", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> VERENIUM_INGOT = ITEMS.register("verenium_ingot", () -> new Item(new Item.Properties().tab(ModItemGroups.ArcadiaModMinerais)));
    public static final RegistryObject<Item> CUP = ITEMS.register("cup", () -> new Item(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> RUBY_GEM = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(ModItemGroups.ArcadiaModMinerais)));
    public static final RegistryObject<Item> LEAD = ITEMS.register("lead", () -> new Item(new Item.Properties().tab(ModItemGroups.ArcadiaModMinerais)));
    public static final RegistryObject<Item> TITANIUM = ITEMS.register("titanium", () -> new Item(new Item.Properties().tab(ModItemGroups.ArcadiaModMinerais)));
    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot", () -> new Item(new Item.Properties().tab(ModItemGroups.ArcadiaModMinerais)));
    public static final RegistryObject<Item> VERE_PEARL = ITEMS.register("vere_pearl", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS).stacksTo(1)));
    public static final RegistryObject<Item> TABOURET = ITEMS.register("tabouret", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> PART_OF_VERENIUM_BLOCK = ITEMS.register("part_of_verenium_block", () -> new Item(new Item.Properties().tab(ModItemGroups.ArcadiaModMinerais)));

    //Dynamites
    public static final RegistryObject<Item> VERENIUM_DYNAMITE = ITEMS.register("verenium_dynamite", () -> new Item(new Item.Properties().tab(ModItemGroups.ArcadiaModDynamite)){
        @Override
        public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
            player.sendMessage(ITextComponent.nullToEmpty("Essai"), player.getUUID());
            return super.use(world, player, hand);
        }
    });

    //Armes
    public static final RegistryObject<Item> URANIUM_SWORD = ITEMS.register("uranium_sword", () -> new SwordItem(CustomItemTiers.URANIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> URANIUM_PICKAXE = ITEMS.register("uranium_pickaxe", () -> new PickaxeItem(CustomItemTiers.URANIUM, 1, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> URANIUM_AXE = ITEMS.register("uranium_axe", () -> new AxeItem(CustomItemTiers.URANIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> URANIUM_HOE = ITEMS.register("uranium_hoe", () -> new HoeItem(CustomItemTiers.URANIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> URANIUM_SHOVEL = ITEMS.register("uranium_shovel", () -> new ShovelItem(CustomItemTiers.URANIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));

    public static final RegistryObject<Item> VERENIUM_PICKAXE = ITEMS.register("verenium_pickaxe", () -> new PickaxeItem(CustomItemTiers.VERENIUM, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> VERENIUM_AXE = ITEMS.register("verenium_axe", () -> new AxeItem(CustomItemTiers.VERENIUM, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> VERENIUM_SHOVEL = ITEMS.register("verenium_shovel", () -> new ShovelItem(CustomItemTiers.VERENIUM, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> VERENIUM_SWORD = ITEMS.register("verenium_sword", () -> new SwordItem(CustomItemTiers.VERENIUM, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> VERENIUM_HOE = ITEMS.register("verenium_hoe", () -> new HoeItem(CustomItemTiers.VERENIUM, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(CustomItemTiers.RUBY,0,0,new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(CustomItemTiers.RUBY,0,0,new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(CustomItemTiers.RUBY,0,0,new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(CustomItemTiers.RUBY,0,0,new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(CustomItemTiers.RUBY,0,0,new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));

    public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register("lead_pickaxe", () -> new PickaxeItem(CustomItemTiers.LEAD, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> LEAD_AXE = ITEMS.register("lead_axe", () -> new AxeItem(CustomItemTiers.LEAD, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> LEAD_SWORD = ITEMS.register("lead_sword", () -> new SwordItem(CustomItemTiers.LEAD, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> LEAD_SHOVEL = ITEMS.register("lead_shovel", () -> new ShovelItem(CustomItemTiers.LEAD, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> LEAD_HOE = ITEMS.register("lead_hoe", () -> new HoeItem(CustomItemTiers.LEAD, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", () -> new PickaxeItem(CustomItemTiers.TITANIUM, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", () -> new AxeItem(CustomItemTiers.TITANIUM, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () -> new ShovelItem(CustomItemTiers.TITANIUM, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe", () -> new HoeItem(CustomItemTiers.TITANIUM, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", () -> new PickaxeItem(CustomItemTiers.TITANIUM, 0, 0, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));

    public static final RegistryObject<Item> CHROMIUM_PICKAXE = ITEMS.register("chromium_pickaxe", () -> new PickaxeItem(CustomItemTiers.CHROMIUM, 2, 2, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> CHROMIUM_AXE = ITEMS.register("chromium_axe", () -> new AxeItem(CustomItemTiers.CHROMIUM, 2, 2, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> CHROMIUM_SWORD = ITEMS.register("chromium_sword", () -> new SwordItem(CustomItemTiers.CHROMIUM, 2, 2, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> CHROMIUM_SHOVEL = ITEMS.register("chromium_shovel", () -> new ShovelItem(CustomItemTiers.CHROMIUM, 2, 2, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    public static final RegistryObject<Item> CHROMIUM_HOE = ITEMS.register("chromium_hoe", () -> new HoeItem(CustomItemTiers.CHROMIUM, 2, 2, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));

    public static final RegistryObject<Item> SHACK_SWORD = ITEMS.register("shack_sword", () -> new SwordItem(CustomItemTiers.SHACK_SWORD, 2, 2, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModOutils)));
    //Armures
    public static final RegistryObject<Item> URANIUM_HELMET = ITEMS.register("uranium_helmet", () -> new ArmorItem(CustomArmorMaterials.URANIUM_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> URANIUM_CHESTPLATE = ITEMS.register("uranium_chestplate", () -> new ArmorItem(CustomArmorMaterials.URANIUM_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> URANIUM_LEGGINGS = ITEMS.register("uranium_leggings", () -> new ArmorItem(CustomArmorMaterials.URANIUM_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> URANIUM_BOOTS = ITEMS.register("uranium_boots", () -> new ArmorItem(CustomArmorMaterials.URANIUM_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));

    public static final RegistryObject<Item> VERENIUM_HELMET = ITEMS.register("verenium_helmet", () -> new ArmorItem(CustomArmorMaterials.VERENIUM_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> VERENIUM_CHESTPLATE = ITEMS.register("verenium_chestplate", () -> new ArmorItem(CustomArmorMaterials.VERENIUM_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> VERENIUM_LEGGINGS = ITEMS.register("verenium_leggings", () -> new ArmorItem(CustomArmorMaterials.VERENIUM_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> VERENIUM_BOOTS = ITEMS.register("verenium_boots", () -> new ArmorItem(CustomArmorMaterials.VERENIUM_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(CustomArmorMaterials.RUBY_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(CustomArmorMaterials.RUBY_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(CustomArmorMaterials.RUBY_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(CustomArmorMaterials.RUBY_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));

    public static final RegistryObject<Item> LEAD_HELMET = ITEMS.register("lead_helmet", () -> new ArmorItem(CustomArmorMaterials.LEAD_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> LEAD_CHESTPLATE = ITEMS.register("lead_chestplate", () -> new ArmorItem(CustomArmorMaterials.LEAD_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> LEAD_LEGGINGS = ITEMS.register("lead_leggings", () -> new ArmorItem(CustomArmorMaterials.LEAD_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> LEAD_BOOTS = ITEMS.register("lead_boots", () -> new ArmorItem(CustomArmorMaterials.LEAD_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));

    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet", () -> new ArmorItem(CustomArmorMaterials.TITANIUM_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate", () -> new ArmorItem(CustomArmorMaterials.TITANIUM_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings", () -> new ArmorItem(CustomArmorMaterials.TITANIUM_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> TITANIMU_BOOTS = ITEMS.register("titanium_boots", () -> new ArmorItem(CustomArmorMaterials.TITANIUM_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));

    public static final RegistryObject<Item> CHROMIUM_HELMET = ITEMS.register("chromium_helmet", () -> new ArmorItem(CustomArmorMaterials.CHROMIUM_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> CHROMIUM_CHESTPLATE = ITEMS.register("chromium_chestplate", () -> new ArmorItem(CustomArmorMaterials.CHROMIUM_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> CHROMIUM_LEGGINGS = ITEMS.register("chromium_leggings", () -> new ArmorItem(CustomArmorMaterials.CHROMIUM_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));
    public static final RegistryObject<Item> CHROMIUM_BOOTS = ITEMS.register("chromium_boots", () -> new ArmorItem(CustomArmorMaterials.CHROMIUM_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroups.ArcadiaModArmor)));

    //Armes 2
    public static final RegistryObject<Item> BAZOOKA = ITEMS.register("bazooka", () -> new Item(new Item.Properties().tab(ModItemGroups.ArcadiaModWeapons).stacksTo(1)));

    //Nourriture
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.ArcadiaModFood)
            .food(new Food.Builder().nutrition(6).saturationMod(0.8f).build())));

    public static final RegistryObject<Item> BANANA_JUICE = ITEMS.register("banana_juice", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.ArcadiaModFood)
            .food(new Food.Builder().nutrition(6).saturationMod(0.8f).build()))
    {
        @Override
        public UseAction getUseAnimation(ItemStack p_77661_1_) {
            return UseAction.DRINK;
        }
    });
    public static final RegistryObject<Item> OATS = ITEMS.register("oats", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.ArcadiaModFood)
            .food(new Food.Builder().nutrition(1).saturationMod(0.1f).fast().build())));

    //Disques
    public static final RegistryObject<Item> ON_M_APPELLE_FUZE_III = ITEMS.register("on_m_appelle_fuze_iii", () -> new MusicDiscItem(1, ModSoundEvents.ON_M_APPELLE_FUZE_III, new Item.Properties().tab(ModItemGroups.ArcadiaModMusic).stacksTo(1)));
    public static final RegistryObject<Item> ANTI_ANTI_FUZE = ITEMS.register("anti_anti_fuze", () -> new MusicDiscItem(1, ModSoundEvents.ANTI_ANTI_FUZE, new Item.Properties().tab(ModItemGroups.ArcadiaModMusic).stacksTo(1)));
    public static final RegistryObject<Item> LA_ROULETTE_PALADIENNE = ITEMS.register("la_roulette_paladienne", () -> new MusicDiscItem(1, ModSoundEvents.LA_ROULETTE_PALADIENNE, new Item.Properties().tab(ModItemGroups.ArcadiaModMusic).stacksTo(1)));
    public static final RegistryObject<Item> KING_S_CASTLE = ITEMS.register("king_s_castle", () -> new MusicDiscItem(1, ModSoundEvents.KING_S_CASTLE, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModMusic)));
    public static final RegistryObject<Item> EPIC_FANTASY = ITEMS.register("epic-fantasy", () -> new MusicDiscItem(1, ModSoundEvents.EPIC_FANTASY, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModMusic)));
    public static final RegistryObject<Item> DEAD_FOREST = ITEMS.register("dead-forest", () -> new MusicDiscItem(1, ModSoundEvents.DEAD_FOREST, new Item.Properties().stacksTo(1).tab(ModItemGroups.ArcadiaModMusic)));
    public static final RegistryObject<Item> BLACK_MASS = ITEMS.register("black-mass", () -> new MusicDiscItem(1, ModSoundEvents.BLACK_MASS, new Item.Properties().tab(ModItemGroups.ArcadiaModMusic).stacksTo(1)));

    /**
    @SubscribeEvent
    public static void registerPotions(final RegistryEvent.Register<Potion> event) {
        event.getRegistry().registerAll
        (
            PotionList.more_health_potion = new Potion(new EffectInstance(PotionList.more_health_effect, 3600)).setRegistryName("more_health")
        );
    }

    @SubscribeEvent
    public static void registerEffects(final RegistryEvent.Register<Effect> event) {
        event.getRegistry().registerAll
        (
            PotionList.more_health_effect = new PotionList.MoreHealthEffect(EffectType.BENEFICIAL, 0xd4ff00).addAttributeModifier(Shared).setRegistryName("more_health")
        );
    }
    **/
    //Oeufs
    public static final RegistryObject<ForgeSpawnEggItem> REDSTONE_GOLEM_SPAWN_EGG = ITEMS.register("redstone_golem_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.REDSTONE_GOLEM, 0x808080, 0x800000, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<ForgeSpawnEggItem> CYCLOPS_SPAWN_EGG = ITEMS.register("cyclops_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.CYCLOPS, 0x663300, 0x006400, new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
}