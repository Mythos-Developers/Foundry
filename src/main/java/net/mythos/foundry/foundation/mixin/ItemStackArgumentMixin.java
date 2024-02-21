package net.mythos.foundry.foundation.mixin;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import net.minecraft.command.argument.ItemStackArgument;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Holder;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ItemStackArgument.class)
public abstract class ItemStackArgumentMixin {

	@Shadow
	@Final
	private Holder<Item> item;

	@Shadow
	@Final
	@Nullable
	private NbtCompound nbt;

	@Shadow
	@Final
	private static Dynamic2CommandExceptionType OVERSTACKED_EXCEPTION;

	@Shadow
	protected abstract String getItemName();

	/**
	 * @author ScienceMind11
	 * @reason Removing enchantment capability from /give
	 */
	@Overwrite
	public ItemStack createStack(int amount, boolean checkOverstack) throws CommandSyntaxException {
		ItemStack itemStack = new ItemStack(this.item, amount);
		if (this.nbt != null) {
			this.nbt.remove("Enchantments");
			itemStack.setNbt(this.nbt);
		}

		if (checkOverstack && amount > itemStack.getMaxCount()) {
			throw OVERSTACKED_EXCEPTION.create(this.getItemName(), itemStack.getMaxCount());
		} else {
			if(!itemStack.getItem().equals(Items.ENCHANTED_BOOK)) {
				return itemStack;
			} else {
				return Items.BOOK.getDefaultStack();
			}
		}
	}

}
