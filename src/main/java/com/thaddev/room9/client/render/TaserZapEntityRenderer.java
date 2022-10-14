/*
 * Decompiled with CFR 0.1.1 (FabricMC 57d88659).
 */
package com.thaddev.room9.client.render;

import com.thaddev.room9.client.render.model.TaserZapEntityModel;
import com.thaddev.room9.content.entities.TaserZapEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.LlamaSpitEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.projectile.LlamaSpitEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3f;

@Environment(EnvType.CLIENT)
public class TaserZapEntityRenderer extends EntityRenderer<TaserZapEntity> {
    private static final Identifier TEXTURE = new Identifier("textures/entity/llama/spit.png");
    private final TaserZapEntityModel<TaserZapEntity> model;

    public TaserZapEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new TaserZapEntityModel<>(context.getPart(EntityModelLayers.LLAMA_SPIT));
    }

    @Override
    public void render(TaserZapEntity llamaSpitEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.translate(0.0, 0.15f, 0.0);
        matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(MathHelper.lerp(g, llamaSpitEntity.prevYaw, llamaSpitEntity.getYaw()) - 90.0f));
        matrixStack.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(MathHelper.lerp(g, llamaSpitEntity.prevPitch, llamaSpitEntity.getPitch())));
        this.model.setAngles(llamaSpitEntity, g, 0.0f, -0.1f, 0.0f, 0.0f);
        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(this.model.getLayer(TEXTURE));
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 1.0f);
        matrixStack.pop();
        super.render(llamaSpitEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(TaserZapEntity llamaSpitEntity) {
        return TEXTURE;
    }
}

