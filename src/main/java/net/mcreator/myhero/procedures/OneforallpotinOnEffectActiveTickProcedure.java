package net.mcreator.myhero.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.myhero.init.MyHeroModParticleTypes;

public class OneforallpotinOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MyHeroModParticleTypes.ONEFORALLD.get()), x, y, z, 10, 0.2, 1, 0.2, 0);
	}
}
