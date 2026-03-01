package com.stonytark.usefultoolsmod.item;

import com.stonytark.usefultoolsmod.UsefultoolsMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static RegistryEntry<ArmorMaterial> RGOLD_ARMOR_MATERIAL;
    public static RegistryEntry<ArmorMaterial> OBSIDIAN_ARMOR_MATERIAL;
    public static RegistryEntry<ArmorMaterial> EMERALD_ARMOR_MATERIAL;
    public static RegistryEntry<ArmorMaterial> OVERPOWER_ARMOR_MATERIAL;
    public static RegistryEntry<ArmorMaterial> HRED_ARMOR_MATERIAL;
    public static RegistryEntry<ArmorMaterial> RLAPIS_ARMOR_MATERIAL;

    public static void register() {
        RGOLD_ARMOR_MATERIAL = register("rgold", Util.make(new EnumMap<>(ArmorItem.Type.class), m -> {
            m.put(ArmorItem.Type.BOOTS, 3);
            m.put(ArmorItem.Type.LEGGINGS, 5);
            m.put(ArmorItem.Type.CHESTPLATE, 5);
            m.put(ArmorItem.Type.HELMET, 3);
            m.put(ArmorItem.Type.BODY, 9);
        }), 25, 2f, 0.1f, () -> ModItems.RGOLD);

        OBSIDIAN_ARMOR_MATERIAL = register("obsidian", Util.make(new EnumMap<>(ArmorItem.Type.class), m -> {
            m.put(ArmorItem.Type.BOOTS, 6);
            m.put(ArmorItem.Type.LEGGINGS, 7);
            m.put(ArmorItem.Type.CHESTPLATE, 9);
            m.put(ArmorItem.Type.HELMET, 6);
            m.put(ArmorItem.Type.BODY, 10);
        }), 10, 4f, 0.4f, () -> ModItems.OBINGOT);

        EMERALD_ARMOR_MATERIAL = register("emerald", Util.make(new EnumMap<>(ArmorItem.Type.class), m -> {
            m.put(ArmorItem.Type.BOOTS, 4);
            m.put(ArmorItem.Type.LEGGINGS, 6);
            m.put(ArmorItem.Type.CHESTPLATE, 8);
            m.put(ArmorItem.Type.HELMET, 4);
            m.put(ArmorItem.Type.BODY, 9);
        }), 30, 2f, 0.15f, () -> ModItems.SEM);

        OVERPOWER_ARMOR_MATERIAL = register("overpower", Util.make(new EnumMap<>(ArmorItem.Type.class), m -> {
            m.put(ArmorItem.Type.BOOTS, 15);
            m.put(ArmorItem.Type.LEGGINGS, 15);
            m.put(ArmorItem.Type.CHESTPLATE, 15);
            m.put(ArmorItem.Type.HELMET, 15);
            m.put(ArmorItem.Type.BODY, 15);
        }), 50, 8f, 1f, () -> ModItems.OBINGOT);

        HRED_ARMOR_MATERIAL = register("hred", Util.make(new EnumMap<>(ArmorItem.Type.class), m -> {
            m.put(ArmorItem.Type.BOOTS, 2);
            m.put(ArmorItem.Type.LEGGINGS, 4);
            m.put(ArmorItem.Type.CHESTPLATE, 4);
            m.put(ArmorItem.Type.HELMET, 3);
            m.put(ArmorItem.Type.BODY, 6);
        }), 23, 1.1f, 0.08f, () -> ModItems.HRED);

        RLAPIS_ARMOR_MATERIAL = register("rlapis", Util.make(new EnumMap<>(ArmorItem.Type.class), m -> {
            m.put(ArmorItem.Type.BOOTS, 3);
            m.put(ArmorItem.Type.LEGGINGS, 6);
            m.put(ArmorItem.Type.CHESTPLATE, 4);
            m.put(ArmorItem.Type.HELMET, 4);
            m.put(ArmorItem.Type.BODY, 8);
        }), 32, 1.6f, 0.15f, () -> ModItems.RLAPIS);
    }

    private static RegistryEntry<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> protection,
                                                          int enchantability, float toughness, float knockbackResistance,
                                                          Supplier<Item> repairItem) {
        Identifier id = Identifier.of(UsefultoolsMod.MOD_ID, name);
        RegistryEntry<SoundEvent> equipSound = SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(id));
        ArmorMaterial material = new ArmorMaterial(protection, enchantability, equipSound,
                () -> Ingredient.ofItems(repairItem.get()), layers, toughness, knockbackResistance);
        return Registry.registerReference(Registries.ARMOR_MATERIAL, id, material);
    }
}
