
package net.mcreator.myhero.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;

import net.minecraft.commands.Commands;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class SetmaxhealthCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("set_max_health").requires(s -> s.hasPermission(1)).then(Commands.argument("number", DoubleArgumentType.doubleArg())));
	}
}
