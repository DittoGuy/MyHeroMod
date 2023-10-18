package net.mcreator.myhero.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.myhero.network.MyHeroModVariables;

public class SwitchquirkOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean gate = false;
		boolean floatd = false;
		boolean gearshiftD = false;
		boolean healD = false;
		boolean permeation = false;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("my_hero:quirk_engine"))).isDone()
				&& gate == false) {
			if (!entity.isShiftKeyDown()) {
				if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk < 3) {
					{
						double _setval = (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk + 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					GateProcedure.execute(entity);
				} else {
					{
						double _setval = 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					GateProcedure.execute(entity);
				}
			} else if (entity.isShiftKeyDown()) {
				if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk <= 3
						&& (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk != 1) {
					{
						double _setval = (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk + 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					GateProcedure.execute(entity);
				} else if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk != 1) {
					{
						double _setval = 3;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					GateProcedure.execute(entity);
				}
			}
		}
		if (entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel && _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("my_hero:floatquirk"))).isDone()
				&& floatd == false) {
			if (!entity.isShiftKeyDown()) {
				if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk < 3) {
					{
						double _setval = (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk + 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					FloatgateProcedure.execute(entity);
				} else {
					{
						double _setval = 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					FloatgateProcedure.execute(entity);
				}
			} else if (entity.isShiftKeyDown()) {
				if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk <= 3
						&& (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk != 1) {
					{
						double _setval = (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk + 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					FloatgateProcedure.execute(entity);
				} else if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk != 1) {
					{
						double _setval = 3;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					FloatgateProcedure.execute(entity);
				}
			}
			FloatgateProcedure.execute(entity);
			if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk == 1) {
				{
					String _setval = "Float-Self";
					entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selecetedquirk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			FloatgateProcedure.execute(entity);
			if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk == 2) {
				{
					String _setval = "float-Others";
					entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selecetedquirk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			FloatgateProcedure.execute(entity);
			if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk == 3) {
				{
					String _setval = "Float-everyone";
					entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selecetedquirk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			FloatgateProcedure.execute(entity);
		}
		if (entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel && _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("my_hero:gearshift_quirk"))).isDone()
				&& gearshiftD == false) {
			if (!entity.isShiftKeyDown()) {
				if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk < 3) {
					{
						double _setval = (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk + 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					GearshiftgateProcedure.execute(entity);
				} else {
					{
						double _setval = 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					GearshiftgateProcedure.execute(entity);
				}
			} else if (entity.isShiftKeyDown()) {
				if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk <= 3
						&& (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk != 1) {
					{
						double _setval = (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk + 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					GearshiftgateProcedure.execute(entity);
				} else if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk != 1) {
					{
						double _setval = 3;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					GearshiftgateProcedure.execute(entity);
				}
			}
			GearshiftgateProcedure.execute(entity);
			if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk == 1) {
				{
					String _setval = "Gear Shift-Self Speed 4";
					entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selecetedquirk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			GearshiftgateProcedure.execute(entity);
			if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk == 2) {
				{
					String _setval = "Gear Shift-Other Speed 4";
					entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selecetedquirk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			GearshiftgateProcedure.execute(entity);
			if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk == 3) {
				{
					String _setval = "Gear Shift-Other Slow 4";
					entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selecetedquirk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			GearshiftgateProcedure.execute(entity);
		}
		if (entity instanceof ServerPlayer _plr9 && _plr9.level instanceof ServerLevel && _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("my_hero:super_healing"))).isDone()
				&& healD == false) {
			if (!entity.isShiftKeyDown()) {
				if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk < 1) {
					{
						double _setval = (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk + 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					HealgateProcedure.execute(entity);
				} else {
					{
						double _setval = 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					HealgateProcedure.execute(entity);
				}
			} else if (entity.isShiftKeyDown()) {
				if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk <= 1
						&& (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk != 1) {
					{
						double _setval = (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk + 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					HealgateProcedure.execute(entity);
				} else if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk != 1) {
					{
						double _setval = 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					HealgateProcedure.execute(entity);
				}
			}
		}
		if (entity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel && _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("my_hero:permeation_adv"))).isDone()
				&& permeation == false) {
			if (!entity.isShiftKeyDown()) {
				if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk < 1) {
					{
						double _setval = (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk + 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					PermeationGateProcedure.execute(entity);
				} else {
					{
						double _setval = 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					PermeationGateProcedure.execute(entity);
				}
			} else if (entity.isShiftKeyDown()) {
				if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk <= 1
						&& (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk != 1) {
					{
						double _setval = (entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk + 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					PermeationGateProcedure.execute(entity);
				} else if ((entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MyHeroModVariables.PlayerVariables())).switchquirk != 1) {
					{
						double _setval = 1;
						entity.getCapability(MyHeroModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.switchquirk = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					PermeationGateProcedure.execute(entity);
				}
			}
		}
	}
}
