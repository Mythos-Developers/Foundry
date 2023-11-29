package net.mythos.foundry.foundation.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.command.argument.UuidArgumentType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.mythos.foundry.FoundryMod;
import net.mythos.foundry.foundation.registry.RegisterItems;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Objects;
import java.util.UUID;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {

	@Unique
	private static final ModelIdentifier WOODEN_SCYTHE = new ModelIdentifier(FoundryMod.ID, "wooden_scythe_gui", "inventory");
	@Unique
	private static final ModelIdentifier STONE_SCYTHE = new ModelIdentifier(FoundryMod.ID, "stone_scythe_gui", "inventory");
	@Unique
	private static final ModelIdentifier IRON_SCYTHE = new ModelIdentifier(FoundryMod.ID, "iron_scythe_gui", "inventory");
	@Unique
	private static final ModelIdentifier GOLDEN_SCYTHE = new ModelIdentifier(FoundryMod.ID, "golden_scythe_gui", "inventory");
	@Unique
	private static final ModelIdentifier DIAMOND_SCYTHE = new ModelIdentifier(FoundryMod.ID, "diamond_scythe_gui", "inventory");
	@Unique
	private static final ModelIdentifier NETHERITE_SCYTHE = new ModelIdentifier(FoundryMod.ID, "netherite_scythe_gui", "inventory");

	@Unique
	private static final ModelIdentifier MERCURY_SCYTHE = new ModelIdentifier(FoundryMod.ID, "mercury_scythe_gui", "inventory");

	@Shadow
	private @Final ItemModels models;

	@Shadow
	private @Final MinecraftClient client;

	@ModifyVariable(method = "renderItem", at = @At("HEAD"), argsOnly = true)
	private BakedModel foundry_guiModel(BakedModel model, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel modelAgain) {
		boolean bl = renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED;

//		assert client.player != null;
//		if(client.player.getUuid().equals(FoundryMod.UUID) && stack.isOf(RegisterItems.NETHERITE_SCYTHE)) {
//
//			if(bl) {
//				return models.getModelManager().getModel(MERCURY_SCYTHE);
//			}
//
//			return models.getModelManager().getModel(new ModelIdentifier(FoundryMod.ID, "mercury_scythe", "inventory"));
//
//		}

		if (bl) {

			if (stack.isOf(RegisterItems.WOODEN_SCYTHE)) {
				return models.getModelManager().getModel(WOODEN_SCYTHE);

			} else if (stack.isOf(RegisterItems.STONE_SCYTHE)) {
				return models.getModelManager().getModel(STONE_SCYTHE);

			} else if (stack.isOf(RegisterItems.IRON_SCYTHE)) {
				return models.getModelManager().getModel(IRON_SCYTHE);

			} if (stack.isOf(RegisterItems.GOLDEN_SCYTHE)) {
				return models.getModelManager().getModel(GOLDEN_SCYTHE);

			} else if (stack.isOf(RegisterItems.DIAMOND_SCYTHE)) {
				return models.getModelManager().getModel(DIAMOND_SCYTHE);

			} else if (stack.isOf(RegisterItems.NETHERITE_SCYTHE)) {



				return models.getModelManager().getModel(NETHERITE_SCYTHE);

			}

		}

		return model;
	}

}
