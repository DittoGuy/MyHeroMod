
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myhero.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.myhero.item.TestgujiopenerItem;
import net.mcreator.myhero.item.SuperRegeneration1Item;
import net.mcreator.myhero.item.ShockAbsorptionItem;
import net.mcreator.myhero.item.ReciproBurstItem;
import net.mcreator.myhero.item.KnifeItem;
import net.mcreator.myhero.item.InvisibilityItem;
import net.mcreator.myhero.item.FloatitemItem;
import net.mcreator.myhero.item.FloatflingItem;
import net.mcreator.myhero.item.EngineItem;
import net.mcreator.myhero.item.AirCannonItem;
import net.mcreator.myhero.MyHeroMod;

public class MyHeroModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MyHeroMod.MODID);
	public static final RegistryObject<Item> SUPER_REGENERATION_1 = REGISTRY.register("super_regeneration_1", () -> new SuperRegeneration1Item());
	public static final RegistryObject<Item> SHOCK_ABSORPTION = REGISTRY.register("shock_absorption", () -> new ShockAbsorptionItem());
	public static final RegistryObject<Item> INVISIBILITY = REGISTRY.register("invisibility", () -> new InvisibilityItem());
	public static final RegistryObject<Item> ENGINE = REGISTRY.register("engine", () -> new EngineItem());
	public static final RegistryObject<Item> RECIPRO_BURST = REGISTRY.register("recipro_burst", () -> new ReciproBurstItem());
	public static final RegistryObject<Item> FLOATITEM = REGISTRY.register("floatitem", () -> new FloatitemItem());
	public static final RegistryObject<Item> AIR_CANNON = REGISTRY.register("air_cannon", () -> new AirCannonItem());
	public static final RegistryObject<Item> FLOATFLING = REGISTRY.register("floatfling", () -> new FloatflingItem());
	public static final RegistryObject<Item> COPY_SPAWN_EGG = REGISTRY.register("copy_spawn_egg", () -> new ForgeSpawnEggItem(MyHeroModEntities.COPY, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TESTGUJIOPENER = REGISTRY.register("testgujiopener", () -> new TestgujiopenerItem());
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
}
