package fr.silenthill99.arcadia_mod.init.entities.redstonegolem;// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class RedstoneGolemModel<T extends RedstoneGolem> extends EntityModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer arm0;
	private final ModelRenderer arm1;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;

	public RedstoneGolemModel() {
		texWidth = 128;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(0.0F, -7.0F, 0.0F);
		body.texOffs(0, 40).addBox(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, 0.0F, false);
		body.texOffs(0, 70).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, -2.0F);
		body.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		head.texOffs(24, 0).addBox(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		arm0 = new ModelRenderer(this);
		arm0.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(arm0);
		arm0.texOffs(60, 21).addBox(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F, false);

		arm1 = new ModelRenderer(this);
		arm1.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(arm1);
		arm1.texOffs(60, 58).addBox(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setPos(-4.0F, 18.0F, 0.0F);
		body.addChild(leg0);
		leg0.texOffs(37, 0).addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setPos(5.0F, 18.0F, 0.0F);
		body.addChild(leg1);
		leg1.texOffs(60, 0).addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}