
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myhero.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.myhero.client.particle.ONEFORALLDParticle;
import net.mcreator.myhero.client.particle.InvisibilitydParticle;
import net.mcreator.myhero.client.particle.AirParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MyHeroModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(MyHeroModParticleTypes.INVISIBILITYD.get(), InvisibilitydParticle::provider);
		event.registerSpriteSet(MyHeroModParticleTypes.AIR.get(), AirParticle::provider);
		event.registerSpriteSet(MyHeroModParticleTypes.ONEFORALLD.get(), ONEFORALLDParticle::provider);
	}
}
