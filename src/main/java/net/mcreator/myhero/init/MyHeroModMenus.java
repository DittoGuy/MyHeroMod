
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myhero.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.myhero.world.inventory.CreatesionMenu;
import net.mcreator.myhero.MyHeroMod;

public class MyHeroModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MyHeroMod.MODID);
	public static final RegistryObject<MenuType<CreatesionMenu>> CREATESION = REGISTRY.register("createsion", () -> IForgeMenuType.create(CreatesionMenu::new));
}
