package net.mcreator.myhero.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.myhero.network.MyHeroModVariables;

public class QuirkvalueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).selecetedquirk;
	}
}
