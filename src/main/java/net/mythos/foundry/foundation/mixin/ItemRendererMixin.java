package net.mythos.foundry.foundation.mixin;

import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.mythos.foundry.FoundryMod;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {

	@Unique
	private static final ModelIdentifier SCYTHE_INVENTORY_MODEL = new ModelIdentifier(new Identifier(FoundryMod.ID, "scythe_gui"), "inventory");

	@Shadow
	private @Final ItemModels models;

	@ModifyVariable(method = "renderItem", at = @At("HEAD"), argsOnly = true)
	private BakedModel foundry_guiModel(BakedModel model, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel modelAgain) {
		boolean bl = renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED;

		if (bl) {

			if (stack.isOf(FoundryMod.SCYTHE)) {

				BakedModel inventoryModel = models.getModelManager().getModel(SCYTHE_INVENTORY_MODEL);

				if (inventoryModel != models.getModelManager().getMissingModel()) {

					return inventoryModel;

				}

			}

		}

		return model;
	}

}
