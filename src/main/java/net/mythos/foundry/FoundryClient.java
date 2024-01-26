package net.mythos.foundry;

import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingPluginManager;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.PlayerKeyPairManagerImpl;
import net.minecraft.server.PlayerManager;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.minecraft.ClientOnly;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

@ClientOnly
public class FoundryClient implements ClientModInitializer {

	@Override
	public void onInitializeClient(ModContainer mod) {

		ModelLoadingPluginManager.registerPlugin((resources) -> {;

			resources.addModels(new ModelIdentifier(FoundryMod.ID, "wooden_scythe_gui", "inventory"));
			resources.addModels(new ModelIdentifier(FoundryMod.ID, "stone_scythe_gui", "inventory"));
			resources.addModels(new ModelIdentifier(FoundryMod.ID, "iron_scythe_gui", "inventory"));
			resources.addModels(new ModelIdentifier(FoundryMod.ID, "golden_scythe_gui", "inventory"));
			resources.addModels(new ModelIdentifier(FoundryMod.ID, "diamond_scythe_gui", "inventory"));
			resources.addModels(new ModelIdentifier(FoundryMod.ID, "netherite_scythe_gui", "inventory"));

			resources.addModels(new ModelIdentifier(FoundryMod.ID, "netherite_sickle_gui", "inventory"));

		});

	}

}
