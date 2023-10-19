package net.mcreator.myhero.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class ShieldcreateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("shield", true);
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("you seleceted shield"), false);
		if (entity.getPersistentData().getBoolean("Ironsword") == true) {
			entity.getPersistentData().putBoolean("Ironsword", false);
		}
	}
}
