package com.stonytark.usefultoolsmod;

import com.stonytark.usefultoolsmod.entity.ModEntities;
import com.stonytark.usefultoolsmod.entity.client.GhostModel;
import com.stonytark.usefultoolsmod.entity.client.GhostRenderer;
import com.stonytark.usefultoolsmod.item.ModArmorMaterials;
import com.stonytark.usefultoolsmod.item.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;

public class UsefultoolsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register entity model layers (defines geometry for baking)
        EntityModelLayerRegistry.registerModelLayer(GhostModel.LAYER_LOCATION, GhostModel::createBodyLayer);

        // Register entity renderers
        EntityRendererRegistry.register(ModEntities.GHOST, GhostRenderer::new);

        // Register client-side tick for particle aura effects
        ClientTickEvents.END_CLIENT_TICK.register(UsefultoolsModClient::onClientTick);
    }

    private static void onClientTick(MinecraftClient client) {
        if (client.player == null || client.world == null) return;
        PlayerEntity player = client.player;

        ItemStack mainHand = player.getMainHandStack();
        ItemStack offHand = player.getOffHandStack();

        // Spawn enchant glint particles for OVERPOWER tools
        if (isOverpowerTool(mainHand) || isOverpowerTool(offHand)) {
            spawnAuraParticles(player);
        }

        // Spawn soul fire particles for full OVERPOWER armor
        if (hasFullOverpowerArmor(player)) {
            spawnArmorGlowParticles(player);
        }
    }

    private static boolean isOverpowerTool(ItemStack stack) {
        return stack.isOf(ModItems.OVERPOWER_SWORD)
                || stack.isOf(ModItems.OVERPOWER_PICKAXE)
                || stack.isOf(ModItems.OVERPOWER_SHOVEL)
                || stack.isOf(ModItems.OVERPOWER_AXE);
    }

    private static boolean hasFullOverpowerArmor(PlayerEntity player) {
        for (ItemStack armor : player.getArmorItems()) {
            if (armor.isEmpty()) return false;
            if (!(armor.getItem() instanceof ArmorItem armorItem)) return false;
            if (armorItem.getMaterial() != ModArmorMaterials.OVERPOWER_ARMOR_MATERIAL) return false;
        }
        return true;
    }

    private static void spawnAuraParticles(PlayerEntity player) {
        double x = player.getX() + (player.getRandom().nextDouble() - 0.5) * 1.2;
        double y = player.getY() + player.getRandom().nextDouble() * player.getHeight();
        double z = player.getZ() + (player.getRandom().nextDouble() - 0.5) * 1.2;
        player.getWorld().addParticle(ParticleTypes.ENCHANT, x, y, z, 0.0, 0.1, 0.0);
    }

    private static void spawnArmorGlowParticles(PlayerEntity player) {
        double x = player.getX() + (player.getRandom().nextDouble() - 0.5) * 1.5;
        double y = player.getY() + player.getRandom().nextDouble() * player.getHeight();
        double z = player.getZ() + (player.getRandom().nextDouble() - 0.5) * 1.5;
        player.getWorld().addParticle(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 0.0, 0.05, 0.0);
    }
}
