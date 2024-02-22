package net.mythos.foundry.foundation.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class AmalgamScytheItem extends ScytheItem {

	public AmalgamScytheItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
		super(toolMaterial, attackDamage, attackSpeed);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

		user.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 30, 0, true, false));
		user.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 30, 0, true, false));
		user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 30, 0, true, false));


		return super.use(world, user, hand);
	}

}
