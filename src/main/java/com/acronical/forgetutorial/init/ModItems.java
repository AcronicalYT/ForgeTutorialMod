package com.acronical.forgetutorial.init;

import com.acronical.forgetutorial.ForgeTutorial;
import com.acronical.forgetutorial.items.ItemBase;
import com.acronical.forgetutorial.items.ModSpawnEggItem;
import com.acronical.forgetutorial.items.PoisonApple;
import com.acronical.forgetutorial.util.enums.ModArmorMaterial;
import com.acronical.forgetutorial.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ForgeTutorial.MOD_ID);

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<PoisonApple> POISON_APPLE = ITEMS.register("poison_apple", PoisonApple::new);

    // Spawn Eggs
    public static final RegistryObject<ModSpawnEggItem> HOG_SPAWN_EGG = ITEMS.register("hog_spawn_egg", () -> new
            ModSpawnEggItem(ModEntityType.HOG, 0xF1BF7B, 0x705128, new Item.Properties().group(ForgeTutorial.TAB)));

    // Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new
            SwordItem(ModItemTier.RUBY, 7, -2.4f, new Item.Properties().group(ForgeTutorial.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new
            PickaxeItem(ModItemTier.RUBY, 0, -2.8f, new Item.Properties().group(ForgeTutorial.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new
            AxeItem(ModItemTier.RUBY, 8, -3.0f, new Item.Properties().group(ForgeTutorial.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new
            ShovelItem(ModItemTier.RUBY, 0, -3.0f, new Item.Properties().group(ForgeTutorial.TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new
            HoeItem(ModItemTier.RUBY,-3, -1.8f, new Item.Properties().group(ForgeTutorial.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new
            ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(ForgeTutorial.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new
            ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(ForgeTutorial.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new
            ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(ForgeTutorial.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new
            ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(ForgeTutorial.TAB)));

    // Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties().group(ForgeTutorial.TAB)));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties().group(ForgeTutorial.TAB)));
    public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven", () -> new BlockItem(ModBlocks.OVEN.get(), new Item.Properties().group(ForgeTutorial.TAB)));
}
