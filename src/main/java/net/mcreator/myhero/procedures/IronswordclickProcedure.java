package net.mcreator.myhero.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class IronswordclickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("shield") == true) {
			entity.getPersistentData().putBoolean("shield", false);
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("iron sword selected "), false);
		entity.getPersistentData().putBoolean("Ironsword", true);
	}
}
