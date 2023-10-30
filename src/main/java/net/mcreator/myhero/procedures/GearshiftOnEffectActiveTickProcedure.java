package net.mcreator.myhero.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class GearshiftOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean posY = false;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, (y - 1), z, 3, 1, 0.9, 1, 0);
	}
}
