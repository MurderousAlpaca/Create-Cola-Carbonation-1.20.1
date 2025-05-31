package com.elmods.createcola.fluid;

import com.elmods.createcola.item.ModCreativeModTabs;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import static com.elmods.createcola.CreateCola.REGISTRATE;

public class Fluids {
    static {
        REGISTRATE.setCreativeTab(ModCreativeModTabs.TUTORIAL_TAB);
    }

    public static final FluidEntry<ForgeFlowingFluid.Flowing> COLA_SYRUP =
            REGISTRATE.standardFluid("cola_syrup")
                    .lang("Cola Syrup")
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
    public static final FluidEntry<ForgeFlowingFluid.Flowing> COLA =
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

    public static final FluidEntry<ForgeFlowingFluid.Flowing> CHERRY_SYRUP =
            REGISTRATE.standardFluid("cherry_syrup")
                    .lang("Cherry Syrup")
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
    public static final FluidEntry<ForgeFlowingFluid.Flowing> CHERRY_COLA =
            REGISTRATE.standardFluid("cherry_cola")
                    .lang("Cherry Cola")
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

    public static final FluidEntry<ForgeFlowingFluid.Flowing> VANILLA_SYRUP =
            REGISTRATE.standardFluid("vanilla_syrup")
                    .lang("Vanilla Syrup")
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
    public static final FluidEntry<ForgeFlowingFluid.Flowing> VANILLA_COLA =
            REGISTRATE.standardFluid("vanilla_cola")
                    .lang("Vanilla Cola")
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

    public static final FluidEntry<ForgeFlowingFluid.Flowing> CHERRY_VANILLA_COLA =
            REGISTRATE.standardFluid("cherry_vanilla_cola")
                    .lang("Cherry Vanilla Cola")
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
    public static final FluidEntry<ForgeFlowingFluid.Flowing> CHERRY_VANILLA_SYRUP =
            REGISTRATE.standardFluid("cherry_vanilla_syrup")
                    .lang("Cherry Vanilla Syrup")
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

    public static final FluidEntry<ForgeFlowingFluid.Flowing> CARBONATED_WATER =
            REGISTRATE.standardFluid("carbonated_water")
                    .lang("Carbonated Water")
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
    public static final FluidEntry<ForgeFlowingFluid.Flowing> ACID =
            REGISTRATE.standardFluid("acid")
                    .lang("Acid")
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
    public static void init() {}
}