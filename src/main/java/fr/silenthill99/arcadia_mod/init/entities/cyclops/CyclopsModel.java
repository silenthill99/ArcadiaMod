package fr.silenthill99.arcadia_mod.init.entities.cyclops;// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import fr.silenthill99.arcadia_mod.init.entities.cyclops.Cyclops;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class CyclopsModel<T extends Cyclops> extends EntityModel<T> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer head;

	public CyclopsModel() {
		texWidth = 256;
		texHeight = 256;

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(0.0F, 16.5F, 0.0F);
		RightLeg.texOffs(124, 145).addBox(-10.0F, -7.5F, -4.0F, 8.0F, 15.0F, 8.0F, 0.0F, false);
		RightLeg.texOffs(0, 132).addBox(-10.0F, -7.5F, -4.0F, 8.0F, 15.0F, 8.0F, 0.5F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(0.0F, 16.5F, 0.0F);
		LeftLeg.texOffs(138, 68).addBox(2.0F, -7.5F, -4.0F, 8.0F, 15.0F, 8.0F, 0.0F, false);
		LeftLeg.texOffs(124, 122).addBox(2.0F, -7.5F, -4.0F, 8.0F, 15.0F, 8.0F, 0.5F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 24.0F, 0.0F);
		Body.texOffs(0, 50).addBox(-14.0F, -46.0F, -9.0F, 28.0F, 31.0F, 19.0F, 0.0F, false);
		Body.texOffs(0, 0).addBox(-14.0F, -46.0F, -9.0F, 28.0F, 31.0F, 19.0F, 0.5F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(0.0F, 13.0F, 0.0F);
		LeftArm.texOffs(0, 100).addBox(14.0F, -35.0F, -6.0F, 13.0F, 19.0F, 13.0F, 0.5F, false);
		LeftArm.texOffs(88, 122).addBox(16.0F, -35.0F, -4.0F, 9.0F, 30.0F, 9.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-20.5F, -22.75F, 0.5F);
		RightArm.texOffs(94, 44).addBox(-6.5F, 0.75F, -6.5F, 13.0F, 19.0F, 13.0F, 0.5F, false);
		RightArm.texOffs(52, 122).addBox(-4.5F, 0.75F, -4.5F, 9.0F, 30.0F, 9.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(-41.0F, 13.0F, 0.0F);
		head.texOffs(94, 0).addBox(30.0F, -57.0F, -11.0F, 22.0F, 22.0F, 22.0F, 0.0F, false);
		head.texOffs(72, 78).addBox(30.0F, -57.0F, -11.0F, 22.0F, 22.0F, 22.0F, 0.5F, false);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}