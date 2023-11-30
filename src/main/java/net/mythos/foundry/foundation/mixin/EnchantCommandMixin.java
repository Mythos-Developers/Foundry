package net.mythos.foundry.foundation.mixin;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandBuildContext;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.command.argument.RegistryEntryArgumentType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Holder;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.EnchantCommand;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Collection;
import java.util.Iterator;

@Mixin(EnchantCommand.class)
public class EnchantCommandMixin {

	/**
	 * @author ScienceMind11
	 * @reason Removing enchanting entirely
	 */
	@Overwrite
	public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandBuildContext context) {

	}

	/**
	 * @author ScienceMind11
	 * @reason Removing enchanting entirely
	 */
	@Overwrite
	private static int execute(ServerCommandSource source, Collection<? extends Entity> targets, Holder<Enchantment> enchantment, int level) throws CommandSyntaxException {
		return 1;
	}

}
