package fr.silenthill99.arcadia_mod.init.entities.cyclops;

import fr.silenthill99.arcadia_mod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CyclopsRenderer extends MobRenderer<Cyclops, CyclopsModel<Cyclops>>
{

    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entity/cyclops.png");

    public CyclopsRenderer(EntityRendererManager manager)
    {
        super(manager, new CyclopsModel<>(), 3.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(Cyclops p_110775_1_)
    {
        return TEXTURE;
    }
}
