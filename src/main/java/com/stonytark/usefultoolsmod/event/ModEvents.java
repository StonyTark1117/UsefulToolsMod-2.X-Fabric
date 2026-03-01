package com.stonytark.usefultoolsmod.event;

import com.stonytark.usefultoolsmod.item.ModArmorMaterials;
import com.stonytark.usefultoolsmod.item.ModItems;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class ModEvents {

    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(ModEvents::onServerTick);
    }

    private static void onServerTick(MinecraftServer server) {
        for (net.minecraft.server.network.ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            if (player.isSpectator()) continue;

            ItemStack main = player.getMainHandStack();
            ItemStack off = player.getOffHandStack();
            handleToolEffects(player, main);
            handleToolEffects(player, off);
        }
    }

    private static void handleToolEffects(PlayerEntity player, ItemStack held) {
        if (held.isEmpty()) return;

        if (held.isOf(ModItems.OVERPOWER_SWORD)) {
            applyEffects(player,
                    new StatusEffectInstance(StatusEffects.STRENGTH, 10, 3, false, false, false),
                    new StatusEffectInstance(StatusEffects.SPEED, 10, 3, false, false, false),
                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 10, 3, false, false, false),
                    new StatusEffectInstance(StatusEffects.RESISTANCE, 10, 3, false, false, false));
        } else if (held.isOf(ModItems.OVERPOWER_PICKAXE)) {
            applyEffects(player,
                    new StatusEffectInstance(StatusEffects.HASTE, 10, 3, false, false, false),
                    new StatusEffectInstance(StatusEffects.STRENGTH, 10, 3, false, false, false),
                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 10, 10, false, false, false));
        } else if (held.isOf(ModItems.OVERPOWER_SHOVEL)) {
            applyEffects(player,
                    new StatusEffectInstance(StatusEffects.HASTE, 10, 3, false, false, false),
                    new StatusEffectInstance(StatusEffects.STRENGTH, 10, 1, false, false, false),
                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 10, 5, false, false, false));
        } else if (held.isOf(ModItems.OVERPOWER_AXE)) {
            applyEffects(player,
                    new StatusEffectInstance(StatusEffects.REGENERATION, 10, 3, false, false, false),
                    new StatusEffectInstance(StatusEffects.STRENGTH, 10, 3, false, false, false),
                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 10, 10, false, false, false));
        }
    }

    private static void applyEffects(PlayerEntity player, StatusEffectInstance... effects) {
        for (StatusEffectInstance effect : effects) {
            player.addStatusEffect(effect);
        }
    }
}
