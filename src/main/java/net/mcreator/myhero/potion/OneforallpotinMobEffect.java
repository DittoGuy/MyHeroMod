
package net.mcreator.myhero.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.myhero.procedures.OneforallpotinOnEffectActiveTickProcedure;

public class OneforallpotinMobEffect extends MobEffect {
	public OneforallpotinMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.my_hero.oneforallpotin";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		OneforallpotinOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
