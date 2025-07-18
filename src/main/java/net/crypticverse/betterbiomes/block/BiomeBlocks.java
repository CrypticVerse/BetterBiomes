package net.crypticverse.betterbiomes.block;

import com.terraformersmc.terraform.sign.api.block.TerraformSignBlockHelper;
import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.custom.TappedBucketBlock;
import net.crypticverse.betterbiomes.util.BBWoodTypes;
import net.crypticverse.betterbiomes.world.tree.BetterBiomesSaplingGen;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class BiomeBlocks {

    public static final Block MAPLE_LOG = registerBlock("maple_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks", Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves", settings -> new TintedParticleLeavesBlock(0.01F, settings), Blocks.createLeavesSettings(BlockSoundGroup.GRASS));
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling", settings -> new SaplingBlock(BetterBiomesSaplingGen.MAPLE, settings), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs", settings -> new StairsBlock(BiomeBlocks.MAPLE_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB));
    public static final Block MAPLE_BUTTON = registerBlock("maple_button", settings -> new ButtonBlock(BlockSetType.OAK, 10, settings), AbstractBlock.Settings.copy(Blocks.OAK_BUTTON));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", settings -> new PressurePlateBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE));
    public static final Block MAPLE_FENCE = registerBlock("maple_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE));
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", settings -> new FenceGateBlock(WoodType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block MAPLE_DOOR = registerBlock("maple_door", settings -> new DoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_DOOR).nonOpaque());
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", settings -> new TrapdoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).nonOpaque());

    public static final Block TAPPED_BUCKET = registerBlockWithoutItem("tapped_bucket_block", TappedBucketBlock::new, AbstractBlock.Settings.copy(Blocks.COCOA));

    public static final Block STANDING_MAPLE_SIGN = TerraformSignBlockHelper.registerSignBlock(Identifier.of(BetterBiomes.MOD_ID, "maple_sign"), settings -> new SignBlock(BBWoodTypes.MAPLE_WOOD_TYPE, settings), AbstractBlock.Settings.copy(Blocks.OAK_SIGN));
    public static final Block WALL_MAPLE_SIGN = TerraformSignBlockHelper.registerSignBlock(Identifier.of(BetterBiomes.MOD_ID, "maple_wall_sign"), settings -> new WallSignBlock(BBWoodTypes.MAPLE_WOOD_TYPE, settings), AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN));
    public static final Block HANGING_MAPLE_SIGN = TerraformSignBlockHelper.registerSignBlock(Identifier.of(BetterBiomes.MOD_ID, "maple_hanging_sign"), settings -> new HangingSignBlock(BBWoodTypes.MAPLE_WOOD_TYPE, settings), AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_MAPLE_SIGN = TerraformSignBlockHelper.registerSignBlock(Identifier.of(BetterBiomes.MOD_ID, "maple_wall_hanging_sign"), settings -> new WallHangingSignBlock(BBWoodTypes.MAPLE_WOOD_TYPE, settings), AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function, AbstractBlock.Settings settings) {
        Block block = function.apply(settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterBiomes.MOD_ID, name))));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, name), block);
    }

    public static Block registerBlockWithoutItem(String name, Function<AbstractBlock.Settings, Block> function, AbstractBlock.Settings settings) {
        Block block = function.apply(settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BetterBiomes.MOD_ID, name))));
        return Registry.register(Registries.BLOCK, Identifier.of(BetterBiomes.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BetterBiomes.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterBiomes.MOD_ID, name)))));
    }
    public static void registerModBlocks() {
        BetterBiomes.LOGGER.info("Registering Blocks for" + BetterBiomes.MOD_ID);
    }
}
