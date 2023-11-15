
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myhero.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.myhero.client.renderer.NomutestRenderer;
import net.mcreator.myhero.client.renderer.CopyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MyHeroModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MyHeroModEntities.AIR_CANNON.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MyHeroModEntities.COPY.get(), CopyRenderer::new);
		event.registerEntityRenderer(MyHeroModEntities.NOMUTEST.get(), NomutestRenderer::new);
	}
}
