package net.mcreator.myhero.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.myhero.network.MyHeroModVariables;

public class EntityAttackProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double damage = 0;
		entity.getPersistentData().putBoolean("hit", true);
		damage = Math.ceil((sourceentity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).strength * 0.1);
		entity.getPersistentData().putDouble("deal", damage);
		if (sourceentity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(("DMG:" + damage)), true);
	}
}
