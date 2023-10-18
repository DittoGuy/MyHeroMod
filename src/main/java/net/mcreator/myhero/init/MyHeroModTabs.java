
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myhero.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MyHeroModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(MyHeroModItems.COPY_SPAWN_EGG.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("my_hero", "tempbeforegui"),
				builder -> builder.title(Component.translatable("item_group.my_hero.tempbeforegui")).icon(() -> new ItemStack(MyHeroModItems.SUPER_REGENERATION_1.get())).displayItems((parameters, tabData) -> {
					tabData.accept(MyHeroModItems.SUPER_REGENERATION_1.get());
					tabData.accept(MyHeroModItems.SHOCK_ABSORPTION.get());
					tabData.accept(MyHeroModItems.INVISIBILITY.get());
					tabData.accept(MyHeroModItems.ENGINE.get());
					tabData.accept(MyHeroModItems.RECIPRO_BURST.get());
					tabData.accept(MyHeroModItems.FLOATITEM.get());
					tabData.accept(MyHeroModItems.AIR_CANNON.get());
					tabData.accept(MyHeroModItems.FLOATFLING.get());
				})

		);
	}
}
