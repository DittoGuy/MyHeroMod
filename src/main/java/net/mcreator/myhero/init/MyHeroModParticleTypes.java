
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myhero.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.myhero.MyHeroMod;

public class MyHeroModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MyHeroMod.MODID);
	public static final RegistryObject<SimpleParticleType> INVISIBILITYD = REGISTRY.register("invisibilityd", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> AIR = REGISTRY.register("air", () -> new SimpleParticleType(false));
}
