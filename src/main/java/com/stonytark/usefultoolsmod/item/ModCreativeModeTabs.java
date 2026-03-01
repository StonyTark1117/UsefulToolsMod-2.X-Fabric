package com.stonytark.usefultoolsmod.item;

import com.stonytark.usefultoolsmod.UsefultoolsMod;
import com.stonytark.usefultoolsmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModCreativeModeTabs {

    public static void register() {
        // Custom creative tab with all mod items
        Registry.register(Registries.ITEM_GROUP,
                Identifier.of(UsefultoolsMod.MOD_ID, "usefultools"),
                FabricItemGroup.builder()
                        .displayName(Text.translatable("itemGroup.usefultoolsmod.usefultools"))
                        .icon(() -> new ItemStack(ModItems.RGOLD))
                        .entries((context, entries) -> {
                            // Materials
                            entries.add(ModItems.RGOLD);
                            entries.add(ModItems.OBSHARD);
                            entries.add(ModItems.SEM);
                            entries.add(ModItems.OBINGOT);
                            entries.add(ModItems.HRED);
                            entries.add(ModItems.RLAPIS);
                            // Throwables
                            entries.add(ModItems.GRENADE);
                            entries.add(ModItems.DYNAMITE);
                            // Blocks
                            entries.add(ModBlocks.RGOLDBLOCK);
                            entries.add(ModBlocks.HRBLOCK);
                            entries.add(ModBlocks.SEMBLOCK);
                            entries.add(ModBlocks.SOBLOCK);
                            entries.add(ModBlocks.LBLOCK);
                            entries.add(ModBlocks.RGOLDORE);
                            entries.add(ModBlocks.RGOLD_DEEPSLATE_ORE);
                            entries.add(ModBlocks.RGOLD_END_ORE);
                            entries.add(ModBlocks.RGOLD_NETHER_ORE);
                            // Tools
                            entries.add(ModItems.JEMERALD_SWORD);
                            entries.add(ModItems.JEMERALD_PICKAXE);
                            entries.add(ModItems.JEMERALD_SHOVEL);
                            entries.add(ModItems.JEMERALD_AXE);
                            entries.add(ModItems.JEMERALD_HOE);
                            entries.add(ModItems.SEMERALD_SWORD);
                            entries.add(ModItems.SEMERALD_PICKAXE);
                            entries.add(ModItems.SEMERALD_SHOVEL);
                            entries.add(ModItems.SEMERALD_AXE);
                            entries.add(ModItems.SEMERALD_HOE);
                            entries.add(ModItems.JOBSIDIAN_SWORD);
                            entries.add(ModItems.JOBSIDIAN_PICKAXE);
                            entries.add(ModItems.JOBSIDIAN_SHOVEL);
                            entries.add(ModItems.JOBSIDIAN_AXE);
                            entries.add(ModItems.JOBSIDIAN_HOE);
                            entries.add(ModItems.SOBSIDIAN_SWORD);
                            entries.add(ModItems.SOBSIDIAN_PICKAXE);
                            entries.add(ModItems.SOBSIDIAN_SHOVEL);
                            entries.add(ModItems.SOBSIDIAN_AXE);
                            entries.add(ModItems.SOBSIDIAN_HOE);
                            entries.add(ModItems.OVERPOWER_SWORD);
                            entries.add(ModItems.OVERPOWER_PICKAXE);
                            entries.add(ModItems.OVERPOWER_SHOVEL);
                            entries.add(ModItems.OVERPOWER_AXE);
                            entries.add(ModItems.HREDSTONE_SWORD);
                            entries.add(ModItems.HREDSTONE_PICKAXE);
                            entries.add(ModItems.HREDSTONE_SHOVEL);
                            entries.add(ModItems.HREDSTONE_AXE);
                            entries.add(ModItems.HREDSTONE_HOE);
                            entries.add(ModItems.RGOLD_SWORD);
                            entries.add(ModItems.RGOLD_PICKAXE);
                            entries.add(ModItems.RGOLD_SHOVEL);
                            entries.add(ModItems.RGOLD_AXE);
                            entries.add(ModItems.RGOLD_HOE);
                            entries.add(ModItems.RLAPIS_SWORD);
                            entries.add(ModItems.RLAPIS_PICKAXE);
                            entries.add(ModItems.RLAPIS_SHOVEL);
                            entries.add(ModItems.RLAPIS_AXE);
                            entries.add(ModItems.RLAPIS_HOE);
                            // Armor
                            entries.add(ModItems.EMERALD_HELMET);
                            entries.add(ModItems.EMERALD_CHESTPLATE);
                            entries.add(ModItems.EMERALD_LEGGINGS);
                            entries.add(ModItems.EMERALD_BOOTS);
                            entries.add(ModItems.HRED_HELMET);
                            entries.add(ModItems.HRED_CHESTPLATE);
                            entries.add(ModItems.HRED_LEGGINGS);
                            entries.add(ModItems.HRED_BOOTS);
                            entries.add(ModItems.OBSIDIAN_HELMET);
                            entries.add(ModItems.OBSIDIAN_CHESTPLATE);
                            entries.add(ModItems.OBSIDIAN_LEGGINGS);
                            entries.add(ModItems.OBSIDIAN_BOOTS);
                            entries.add(ModItems.RGOLD_HELMET);
                            entries.add(ModItems.RGOLD_CHESTPLATE);
                            entries.add(ModItems.RGOLD_LEGGINGS);
                            entries.add(ModItems.RGOLD_BOOTS);
                            entries.add(ModItems.RLAPIS_HELMET);
                            entries.add(ModItems.RLAPIS_CHESTPLATE);
                            entries.add(ModItems.RLAPIS_LEGGINGS);
                            entries.add(ModItems.RLAPIS_BOOTS);
                            entries.add(ModItems.OVERPOWER_HELMET);
                            entries.add(ModItems.OVERPOWER_CHESTPLATE);
                            entries.add(ModItems.OVERPOWER_LEGGINGS);
                            entries.add(ModItems.OVERPOWER_BOOTS);
                            // Spawn eggs
                            entries.add(ModItems.GHOST_SPAWN_EGG);
                        })
                        .build());

        // Also add to vanilla tabs
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(ModItems.RGOLD);
            content.add(ModItems.OBSHARD);
            content.add(ModItems.SEM);
            content.add(ModItems.OBINGOT);
            content.add(ModItems.HRED);
            content.add(ModItems.RLAPIS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(ModItems.GRENADE);
            content.add(ModItems.DYNAMITE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add(ModBlocks.RGOLDBLOCK);
            content.add(ModBlocks.HRBLOCK);
            content.add(ModBlocks.SEMBLOCK);
            content.add(ModBlocks.SOBLOCK);
            content.add(ModBlocks.LBLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.add(ModBlocks.RGOLDORE);
            content.add(ModBlocks.RGOLD_DEEPSLATE_ORE);
            content.add(ModBlocks.RGOLD_END_ORE);
            content.add(ModBlocks.RGOLD_NETHER_ORE);
        });
    }
}
