package com.mjr.extraplanets.client.model.bosses.defaultBosses;

import com.mjr.extraplanets.Constants;
import com.mjr.extraplanets.entities.bosses.defaultBosses.EntityCreeperBossMercury;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCreeperBossMercury extends ModelBase {
	ModelRenderer headMain;
	ModelRenderer bodyMain;
	ModelRenderer rightLegFront;
	ModelRenderer leftLegFront;
	ModelRenderer rightLeg;
	ModelRenderer leftLeg;
	ModelRenderer oxygenTank;
	ModelRenderer headLeft;
	ModelRenderer headRight;
	ModelRenderer neckRight;
	ModelRenderer neckLeft;

	public ModelCreeperBossMercury() {
		this(0.0F);
	}

	public ModelCreeperBossMercury(float scale) {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.neckRight = new ModelRenderer(this, 16, 20);
		this.neckRight.mirror = true;
		this.neckRight.addBox(-2.5F, -9F, -1.5F, 5, 9, 3, scale);
		this.neckRight.setRotationPoint(-3F, 10F, 0F);
		this.neckRight.setTextureSize(128, 64);
		this.neckRight.mirror = true;
		this.setRotation(this.neckRight, 0F, 0F, -1.169371F);
		this.neckRight.mirror = false;
		this.neckLeft = new ModelRenderer(this, 16, 20);
		this.neckLeft.addBox(-2.5F, -9F, -1.5F, 5, 9, 3, scale);
		this.neckLeft.setRotationPoint(3F, 10F, 0F);
		this.neckLeft.setTextureSize(128, 64);
		this.neckLeft.mirror = true;
		this.setRotation(this.neckLeft, 0F, 0F, 1.169371F);
		this.headMain = new ModelRenderer(this, 0, 0);
		this.headMain.addBox(-4F, -8F, -4F, 8, 8, 8, scale);
		this.headMain.setRotationPoint(0F, 6F, 0F);
		this.headMain.setTextureSize(128, 64);
		this.headMain.mirror = true;
		this.setRotation(this.headMain, 0F, 0F, 0F);
		this.bodyMain = new ModelRenderer(this, 16, 16);
		this.bodyMain.addBox(-4F, 0F, -2F, 8, 12, 4, scale);
		this.bodyMain.setRotationPoint(0F, 6F, 0F);
		this.bodyMain.setTextureSize(128, 64);
		this.bodyMain.mirror = true;
		this.setRotation(this.bodyMain, 0F, 0F, 0F);
		this.rightLegFront = new ModelRenderer(this, 0, 16);
		this.rightLegFront.addBox(-2F, 0F, -2F, 4, 6, 4, scale);
		this.rightLegFront.setRotationPoint(-2F, 18F, -4F);
		this.rightLegFront.setTextureSize(128, 64);
		this.rightLegFront.mirror = true;
		this.setRotation(this.rightLegFront, 0F, 0F, 0F);
		this.leftLegFront = new ModelRenderer(this, 0, 16);
		this.leftLegFront.addBox(-2F, 0F, -2F, 4, 6, 4, scale);
		this.leftLegFront.setRotationPoint(2F, 18F, -4F);
		this.leftLegFront.setTextureSize(128, 64);
		this.leftLegFront.mirror = true;
		this.setRotation(this.leftLegFront, 0F, 0F, 0F);
		this.rightLeg = new ModelRenderer(this, 0, 16);
		this.rightLeg.addBox(0F, 0F, -2F, 4, 6, 4, scale);
		this.rightLeg.setRotationPoint(-4F, 18F, 4F);
		this.rightLeg.setTextureSize(128, 64);
		this.rightLeg.mirror = true;
		this.setRotation(this.rightLeg, 0F, 0F, 0F);
		this.leftLeg = new ModelRenderer(this, 0, 16);
		this.leftLeg.addBox(-2F, 0F, -2F, 4, 6, 4, scale);
		this.leftLeg.setRotationPoint(2F, 18F, 4F);
		this.leftLeg.setTextureSize(128, 64);
		this.leftLeg.mirror = true;
		this.setRotation(this.leftLeg, 0F, 0F, 0F);
		this.oxygenTank = new ModelRenderer(this, 40, 0);
		this.oxygenTank.addBox(-5F, -9F, -5F, 10, 10, 10, scale);
		this.oxygenTank.setRotationPoint(0F, 6F, 0F);
		this.oxygenTank.setTextureSize(128, 64);
		this.oxygenTank.mirror = true;
		this.setRotation(this.oxygenTank, 0F, 0F, 0F);
		this.headLeft = new ModelRenderer(this, 0, 0);
		this.headLeft.addBox(1F, -9F, -4F, 8, 8, 8, scale);
		this.headLeft.setRotationPoint(3F, 6F, 0.1F);
		this.headLeft.setTextureSize(128, 64);
		this.headLeft.mirror = true;
		this.setRotation(this.headLeft, 0F, 0F, 0.7853982F);
		this.headRight = new ModelRenderer(this, 0, 0);
		this.headRight.addBox(-9F, -9F, -4F, 8, 8, 8, scale);
		this.headRight.setRotationPoint(-3F, 6F, -0.1F);
		this.headRight.setTextureSize(128, 64);
		this.headRight.mirror = true;
		this.setRotation(this.headRight, 0F, 0F, -0.7853982F);

	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);

		final EntityCreeperBossMercury creeper = (EntityCreeperBossMercury) entity;

		if (creeper.headsRemaining > 2) {
			this.headLeft.render(scale);
			this.neckLeft.render(scale);
			this.headRight.render(scale);
			this.neckRight.render(scale);
			this.headMain.render(scale);
			this.oxygenTank.render(scale);
		} else if (creeper.headsRemaining > 1) {
			this.headRight.render(scale);
			this.neckRight.render(scale);
			this.headMain.render(scale);
			this.oxygenTank.render(scale);
		} else if (creeper.headsRemaining > 0) {
			this.headMain.render(scale);
			this.oxygenTank.render(scale);
		}

		this.bodyMain.render(scale);
		this.rightLegFront.render(scale);
		this.leftLegFront.render(scale);
		this.rightLeg.render(scale);
		this.leftLeg.render(scale);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.headMain.rotateAngleY = f3 / Constants.RADIANS_TO_DEGREES;
		this.headMain.rotateAngleX = f4 / Constants.RADIANS_TO_DEGREES;
		this.oxygenTank.rotateAngleY = f3 / Constants.RADIANS_TO_DEGREES;
		this.oxygenTank.rotateAngleX = f4 / Constants.RADIANS_TO_DEGREES;
		this.rightLegFront.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.leftLegFront.rotateAngleX = MathHelper.cos(f * 0.6662F + Constants.floatPI) * 2F * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + Constants.floatPI) * 2F * f1;
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2F * f1;
	}
}