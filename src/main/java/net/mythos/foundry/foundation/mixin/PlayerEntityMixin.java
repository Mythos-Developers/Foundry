package net.mythos.foundry.foundation.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {

	@Shadow
	@Final
	private PlayerInventory inventory;

	@Inject(method = "tick", at = @At("HEAD"))
	private void clearEnchanted(CallbackInfo ci) {

		for(int i = 0; i < 27; i++) {

			if(inventory.getStack(i).hasEnchantments()) {
				inventory.setStack(i, inventory.getStack(i).getItem().getDefaultStack());
			}

		}

	}

}
