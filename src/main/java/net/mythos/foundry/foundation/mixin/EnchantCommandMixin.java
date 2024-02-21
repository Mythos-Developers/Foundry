package net.mythos.foundry.foundation.mixin;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.server.command.EnchantCommand;
import net.minecraft.server.command.ServerCommandSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Collection;

@Mixin(EnchantCommand.class)
public class EnchantCommandMixin {

	/**
	 * @author ScienceMind11
	 * @reason Removing enchanting entirely
	 */
	@Overwrite
	public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {

	}

	/**
	 * @author ScienceMind11
	 * @reason Removing enchanting entirely
	 */
	@Overwrite
	private static int execute(ServerCommandSource source, Collection<? extends Entity> targets, Enchantment enchantment, int level) throws CommandSyntaxException {
		return 1;
	}

}
