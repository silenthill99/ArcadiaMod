package fr.silenthill99.arcadia_mod.init;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Potion;

public class PotionList {
    public static Potion more_health_potion = null;
    public static Effect more_health_effect = null;

    public static class MoreHealthEffect extends Effect{

        public MoreHealthEffect(EffectType typeIn, int liquidColorIn) {
            super(typeIn, liquidColorIn);
        }
    }
}
