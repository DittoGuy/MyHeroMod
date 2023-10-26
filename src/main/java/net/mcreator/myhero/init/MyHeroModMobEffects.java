
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myhero.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.myhero.potion.CopyactiveMobEffect;
import net.mcreator.myhero.potion.CooldownMobEffect;
import net.mcreator.myhero.MyHeroMod;

public class MyHeroModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MyHeroMod.MODID);
	public static final RegistryObject<MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
	public static final RegistryObject<MobEffect> COPYACTIVE = REGISTRY.register("copyactive", () -> new CopyactiveMobEffect());
}
