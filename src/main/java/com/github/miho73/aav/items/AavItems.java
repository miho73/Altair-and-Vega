package com.github.miho73.aav.items;

import com.github.miho73.aav.Aav;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AavItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Aav.MOD_ID);

    // Aav Items

    ////////////

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
