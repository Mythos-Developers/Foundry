package net.mythos.foundry;

import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class FoundryClient implements ClientModInitializer {

	@Override
	public void onInitializeClient(ModContainer mod) {

		ModelLoadingRegistry.INSTANCE.registerModelProvider((resources, out) -> {

			out.accept(new ModelIdentifier(FoundryMod.ID, "wooden_scythe_gui", "inventory"));
			out.accept(new ModelIdentifier(FoundryMod.ID, "stone_scythe_gui", "inventory"));
			out.accept(new ModelIdentifier(FoundryMod.ID, "iron_scythe_gui", "inventory"));
			out.accept(new ModelIdentifier(FoundryMod.ID, "golden_scythe_gui", "inventory"));
			out.accept(new ModelIdentifier(FoundryMod.ID, "diamond_scythe_gui", "inventory"));
			out.accept(new ModelIdentifier(FoundryMod.ID, "netherite_scythe_gui", "inventory"));

		});

	}

}
