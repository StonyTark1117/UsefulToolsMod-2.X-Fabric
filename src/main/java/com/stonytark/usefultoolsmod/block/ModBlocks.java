package com.stonytark.usefultoolsmod.block;

import com.stonytark.usefultoolsmod.UsefultoolsMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static Block RGOLDBLOCK;
    public static Block HRBLOCK;
    public static Block RGOLDORE;
    public static Block RGOLD_NETHER_ORE;
    public static Block RGOLD_END_ORE;
    public static Block RGOLD_DEEPSLATE_ORE;
    public static Block SEMBLOCK;
    public static Block SOBLOCK;
    public static Block LBLOCK;

    public static void register() {
        RGOLDBLOCK = registerBlock("rgoldblock",
                new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
        HRBLOCK = registerBlock("hrblock",
                new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));
        RGOLDORE = registerBlock("rgoldore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                        AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
        RGOLD_NETHER_ORE = registerBlock("rgold_nether_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                        AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));
        RGOLD_END_ORE = registerBlock("rgold_end_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                        AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.ROOTED_DIRT)));
        RGOLD_DEEPSLATE_ORE = registerBlock("rgold_deepslate_ore",
                new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                        AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
        SEMBLOCK = registerBlock("semblock",
                new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
        SOBLOCK = registerBlock("soblock",
                new Block(AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
        LBLOCK = registerBlock("lblock",
                new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.METAL)));
    }

    private static <T extends Block> T registerBlock(String name, T block) {
        Registry.register(Registries.BLOCK, Identifier.of(UsefultoolsMod.MOD_ID, name), block);
        Registry.register(Registries.ITEM, Identifier.of(UsefultoolsMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
        return block;
    }
}
