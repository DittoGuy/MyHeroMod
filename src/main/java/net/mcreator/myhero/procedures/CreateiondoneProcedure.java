package net.mcreator.myhero.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class CreateiondoneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("Ironsword") == true) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.IRON_SWORD);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			entity.getPersistentData().putBoolean("ironsword", false);
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
		entity.getPersistentData().putBoolean("Ironsword", false);
		if (entity.getPersistentData().getBoolean("shield") == true) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.SHIELD);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			entity.getPersistentData().putBoolean("shield", false);
		}
		if (entity.getPersistentData().getBoolean("shield") == true && entity.getPersistentData().getBoolean("unbreaking") == true) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"give @p shield{Enchantments:[{id:unbreaking,lvl:3}]} 1");
		}
		entity.getPersistentData().putBoolean("unbreaking", false);
	}
}
