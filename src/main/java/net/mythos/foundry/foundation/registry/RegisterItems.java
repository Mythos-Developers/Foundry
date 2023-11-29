package net.mythos.foundry.foundation.registry;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mythos.foundry.FoundryMod;
import net.mythos.foundry.foundation.item.ScytheItem;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class RegisterItems {

	public static Item WOODEN_SCYTHE = registerItem("wooden_scythe", new ScytheItem(ToolMaterials.WOOD, 7, -2.4F));
	public static Item STONE_SCYTHE = registerItem("stone_scythe", new ScytheItem(ToolMaterials.STONE, 7, -2.4F));
	public static Item IRON_SCYTHE = registerItem("iron_scythe", new ScytheItem(ToolMaterials.IRON, 7, -2.4F));
	public static Item GOLDEN_SCYTHE = registerItem("golden_scythe", new ScytheItem(ToolMaterials.GOLD, 7, -2.4F));
	public static Item DIAMOND_SCYTHE = registerItem("diamond_scythe", new ScytheItem(ToolMaterials.DIAMOND, 7, -2.4F));
	public static Item NETHERITE_SCYTHE = registerItem("netherite_scythe", new ScytheItem(ToolMaterials.NETHERITE, 7, -2.4F));

	public static Item WOODEN_DAGGER = registerItem("wooden_dagger", new SwordItem(ToolMaterials.WOOD, 1, -1.9F, new QuiltItemSettings()));
	public static Item STONE_DAGGER = registerItem("stone_dagger", new SwordItem(ToolMaterials.STONE, 1, -1.9F, new QuiltItemSettings()));
	public static Item IRON_DAGGER = registerItem("iron_dagger", new SwordItem(ToolMaterials.IRON, 1, -1.9F, new QuiltItemSettings()));
	public static Item GOLDEN_DAGGER = registerItem("golden_dagger", new SwordItem(ToolMaterials.GOLD, 1, -1.9F, new QuiltItemSettings()));
	public static Item DIAMOND_DAGGER = registerItem("diamond_dagger", new SwordItem(ToolMaterials.DIAMOND, 1, -1.9F, new QuiltItemSettings()));
	public static Item NETHERITE_DAGGER = registerItem("netherite_dagger", new SwordItem(ToolMaterials.NETHERITE, 1, -1.9F, new QuiltItemSettings()));

	public static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(FoundryMod.ID, name), item);
	}

}