package com.elmods.createcola.item;

import com.elmods.createcola.CreateCola;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateCola.MOD_ID);

    public static final RegistryObject<Item> COLA = ITEMS.register("cola",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COLA_CAN = ITEMS.register("cola_can",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_COLA = ITEMS.register("cherry_cola",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CAN = ITEMS.register("cherry_can",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VANILLA_COLA = ITEMS.register("vanilla_cola",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VANILLA_CAN = ITEMS.register("vanilla_can",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_VANILLA_COLA = ITEMS.register("cherry_vanilla_cola",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_VANILLA_CAN = ITEMS.register("cherry_vanilla_can",
                () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTY_CAN = ITEMS.register("empty_can",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARBONATE_POWDER = ITEMS.register("carbonate_powder",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
