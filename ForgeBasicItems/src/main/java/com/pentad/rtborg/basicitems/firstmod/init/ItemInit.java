package com.pentad.rtborg.basicitems.firstmod.init;

import com.pentad.rtborg.basicitems.firstmod.FirstModMain;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			FirstModMain.MOD_ID);

	// This is what they have us do first
//	public static final RegistryObject<Item> SMILE = ITEMS.register("smile",
//            () -> new Item(new Item.Properties()));

	// Using an existing tab
//	public static final RegistryObject<Item> SMILE = ITEMS.register("smile",
//			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

	public static final RegistryObject<Item> SMILE = ITEMS.register("smile",
			() -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));

	public static class ModCreativeTab extends CreativeModeTab {
		public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "firstmod");

		private ModCreativeTab(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(SMILE.get());
		}
	}
}
