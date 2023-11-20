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

	public static Item WOODEN_SCYTHE = registerItem("wooden_scythe", new SwordItem(ToolMaterials.WOOD, 5, -2.4F, new QuiltItemSettings()));
	public static Item STONE_SCYTHE = registerItem("stone_scythe", new SwordItem(ToolMaterials.STONE, 5, -2.4F, new QuiltItemSettings()));
	public static Item IRON_SCYTHE = registerItem("iron_scythe", new SwordItem(ToolMaterials.IRON, 5, -2.4F, new QuiltItemSettings()));
	public static Item GOLDEN_SCYTHE = registerItem("golden_scythe", new SwordItem(ToolMaterials.GOLD, 5, -2.4F, new QuiltItemSettings()));
	public static Item DIAMOND_SCYTHE = registerItem("diamond_scythe", new SwordItem(ToolMaterials.DIAMOND, 5, -2.4F, new QuiltItemSettings()));
	public static Item NETHERITE_SCYTHE = registerItem("netherite_scythe", new SwordItem(ToolMaterials.NETHERITE, 5, -2.4F, new QuiltItemSettings()));

	@Override
	public void onInitialize(ModContainer mod) {



	}

	public static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(ID, name), item);
	}

}
