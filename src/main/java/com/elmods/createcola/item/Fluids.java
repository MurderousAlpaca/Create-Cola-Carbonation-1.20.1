package com.elmods.createcola.item;

import com.elmods.createcola.CreateCola;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class Fluids {
    private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateCola.MOD_ID);

    static {
        REGISTRATE.setCreativeTab(ModCreativeModTabs.TUTORIAL_TAB);
    }

    public static final FluidEntry<ForgeFlowingFluid.Flowing> ACID =
            REGISTRATE.standardFluid("cola")
                    .lang("Cola")
                    .properties(b -> b.viscosity(2000)
                            .density(1400))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(25)
                            .slopeFindDistance(3)
                            .explosionResistance(100f))
                    .source(ForgeFlowingFluid.Source::new)
                    .block()
                    .properties(p -> p.mapColor(MapColor.COLOR_BROWN))
                    .build()
                    .bucket()
                    .build()
                    .register();
}