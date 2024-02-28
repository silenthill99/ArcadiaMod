package fr.silenthill99.arcadia_mod.utils;

import fr.silenthill99.arcadia_mod.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
    public static final ItemGroup ArcadiaModMinerais = new ItemGroup("arcadiamod_minerais") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VERENIUM_INGOT.get());
        }
    };

    public static final ItemGroup ArcadiaModFood = new ItemGroup("arcadiamod_food") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BANANA.get());
        }
    };

    public static final ItemGroup ArcadiaModOutils = new ItemGroup("arcadiamod_outils") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VERENIUM_PICKAXE.get());
        }
    };

    public static final ItemGroup ArcadiaModArmor = new ItemGroup("arcadiamod_armor") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VERENIUM_HELMET.get());
        }
    };

    public static final ItemGroup ArcadiaModDynamite = new ItemGroup("arcadiamod_dynamites") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VERENIUM_DYNAMITE.get());
        }
    };

    public static final ItemGroup ArcadiaModMusic = new ItemGroup("arcadiamod_music") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ON_M_APPELLE_FUZE_III.get());
        }
    };

    public static final ItemGroup ArcadiaModWeapons = new ItemGroup("arcadiamod_weapons") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BAZOOKA.get());
        }
    };
}
