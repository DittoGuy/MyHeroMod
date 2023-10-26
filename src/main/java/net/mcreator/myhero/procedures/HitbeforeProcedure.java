package net.mcreator.myhero.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.myhero.network.MyHeroModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HitbeforeProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity entity, double amount) {
		execute(null, entity, amount);
	}

	private static void execute(@Nullable Event event, Entity entity, double amount) {
		if (entity == null)
			return;
		double armor = 0;
		double dmg = 0;
		if (event != null && event.isCancelable()) {
			event.setCanceled(true);
		}
		dmg = amount;
		if (entity.getPersistentData().getBoolean("hit")) {
			entity.getPersistentData().putBoolean("hit", false);
			dmg = dmg + entity.getPersistentData().getDouble("deal");
		}
		armor = entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0;
		dmg = dmg * (25 / (25 + armor));
		dmg = dmg * (200 / (200 + armor));
		if (entity instanceof Player) {
			{
				double _setval = (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).Health - dmg;
				entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Health = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - dmg));
		}
	}
}
