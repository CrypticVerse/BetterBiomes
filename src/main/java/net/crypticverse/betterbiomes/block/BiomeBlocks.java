package net.crypticverse.betterbiomes.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import net.crypticverse.betterbiomes.BetterBiomes;
import net.crypticverse.betterbiomes.block.custom.MapleSyrupStationBlock;
import net.crypticverse.betterbiomes.block.custom.TappedBucketBlock;
import net.crypticverse.betterbiomes.block.custom.ThinTreeBlock;
import net.crypticverse.betterbiomes.world.tree.BetterBiomesSaplingGen;

public class BiomeBlocks {

    // Maple Wood
    public static final ResourceLocation MAPLE_SIGN_TEXTURE = new ResourceLocation(BetterBiomes.MOD_ID, "entity/signs/maple");
    public static final ResourceLocation MAPLE_HANGING_SIGN_TEXTURE = new ResourceLocation(BetterBiomes.MOD_ID, "entity/signs/hanging/maple");
    public static final ResourceLocation MAPLE_HANGING_GUI_SIGN_TEXTURE = new ResourceLocation(BetterBiomes.MOD_ID, "textures/gui/hanging_signs/maple");
    public static final Block MAPLE_LOG = registerBlock("maple_log", new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood", new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", new RotatedPillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves", Blocks.leaves(SoundType.GRASS));
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling", new SaplingBlock(BetterBiomesSaplingGen.MAPLE, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block MAPLE_SYRUP_BOILER = registerBlock("maple_syrup_boiler", new MapleSyrupStationBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).noOcclusion()));
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs", new StairBlock(BiomeBlocks.MAPLE_PLANKS.defaultBlockState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block MAPLE_BUTTON = registerBlock("maple_button", new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block MAPLE_FENCE = registerBlock("maple_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)));
    public static final Block MAPLE_DOOR = registerBlock("maple_door", new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR).noOcclusion()));
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", new TrapDoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).noOcclusion()));
    public static final Block STANDING_MAPLE_SIGN = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(BetterBiomes.MOD_ID, "maple_standing_sign"), new TerraformSignBlock(MAPLE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_MAPLE_SIGN = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(BetterBiomes.MOD_ID, "maple_wall_sign"), new TerraformWallSignBlock(MAPLE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_MAPLE_SIGN = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(BetterBiomes.MOD_ID, "maple_hanging_sign"), new TerraformHangingSignBlock(MAPLE_HANGING_SIGN_TEXTURE, MAPLE_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_MAPLE_SIGN = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(BetterBiomes.MOD_ID, "maple_wall_hanging_sign"), new TerraformWallHangingSignBlock(MAPLE_HANGING_SIGN_TEXTURE, MAPLE_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final Block TAPPED_BUCKET = registerWithoutBlockItem("tapped_bucket_block", new TappedBucketBlock(FabricBlockSettings.copyOf(Blocks.COCOA)));

    // Thin Logs
    public static final Block THIN_ACACIA_LOG = registerBlock("thin_acacia_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG)));
    public static final Block THIN_BIRCH_LOG = registerBlock("thin_birch_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_LOG)));
    public static final Block THIN_CHERRY_LOG = registerBlock("thin_cherry_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LOG)));
    public static final Block THIN_DARK_OAK_LOG = registerBlock("thin_dark_oak_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_LOG)));
    public static final Block THIN_JUNGLE_LOG = registerBlock("thin_jungle_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LOG)));
    public static final Block THIN_MANGROVE_LOG = registerBlock("thin_mangrove_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_LOG)));
    public static final Block THIN_OAK_LOG = registerBlock("thin_oak_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final Block THIN_SPRUCE_LOG = registerBlock("thin_spruce_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG)));

    // Stripped Thin Logs
    public static final Block STRIPPED_THIN_ACACIA_LOG = registerBlock("stripped_thin_acacia_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_ACACIA_LOG)));
    public static final Block STRIPPED_THIN_BIRCH_LOG = registerBlock("stripped_thin_birch_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_BIRCH_LOG)));
    public static final Block STRIPPED_THIN_CHERRY_LOG = registerBlock("stripped_thin_cherry_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_THIN_DARK_OAK_LOG = registerBlock("stripped_thin_dark_oak_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_DARK_OAK_LOG)));
    public static final Block STRIPPED_THIN_JUNGLE_LOG = registerBlock("stripped_thin_jungle_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_JUNGLE_LOG)));
    public static final Block STRIPPED_THIN_MANGROVE_LOG = registerBlock("stripped_thin_mangrove_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_MANGROVE_LOG)));
    public static final Block STRIPPED_THIN_OAK_LOG = registerBlock("stripped_thin_oak_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_THIN_SPRUCE_LOG = registerBlock("stripped_thin_spruce_log", new ThinTreeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG)));


    // Block Families
    public static final BlockFamily MAPLE_STANDING_FAMILY = BlockFamilies.familyBuilder(MAPLE_PLANKS).sign(STANDING_MAPLE_SIGN, WALL_MAPLE_SIGN).recipeGroupPrefix("wooden").recipeUnlockedBy("has_planks").getFamily();

    private static Block registerBlock(String name, Block block) {registerBlockItem(name, block);return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(BetterBiomes.MOD_ID, name), block);}
    private static Item registerBlockItem(String name, Block block) {return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(BetterBiomes.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));}
    public static void registerModBlocks() {BetterBiomes.LOGGER.info("Registering Blocks for " + BetterBiomes.REGISTRY_ID);}

    public static Block registerWithoutBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(BetterBiomes.MOD_ID, name), block);
    }
}
