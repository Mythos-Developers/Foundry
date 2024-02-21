package net.mythos.foundry;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mythos.foundry.foundation.registry.RegisterItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoundryMod implements ModInitializer {

	public static final String ID = "foundry";
	public static final String NAME = "Foundry";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	public static Identifier[] blacklistedIdentifiers;

	@Override
	public void onInitialize(ModContainer mod) {

		RegisterItems.registerItems();

	}

	public static String getIdAsString(Item item) {
		return Registry.ITEM.getId(item).toString();
	}

}
