/*
 * MIT License
 *
 * Copyright (c) 2023 CrypticVerse
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package net.crypticverse.betterbiomes.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class StrippableBlocks {
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(BiomeBlocks.MAPLE_LOG, BiomeBlocks.STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(BiomeBlocks.MAPLE_WOOD, BiomeBlocks.STRIPPED_MAPLE_WOOD);

        // Thin logs
        StrippableBlockRegistry.register(BiomeBlocks.THIN_ACACIA_LOG, BiomeBlocks.STRIPPED_THIN_ACACIA_LOG);
        StrippableBlockRegistry.register(BiomeBlocks.THIN_BIRCH_LOG, BiomeBlocks.STRIPPED_THIN_BIRCH_LOG);
        StrippableBlockRegistry.register(BiomeBlocks.THIN_CHERRY_LOG, BiomeBlocks.STRIPPED_THIN_CHERRY_LOG);
        StrippableBlockRegistry.register(BiomeBlocks.THIN_DARK_OAK_LOG, BiomeBlocks.STRIPPED_THIN_DARK_OAK_LOG);
        StrippableBlockRegistry.register(BiomeBlocks.THIN_JUNGLE_LOG, BiomeBlocks.STRIPPED_THIN_JUNGLE_LOG);
        StrippableBlockRegistry.register(BiomeBlocks.THIN_MANGROVE_LOG, BiomeBlocks.STRIPPED_THIN_MANGROVE_LOG);
        StrippableBlockRegistry.register(BiomeBlocks.THIN_OAK_LOG, BiomeBlocks.STRIPPED_THIN_OAK_LOG);
        StrippableBlockRegistry.register(BiomeBlocks.THIN_SPRUCE_LOG, BiomeBlocks.STRIPPED_THIN_SPRUCE_LOG);
    }
}
