package net.aiq9.kaupencoursev2.item;

import net.aiq9.kaupencoursev2.KaupenCourseV2;
import net.aiq9.kaupencoursev2.item.custom.ChainsawItem;
import net.aiq9.kaupencoursev2.item.custom.FluoriteHammerItem;
import net.aiq9.kaupencoursev2.item.custom.FluoritePaxelItem;
import net.aiq9.kaupencoursev2.item.custom.ModEffectSwordItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item FLUORITE = registerItem("fluorite", new Item(new Item.Settings()));
    public static final Item RAW_FLUORITE = registerItem("raw_fluorite", new Item(new Item.Settings()));

    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));
    public static final Item CHAINSAW = registerItem("chainsaw", new ChainsawItem(new Item.Settings().maxCount(1)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.kaupen-course-v2.strawberry.tooltip.1"));

            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item FLUORITE_SWORD = registerItem("fluorite_sword",
            new ModEffectSwordItem(ModToolMaterials.FLUORITE,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 3, -2.4f)), StatusEffects.LEVITATION));

    public static final Item FLUORITE_PICKAXE = registerItem("fluorite_pickaxe",
            new PickaxeItem(ModToolMaterials.FLUORITE,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 1, -2.8f))));

    public static final Item FLUORITE_SHOVEL = registerItem("fluorite_shovel",
            new ShovelItem(ModToolMaterials.FLUORITE,
                    new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 1.5f, -3.0f))));

    public static final Item FLUORITE_AXE = registerItem("fluorite_axe",
            new AxeItem(ModToolMaterials.FLUORITE,
                    new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 6, -3.2f))));

    public static final Item FLUORITE_HOE = registerItem("fluorite_hoe",
            new HoeItem(ModToolMaterials.FLUORITE,
                    new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 0, -3.0f))));

    public static final Item FLUORITE_PAXEL = registerItem("fluorite_paxel",
            new FluoritePaxelItem(ModToolMaterials.FLUORITE,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 4, -2.5f))));

    public static final Item FLUORITE_HAMMER = registerItem("fluorite_hammer",
            new FluoriteHammerItem(ModToolMaterials.FLUORITE,
                    new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FLUORITE, 6, -3.5f))));

    //---ITEM REGISTRY HELPER METHOD
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KaupenCourseV2.MOD_ID, name), item);
    }

    //adding to pre-existing item group
    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(FLUORITE);
        entries.add(RAW_FLUORITE);
    }

    public static void registerModItems() {
        KaupenCourseV2.LOGGER.info("Registering Mod Items for " + KaupenCourseV2.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
}
