package com.stonytark.usefultoolsmod.item;

import com.stonytark.usefultoolsmod.UsefultoolsMod;
import com.stonytark.usefultoolsmod.entity.ModEntities;
import com.stonytark.usefultoolsmod.item.custom.Dynamite;
import com.stonytark.usefultoolsmod.item.custom.Grenade;
import com.stonytark.usefultoolsmod.item.custom.ModArmorItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Raw materials
    public static Item RGOLD;
    public static Item OBSHARD;
    public static Item SEM;
    public static Item OBINGOT;
    public static Item HRED;
    public static Item RLAPIS;

    // Throwables
    public static Item GRENADE;
    public static Item DYNAMITE;

    // Jemerald tools
    public static Item JEMERALD_SWORD;
    public static Item JEMERALD_PICKAXE;
    public static Item JEMERALD_SHOVEL;
    public static Item JEMERALD_AXE;
    public static Item JEMERALD_HOE;

    // Semerald tools
    public static Item SEMERALD_SWORD;
    public static Item SEMERALD_PICKAXE;
    public static Item SEMERALD_SHOVEL;
    public static Item SEMERALD_AXE;
    public static Item SEMERALD_HOE;

    // Jobsidian tools
    public static Item JOBSIDIAN_SWORD;
    public static Item JOBSIDIAN_PICKAXE;
    public static Item JOBSIDIAN_SHOVEL;
    public static Item JOBSIDIAN_AXE;
    public static Item JOBSIDIAN_HOE;

    // Sobsidian tools
    public static Item SOBSIDIAN_SWORD;
    public static Item SOBSIDIAN_PICKAXE;
    public static Item SOBSIDIAN_SHOVEL;
    public static Item SOBSIDIAN_AXE;
    public static Item SOBSIDIAN_HOE;

    // Overpower tools
    public static Item OVERPOWER_SWORD;
    public static Item OVERPOWER_PICKAXE;
    public static Item OVERPOWER_SHOVEL;
    public static Item OVERPOWER_AXE;

    // Hredstone tools
    public static Item HREDSTONE_SWORD;
    public static Item HREDSTONE_PICKAXE;
    public static Item HREDSTONE_SHOVEL;
    public static Item HREDSTONE_AXE;
    public static Item HREDSTONE_HOE;

    // Rgold tools
    public static Item RGOLD_SWORD;
    public static Item RGOLD_PICKAXE;
    public static Item RGOLD_SHOVEL;
    public static Item RGOLD_AXE;
    public static Item RGOLD_HOE;

    // Rlapis tools
    public static Item RLAPIS_SWORD;
    public static Item RLAPIS_PICKAXE;
    public static Item RLAPIS_SHOVEL;
    public static Item RLAPIS_AXE;
    public static Item RLAPIS_HOE;

    // Armor
    public static Item EMERALD_HELMET;
    public static Item EMERALD_CHESTPLATE;
    public static Item EMERALD_LEGGINGS;
    public static Item EMERALD_BOOTS;

    public static Item HRED_HELMET;
    public static Item HRED_CHESTPLATE;
    public static Item HRED_LEGGINGS;
    public static Item HRED_BOOTS;

    public static Item OBSIDIAN_HELMET;
    public static Item OBSIDIAN_CHESTPLATE;
    public static Item OBSIDIAN_LEGGINGS;
    public static Item OBSIDIAN_BOOTS;

    public static Item RGOLD_HELMET;
    public static Item RGOLD_CHESTPLATE;
    public static Item RGOLD_LEGGINGS;
    public static Item RGOLD_BOOTS;

    public static Item RLAPIS_HELMET;
    public static Item RLAPIS_CHESTPLATE;
    public static Item RLAPIS_LEGGINGS;
    public static Item RLAPIS_BOOTS;

    public static Item OVERPOWER_HELMET;
    public static Item OVERPOWER_CHESTPLATE;
    public static Item OVERPOWER_LEGGINGS;
    public static Item OVERPOWER_BOOTS;

    // Spawn eggs
    public static Item GHOST_SPAWN_EGG;

    public static void register() {
        // Raw materials
        RGOLD = reg("rgold", new Item(new Item.Settings().maxCount(64)));
        OBSHARD = reg("obshard", new Item(new Item.Settings().maxCount(64)));
        SEM = reg("sem", new Item(new Item.Settings().maxCount(64)));
        OBINGOT = reg("obingot", new Item(new Item.Settings().maxCount(64)));
        HRED = reg("hred", new Item(new Item.Settings().maxCount(64)));
        RLAPIS = reg("rlapis", new Item(new Item.Settings().maxCount(64)));

        // Throwables
        GRENADE = reg("grenade", new Grenade(new Item.Settings().maxCount(16)));
        DYNAMITE = reg("dynamite", new Dynamite(new Item.Settings().maxCount(16).fireproof()));

        // Jemerald tools
        JEMERALD_SWORD = reg("jemerald_sword", new SwordItem(ModToolTiers.JEMERALD,
                new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolTiers.JEMERALD, 3, -2.4f))));
        JEMERALD_PICKAXE = reg("jemerald_pickaxe", new PickaxeItem(ModToolTiers.JEMERALD,
                new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolTiers.JEMERALD, 1, -2.8f))));
        JEMERALD_SHOVEL = reg("jemerald_shovel", new ShovelItem(ModToolTiers.JEMERALD,
                new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolTiers.JEMERALD, 1.5f, -3f))));
        JEMERALD_AXE = reg("jemerald_axe", new AxeItem(ModToolTiers.JEMERALD,
                new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolTiers.JEMERALD, 6, -3.2f))));
        JEMERALD_HOE = reg("jemerald_hoe", new HoeItem(ModToolTiers.JEMERALD,
                new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolTiers.JEMERALD, 0, -3f))));

        // Semerald tools
        SEMERALD_SWORD = reg("semerald_sword", new SwordItem(ModToolTiers.SEMERALD,
                new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolTiers.SEMERALD, 3, -2.4f))));
        SEMERALD_PICKAXE = reg("semerald_pickaxe", new PickaxeItem(ModToolTiers.SEMERALD,
                new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolTiers.SEMERALD, 1, -2.8f))));
        SEMERALD_SHOVEL = reg("semerald_shovel", new ShovelItem(ModToolTiers.SEMERALD,
                new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolTiers.SEMERALD, 1.5f, -3f))));
        SEMERALD_AXE = reg("semerald_axe", new AxeItem(ModToolTiers.SEMERALD,
                new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolTiers.SEMERALD, 6, -3.2f))));
        SEMERALD_HOE = reg("semerald_hoe", new HoeItem(ModToolTiers.SEMERALD,
                new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolTiers.SEMERALD, 0, -3f))));

        // Jobsidian tools
        JOBSIDIAN_SWORD = reg("jobsidian_sword", new SwordItem(ModToolTiers.JOBSIDIAN,
                new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolTiers.JOBSIDIAN, 3, -2.4f))));
        JOBSIDIAN_PICKAXE = reg("jobsidian_pickaxe", new PickaxeItem(ModToolTiers.JOBSIDIAN,
                new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolTiers.JOBSIDIAN, 1, -2.8f))));
        JOBSIDIAN_SHOVEL = reg("jobsidian_shovel", new ShovelItem(ModToolTiers.JOBSIDIAN,
                new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolTiers.JOBSIDIAN, 1.5f, -3f))));
        JOBSIDIAN_AXE = reg("jobsidian_axe", new AxeItem(ModToolTiers.JOBSIDIAN,
                new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolTiers.JOBSIDIAN, 6, -3.2f))));
        JOBSIDIAN_HOE = reg("jobsidian_hoe", new HoeItem(ModToolTiers.JOBSIDIAN,
                new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolTiers.JOBSIDIAN, 0, -3f))));

        // Sobsidian tools
        SOBSIDIAN_SWORD = reg("sobsidian_sword", new SwordItem(ModToolTiers.SOBSIDIAN,
                new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolTiers.SOBSIDIAN, 3, -2.4f))));
        SOBSIDIAN_PICKAXE = reg("sobsidian_pickaxe", new PickaxeItem(ModToolTiers.SOBSIDIAN,
                new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolTiers.SOBSIDIAN, 1, -2.8f))));
        SOBSIDIAN_SHOVEL = reg("sobsidian_shovel", new ShovelItem(ModToolTiers.SOBSIDIAN,
                new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolTiers.SOBSIDIAN, 1.5f, -3f))));
        SOBSIDIAN_AXE = reg("sobsidian_axe", new AxeItem(ModToolTiers.SOBSIDIAN,
                new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolTiers.SOBSIDIAN, 6, -3.2f))));
        SOBSIDIAN_HOE = reg("sobsidian_hoe", new HoeItem(ModToolTiers.SOBSIDIAN,
                new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolTiers.SOBSIDIAN, 0, -3f))));

        // Overpower tools
        OVERPOWER_SWORD = reg("overpower_sword", new SwordItem(ModToolTiers.OVERPOWER,
                new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolTiers.OVERPOWER, 3, -2.4f))));
        OVERPOWER_PICKAXE = reg("overpower_pickaxe", new PickaxeItem(ModToolTiers.OVERPOWER,
                new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolTiers.OVERPOWER, 1, -2.8f))));
        OVERPOWER_SHOVEL = reg("overpower_shovel", new ShovelItem(ModToolTiers.OVERPOWER,
                new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolTiers.OVERPOWER, 1.5f, -3f))));
        OVERPOWER_AXE = reg("overpower_axe", new AxeItem(ModToolTiers.OVERPOWER,
                new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolTiers.OVERPOWER, 6, -3.2f))));

        // Hredstone tools
        HREDSTONE_SWORD = reg("hredstone_sword", new SwordItem(ModToolTiers.HREDSTONE,
                new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolTiers.HREDSTONE, 3, -2.4f))));
        HREDSTONE_PICKAXE = reg("hredstone_pickaxe", new PickaxeItem(ModToolTiers.HREDSTONE,
                new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolTiers.HREDSTONE, 1, -2.8f))));
        HREDSTONE_SHOVEL = reg("hredstone_shovel", new ShovelItem(ModToolTiers.HREDSTONE,
                new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolTiers.HREDSTONE, 1.5f, -3f))));
        HREDSTONE_AXE = reg("hredstone_axe", new AxeItem(ModToolTiers.HREDSTONE,
                new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolTiers.HREDSTONE, 6, -3.2f))));
        HREDSTONE_HOE = reg("hredstone_hoe", new HoeItem(ModToolTiers.HREDSTONE,
                new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolTiers.HREDSTONE, 0, -3f))));

        // Rgold tools
        RGOLD_SWORD = reg("rgold_sword", new SwordItem(ModToolTiers.RGOLD,
                new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolTiers.RGOLD, 3, -2.4f))));
        RGOLD_PICKAXE = reg("rgold_pickaxe", new PickaxeItem(ModToolTiers.RGOLD,
                new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolTiers.RGOLD, 1, -2.8f))));
        RGOLD_SHOVEL = reg("rgold_shovel", new ShovelItem(ModToolTiers.RGOLD,
                new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolTiers.RGOLD, 1.5f, -3f))));
        RGOLD_AXE = reg("rgold_axe", new AxeItem(ModToolTiers.RGOLD,
                new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolTiers.RGOLD, 6, -3.2f))));
        RGOLD_HOE = reg("rgold_hoe", new HoeItem(ModToolTiers.RGOLD,
                new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolTiers.RGOLD, 0, -3f))));

        // Rlapis tools
        RLAPIS_SWORD = reg("rlapis_sword", new SwordItem(ModToolTiers.RLAPIS,
                new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolTiers.RLAPIS, 3, -2.4f))));
        RLAPIS_PICKAXE = reg("rlapis_pickaxe", new PickaxeItem(ModToolTiers.RLAPIS,
                new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolTiers.RLAPIS, 1, -2.8f))));
        RLAPIS_SHOVEL = reg("rlapis_shovel", new ShovelItem(ModToolTiers.RLAPIS,
                new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolTiers.RLAPIS, 1.5f, -3f))));
        RLAPIS_AXE = reg("rlapis_axe", new AxeItem(ModToolTiers.RLAPIS,
                new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolTiers.RLAPIS, 6, -3.2f))));
        RLAPIS_HOE = reg("rlapis_hoe", new HoeItem(ModToolTiers.RLAPIS,
                new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolTiers.RLAPIS, 0, -3f))));

        // Armor
        EMERALD_HELMET = reg("emerald_helmet", new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL,
                ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));
        EMERALD_CHESTPLATE = reg("emerald_chestplate", new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL,
                ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));
        EMERALD_LEGGINGS = reg("emerald_leggings", new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL,
                ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));
        EMERALD_BOOTS = reg("emerald_boots", new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL,
                ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));

        HRED_HELMET = reg("hred_helmet", new ArmorItem(ModArmorMaterials.HRED_ARMOR_MATERIAL,
                ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(20))));
        HRED_CHESTPLATE = reg("hred_chestplate", new ArmorItem(ModArmorMaterials.HRED_ARMOR_MATERIAL,
                ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(20))));
        HRED_LEGGINGS = reg("hred_leggings", new ArmorItem(ModArmorMaterials.HRED_ARMOR_MATERIAL,
                ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(20))));
        HRED_BOOTS = reg("hred_boots", new ArmorItem(ModArmorMaterials.HRED_ARMOR_MATERIAL,
                ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(20))));

        OBSIDIAN_HELMET = reg("obsidian_helmet", new ArmorItem(ModArmorMaterials.OBSIDIAN_ARMOR_MATERIAL,
                ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
        OBSIDIAN_CHESTPLATE = reg("obsidian_chestplate", new ArmorItem(ModArmorMaterials.OBSIDIAN_ARMOR_MATERIAL,
                ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
        OBSIDIAN_LEGGINGS = reg("obsidian_leggings", new ArmorItem(ModArmorMaterials.OBSIDIAN_ARMOR_MATERIAL,
                ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
        OBSIDIAN_BOOTS = reg("obsidian_boots", new ArmorItem(ModArmorMaterials.OBSIDIAN_ARMOR_MATERIAL,
                ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

        RGOLD_HELMET = reg("rgold_helmet", new ArmorItem(ModArmorMaterials.RGOLD_ARMOR_MATERIAL,
                ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(18))));
        RGOLD_CHESTPLATE = reg("rgold_chestplate", new ArmorItem(ModArmorMaterials.RGOLD_ARMOR_MATERIAL,
                ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(18))));
        RGOLD_LEGGINGS = reg("rgold_leggings", new ArmorItem(ModArmorMaterials.RGOLD_ARMOR_MATERIAL,
                ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(18))));
        RGOLD_BOOTS = reg("rgold_boots", new ArmorItem(ModArmorMaterials.RGOLD_ARMOR_MATERIAL,
                ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(18))));

        RLAPIS_HELMET = reg("rlapis_helmet", new ArmorItem(ModArmorMaterials.RLAPIS_ARMOR_MATERIAL,
                ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(17))));
        RLAPIS_CHESTPLATE = reg("rlapis_chestplate", new ArmorItem(ModArmorMaterials.RLAPIS_ARMOR_MATERIAL,
                ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(17))));
        RLAPIS_LEGGINGS = reg("rlapis_leggings", new ArmorItem(ModArmorMaterials.RLAPIS_ARMOR_MATERIAL,
                ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(17))));
        RLAPIS_BOOTS = reg("rlapis_boots", new ArmorItem(ModArmorMaterials.RLAPIS_ARMOR_MATERIAL,
                ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(17))));

        OVERPOWER_HELMET = reg("overpower_helmet", new ModArmorItem(ModArmorMaterials.OVERPOWER_ARMOR_MATERIAL,
                ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(100))));
        OVERPOWER_CHESTPLATE = reg("overpower_chestplate", new ArmorItem(ModArmorMaterials.OVERPOWER_ARMOR_MATERIAL,
                ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(100))));
        OVERPOWER_LEGGINGS = reg("overpower_leggings", new ArmorItem(ModArmorMaterials.OVERPOWER_ARMOR_MATERIAL,
                ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(100))));
        OVERPOWER_BOOTS = reg("overpower_boots", new ArmorItem(ModArmorMaterials.OVERPOWER_ARMOR_MATERIAL,
                ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(100))));

        // Spawn eggs (must be registered AFTER entities)
        GHOST_SPAWN_EGG = reg("ghost_spawn_egg",
                new SpawnEggItem(ModEntities.GHOST, 0xFFFFFF, 0x999999, new Item.Settings()));
    }

    private static <T extends Item> T reg(String name, T item) {
        Registry.register(Registries.ITEM, Identifier.of(UsefultoolsMod.MOD_ID, name), item);
        return item;
    }
}
