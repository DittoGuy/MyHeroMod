package net.mcreator.myhero.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.myhero.network.MyHeroModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerupdatetickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).Health < (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MyHeroModVariables.PlayerVariables())).max_Health) {
			{
				double _setval = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##.##").format((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).Health)) + 0.1;
				entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).Health
					/ (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).max_Health)));
	}
}
