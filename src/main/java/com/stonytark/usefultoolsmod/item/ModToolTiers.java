package com.stonytark.usefultoolsmod.item;

import com.stonytark.usefultoolsmod.block.ModBlocks;
import com.stonytark.usefultoolsmod.util.ModTags;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.block.Block;

import java.util.function.Supplier;

public class ModToolTiers {

    public static final ToolMaterial JEMERALD = create(ModTags.Blocks.INCORRECT_JEM_TOOL,
            1361, 4.5f, 6, 22, () -> Ingredient.ofItems(Items.EMERALD));

    public static final ToolMaterial SEMERALD = create(ModTags.Blocks.INCORRECT_SEM_TOOL,
            1561, 3.2f, 7, 30, () -> Ingredient.ofItems(ModItems.SEM));

    public static final ToolMaterial JOBSIDIAN = create(ModTags.Blocks.INCORRECT_JOB_TOOL,
            1650, 6f, 9, 15, () -> Ingredient.ofItems(ModItems.OBSHARD));

    public static final ToolMaterial SOBSIDIAN = create(ModTags.Blocks.INCORRECT_SOB_TOOL,
            2031, 5f, 10, 18, () -> Ingredient.ofItems(ModItems.OBINGOT));

    public static final ToolMaterial OVERPOWER = create(ModTags.Blocks.INCORRECT_OP_TOOL,
            9999, 30f, 25, 35, () -> Ingredient.ofItems(ModBlocks.SOBLOCK.asItem()));

    public static final ToolMaterial HREDSTONE = create(ModTags.Blocks.INCORRECT_HRED_TOOL,
            600, 3f, 8, 20, () -> Ingredient.ofItems(ModItems.HRED));

    public static final ToolMaterial RGOLD = create(ModTags.Blocks.INCORRECT_RGOLD_TOOL,
            1200, 3.5f, 8, 16, () -> Ingredient.ofItems(ModItems.RGOLD));

    public static final ToolMaterial RLAPIS = create(ModTags.Blocks.INCORRECT_RLAPIS_TOOL,
            1100, 3.2f, 9, 32, () -> Ingredient.ofItems(ModItems.RGOLD));

    private static ToolMaterial create(TagKey<Block> inverseTag, int durability, float miningSpeed,
                                       float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        return new ToolMaterial() {
            @Override
            public int getDurability() { return durability; }
            @Override
            public float getMiningSpeedMultiplier() { return miningSpeed; }
            @Override
            public float getAttackDamage() { return attackDamage; }
            @Override
            public TagKey<Block> getInverseTag() { return inverseTag; }
            @Override
            public int getEnchantability() { return enchantability; }
            @Override
            public Ingredient getRepairIngredient() { return repairIngredient.get(); }
        };
    }
}
