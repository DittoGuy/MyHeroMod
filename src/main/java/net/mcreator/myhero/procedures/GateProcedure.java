package net.mcreator.myhero.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.myhero.network.MyHeroModVariables;

public class GateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		gate = false;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("my_hero:quirk_engine"))).isDone()
				&& gate == false) {
			if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk == 1) {
				{
					String _setval = "Engines On!";
					entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selecetedquirk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk == 2) {
				{
					String _setval = "Recipro Burst!!!";
					entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selecetedquirk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk == 3) {
				{
					String _setval = "Engine KICK!";
					entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selecetedquirk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
