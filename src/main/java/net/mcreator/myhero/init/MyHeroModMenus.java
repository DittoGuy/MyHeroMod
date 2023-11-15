
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myhero.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.myhero.world.inventory.Godtest2Menu;
import net.mcreator.myhero.world.inventory.EnchantsMenu;
import net.mcreator.myhero.world.inventory.CreationitemguiMenu;
import net.mcreator.myhero.world.inventory.CreatesionMenu;
import net.mcreator.myhero.MyHeroMod;

public class MyHeroModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MyHeroMod.MODID);
	public static final RegistryObject<MenuType<CreatesionMenu>> CREATESION = REGISTRY.register("createsion", () -> IForgeMenuType.create(CreatesionMenu::new));
	public static final RegistryObject<MenuType<CreationitemguiMenu>> CREATIONITEMGUI = REGISTRY.register("creationitemgui", () -> IForgeMenuType.create(CreationitemguiMenu::new));
	public static final RegistryObject<MenuType<EnchantsMenu>> ENCHANTS = REGISTRY.register("enchants", () -> IForgeMenuType.create(EnchantsMenu::new));
	public static final RegistryObject<MenuType<Godtest2Menu>> GODTEST_2 = REGISTRY.register("godtest_2", () -> IForgeMenuType.create(Godtest2Menu::new));
}
