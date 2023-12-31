package net.mythos.foundry.foundation.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.HolderLookup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Set;

@Mixin(ItemGroups.class)
public class ItemGroupsMixin {


	/**
	 * @author ScienceMind11
	 * @reason Removing enchanted books from the creative inventory
	 */
	@Overwrite
	private static void generateMaxEnchantedBookEntries(ItemGroup.ItemStackCollector collector, HolderLookup<Enchantment> enchantmentLookup, Set<EnchantmentTarget> targets, ItemGroup.Visibility visibility) {

	}

	/**
	 * @author ScienceMind11
	 * @reason Removing enchanted books from the creative inventory
	 */
	@Overwrite
	private static void generateAllEnchantedBookEntries(ItemGroup.ItemStackCollector collector, HolderLookup<Enchantment> enchantmentLookup, Set<EnchantmentTarget> targets, ItemGroup.Visibility visibility) {

	}

}
