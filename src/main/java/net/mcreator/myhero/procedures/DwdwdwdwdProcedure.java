package net.mcreator.myhero.procedures;

import net.minecraft.world.entity.Entity;

public class DwdwdwdwdProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("sayin", true);
	}
}
