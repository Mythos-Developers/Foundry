package net.mythos.foundry.foundation.registry;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mythos.foundry.FoundryMod;
import net.mythos.foundry.foundation.item.AmalgamScytheItem;
import net.mythos.foundry.foundation.item.BoltItem;
import net.mythos.foundry.foundation.item.ScytheItem;
import net.mythos.foundry.foundation.item.SickleItem;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class RegisterItems {

	public static Item WOODEN_SCYTHE = new ScytheItem(ToolMaterials.WOOD, 7, -2.4F);
	public static Item STONE_SCYTHE = new ScytheItem(ToolMaterials.STONE, 7, -2.4F);
	public static Item IRON_SCYTHE = new ScytheItem(ToolMaterials.IRON, 7, -2.4F);
	public static Item GOLDEN_SCYTHE = new ScytheItem(ToolMaterials.GOLD, 7, -2.4F);
	public static Item DIAMOND_SCYTHE = new ScytheItem(ToolMaterials.DIAMOND, 7, -2.4F);
	public static Item NETHERITE_SCYTHE = new ScytheItem(ToolMaterials.NETHERITE, 7, -2.4F);

	public static Item AMALGAM_SCYTHE = new AmalgamScytheItem(ToolMaterials.NETHERITE, 10, -2F);

	public static Item WOODEN_DAGGER = new SwordItem(ToolMaterials.WOOD, 1, -1.9F, new QuiltItemSettings());
	public static Item STONE_DAGGER = new SwordItem(ToolMaterials.STONE, 1, -1.9F, new QuiltItemSettings());
	public static Item IRON_DAGGER = new SwordItem(ToolMaterials.IRON, 1, -1.9F, new QuiltItemSettings());
	public static Item GOLDEN_DAGGER = new SwordItem(ToolMaterials.GOLD, 1, -1.9F, new QuiltItemSettings());
	public static Item DIAMOND_DAGGER = new SwordItem(ToolMaterials.DIAMOND, 1, -1.9F, new QuiltItemSettings());
	public static Item NETHERITE_DAGGER = new SwordItem(ToolMaterials.NETHERITE, 1, -1.9F, new QuiltItemSettings());

	public static Item NETHERITE_SICKLE = new SickleItem(ToolMaterials.NETHERITE, 4, -1.8F);

	public static Item BOLT = new BoltItem(new QuiltItemSettings());

	public static void registerItems() {

		registerItem("bolt", BOLT);

		registerItem("wooden_scythe", WOODEN_SCYTHE);
		registerItem("stone_scythe", STONE_SCYTHE);
		registerItem("iron_scythe", IRON_SCYTHE);
		registerItem("golden_scythe", GOLDEN_SCYTHE);
		registerItem("diamond_scythe", DIAMOND_SCYTHE);
		registerItem("netherite_scythe", NETHERITE_SCYTHE);

		registerItem("amalgam_scythe", AMALGAM_SCYTHE);

		registerItem("wooden_dagger", WOODEN_DAGGER);
		registerItem("stone_dagger", STONE_DAGGER);
		registerItem("iron_dagger", IRON_DAGGER);
		registerItem("golden_dagger", GOLDEN_DAGGER);
		registerItem("diamond_dagger", DIAMOND_DAGGER);
		registerItem("netherite_dagger", NETHERITE_DAGGER);

		registerItem("netherite_sickle", NETHERITE_SICKLE);

	}

	public static void registerItem(String name, Item item) {
		Registry.register(Registry.ITEM, new Identifier(FoundryMod.ID, name), item);
	}

}
