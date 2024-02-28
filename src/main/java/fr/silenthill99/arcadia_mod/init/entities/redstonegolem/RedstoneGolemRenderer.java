package fr.silenthill99.arcadia_mod.init.entities.redstonegolem;

import fr.silenthill99.arcadia_mod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RedstoneGolemRenderer extends MobRenderer<RedstoneGolem, RedstoneGolemModel<RedstoneGolem>> 
{
    public static ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entity/redstonegolem.png");

    public RedstoneGolemRenderer(EntityRendererManager manager) {
        super(manager, new RedstoneGolemModel<>(), 2.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(RedstoneGolem p_110775_1_) {
        return TEXTURE;
    }
}
