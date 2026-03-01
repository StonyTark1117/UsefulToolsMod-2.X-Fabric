package com.stonytark.usefultoolsmod;

import com.stonytark.usefultoolsmod.entity.ModEntities;
import com.stonytark.usefultoolsmod.entity.client.GhostModel;
import com.stonytark.usefultoolsmod.entity.client.GhostRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class UsefultoolsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register entity model layers (defines geometry for baking)
        EntityModelLayerRegistry.registerModelLayer(GhostModel.LAYER_LOCATION, GhostModel::createBodyLayer);

        // Register entity renderers
        EntityRendererRegistry.register(ModEntities.GHOST, GhostRenderer::new);
    }
}
