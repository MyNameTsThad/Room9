package com.thaddev.room9.client;

import com.thaddev.room9.client.render.DewEntityRenderer;
import com.thaddev.room9.client.render.TaserZapEntityRenderer;
import com.thaddev.room9.mechanics.inits.EntityInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class Room9Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EntityInit.DEW, DewEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.TASER_ZAP, TaserZapEntityRenderer::new);
    }
}
