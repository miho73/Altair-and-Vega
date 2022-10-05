package com.github.miho73.aav.blocks;

import com.github.miho73.aav.Aav;
import com.github.miho73.aav.items.AavItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class AavBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, Aav.MOD_ID);

    // Aav Blocks

    /////////////

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab modtab) {
        RegistryObject<T> ret = BLOCKS.register(name, block);
        registerBlockItem(name, ret, modtab);
        return ret;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab modTab) {
        return AavItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(modTab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
