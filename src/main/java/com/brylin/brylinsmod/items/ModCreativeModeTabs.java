package com.brylin.brylinsmod.items;

import com.brylin.brylinsmod.BrylinsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BrylinsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BRYLIN_TAB = CREATIVE_MODE_TABS.register("brylin_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRYLINITE.get()))
                    .title(Component.translatable("creativetab.brylin_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BRYLINITE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
