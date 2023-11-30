package net.mythos.foundry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.SimpleRegistry;
import net.minecraft.util.Identifier;
import net.mythos.foundry.foundation.registry.RegisterItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoundryMod implements ModInitializer {

	public static final String ID = "foundry";
	public static final String NAME = "Foundry";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	public static Identifier[] blacklisted_identifiers;

	@Override
	public void onInitialize(ModContainer mod) {

		LOGGER.info(getIdAsString(RegisterItems.WOODEN_SCYTHE));



	}

	public static String getIdAsString(Item item) {
		return Registries.ITEM.getId(item).toString();
	}

}
