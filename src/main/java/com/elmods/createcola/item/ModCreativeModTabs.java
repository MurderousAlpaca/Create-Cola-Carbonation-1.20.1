package com.elmods.createcola.item;

import com.elmods.createcola.CreateCola;
import com.elmods.createcola.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateCola.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COLA.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COLA.get());
                        output.accept(ModItems.COLA_CAN.get());
                        output.accept(ModItems.CHERRY_COLA.get());
                        output.accept(ModItems.CHERRY_CAN.get());
                        output.accept(ModItems.VANILLA_COLA.get());
                        output.accept(ModItems.VANILLA_CAN.get());
                        output.accept(ModItems.CHERRY_VANILLA_COLA.get());
                        output.accept(ModItems.CHERRY_VANILLA_CAN.get());
                        output.accept(ModItems.CARBONATED_WATER.get());
                        output.accept(ModItems.CARBONATED_WATER_CAN.get());
                        output.accept(ModItems.EMPTY_CAN.get());
                        output.accept(ModItems.CARBONATE_POWDER.get());

                        output.accept(ModBlocks.COLA_CRATE.get());
                        output.accept(ModBlocks.CHERRY_CRATE.get());
                        output.accept(ModBlocks.VANILLA_CRATE.get());
                        output.accept(ModBlocks.CHERRY_VANILLA_CRATE.get());
                        output.accept(ModBlocks.COLA_BOX.get());
                        output.accept(ModBlocks.CHERRY_BOX.get());
                        output.accept(ModBlocks.VANILLA_BOX.get());
                        output.accept(ModBlocks.CHERRY_VANILLA_BOX.get());
                        output.accept(ModBlocks.CARBONATED_WATER_CRATE.get());
                        output.accept(ModBlocks.CARBONATED_WATER_BOX.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}