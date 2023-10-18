package net.mcreator.myhero.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.myhero.network.MyHeroModVariables;

public class PermeationGateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean permeation = false;
		boolean gate = false;
		permeation = false;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("my_hero:permeation_adv"))).isDone()
				&& permeation == false) {
			if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk == 1) {
				{
					String _setval = "permeation";
					entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selecetedquirk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
