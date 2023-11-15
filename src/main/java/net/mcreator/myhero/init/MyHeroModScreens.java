
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myhero.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.myhero.client.gui.Godtest2Screen;
import net.mcreator.myhero.client.gui.EnchantsScreen;
import net.mcreator.myhero.client.gui.CreationitemguiScreen;
import net.mcreator.myhero.client.gui.CreatesionScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MyHeroModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MyHeroModMenus.CREATESION.get(), CreatesionScreen::new);
			MenuScreens.register(MyHeroModMenus.CREATIONITEMGUI.get(), CreationitemguiScreen::new);
			MenuScreens.register(MyHeroModMenus.ENCHANTS.get(), EnchantsScreen::new);
			MenuScreens.register(MyHeroModMenus.GODTEST_2.get(), Godtest2Screen::new);
		});
	}
}
