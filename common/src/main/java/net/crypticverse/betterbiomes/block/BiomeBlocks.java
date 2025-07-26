package net.crypticverse.betterbiomes.block;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.custom.SignBlockHelper;
import net.crypticverse.betterbiomes.block.custom.TappedBucketBlock;
import net.crypticverse.betterbiomes.util.BBWoodTypes;
import net.crypticverse.betterbiomes.world.tree.BetterBiomesSaplingGen;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.Function;

public class BiomeBlocks {

    public static final Block MAPLE_LOG = registerBlock("maple_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves", settings -> new TintedParticleLeavesBlock(0.01F, settings), Blocks.leavesProperties(SoundType.GRASS));
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling", settings -> new SaplingBlock(BetterBiomesSaplingGen.MAPLE, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs", settings -> new StairBlock(BiomeBlocks.MAPLE_PLANKS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab", SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));
    public static final Block MAPLE_BUTTON = registerBlock("maple_button", settings -> new ButtonBlock(BlockSetType.OAK, 10, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", settings -> new PressurePlateBlock(BlockSetType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));
    public static final Block MAPLE_FENCE = registerBlock("maple_fence", FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", settings -> new FenceGateBlock(WoodType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));
    public static final Block MAPLE_DOOR = registerBlock("maple_door", settings -> new DoorBlock(BlockSetType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).noOcclusion());
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", settings -> new TrapDoorBlock(BlockSetType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).noOcclusion());

    public static final Block TAPPED_BUCKET = registerBlockWithoutItem("tapped_bucket_block", TappedBucketBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.COCOA));

    public static final Block STANDING_MAPLE_SIGN = SignBlockHelper.registerSign(ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, "maple_sign"), settings -> new StandingSignBlock(BBWoodTypes.MAPLE_WOOD_TYPE, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block WALL_MAPLE_SIGN = SignBlockHelper.registerSign(ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, "maple_wall_sign"), settings -> new WallSignBlock(BBWoodTypes.MAPLE_WOOD_TYPE, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN));
    public static final Block HANGING_MAPLE_SIGN = SignBlockHelper.registerSign(ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, "maple_hanging_sign"), settings -> new CeilingHangingSignBlock(BBWoodTypes.MAPLE_WOOD_TYPE, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block WALL_HANGING_MAPLE_SIGN = SignBlockHelper.registerSign(ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, "maple_wall_hanging_sign"), settings -> new WallHangingSignBlock(BBWoodTypes.MAPLE_WOOD_TYPE, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties settings) {
        Block block = function.apply(settings.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, name))));
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, name), block);
    }

    public static Block registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties settings) {
        Block block = function.apply(settings.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(BetterBiomes.MOD_ID, name)))));
    }
    public static void registerModBlocks() {
        BetterBiomes.LOGGER.info("Registering Blocks for" + BetterBiomes.MOD_ID);
    }
}
