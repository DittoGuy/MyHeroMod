package net.mcreator.myhero.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.myhero.network.MyHeroModVariables;

public class OneforallstageupOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).selecetedquirk).equals("one for all full cowl 5%")) {
			{
				String _setval = "one for all full cowl 10%";
				entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.selecetedquirk = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).selecetedquirk).equals("one for all full cowl 10%")) {
			{
				String _setval = "one for all full cowl 15%";
				entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.selecetedquirk = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
