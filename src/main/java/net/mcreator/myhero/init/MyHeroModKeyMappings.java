
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myhero.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.myhero.network.UsequirkMessage;
import net.mcreator.myhero.network.SwitchquirkMessage;
import net.mcreator.myhero.MyHeroMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MyHeroModKeyMappings {
	public static final KeyMapping SWITCHQUIRK = new KeyMapping("key.my_hero.switchquirk", GLFW.GLFW_KEY_R, "key.categories.quirk") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MyHeroMod.PACKET_HANDLER.sendToServer(new SwitchquirkMessage(0, 0));
				SwitchquirkMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USEQUIRK = new KeyMapping("key.my_hero.usequirk", GLFW.GLFW_KEY_Z, "key.categories.mha") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MyHeroMod.PACKET_HANDLER.sendToServer(new UsequirkMessage(0, 0));
				UsequirkMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SWITCHQUIRK);
		event.register(USEQUIRK);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				SWITCHQUIRK.consumeClick();
				USEQUIRK.consumeClick();
			}
		}
	}
}
