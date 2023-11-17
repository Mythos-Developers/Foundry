package net.mythos.foundry;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoundryMod implements ModInitializer {

	public static final String ID = "foundry";
	public static final String NAME = "Foundry";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	public static Item SCYTHE = Registry.register(Registries.ITEM, new Identifier(ID, "scythe"), new SwordItem(ToolMaterials.NETHERITE, 13, 2, new QuiltItemSettings()));

	@Override
	public void onInitialize(ModContainer mod) {



	}

}
