package net.aiq9.kaupencoursev2.item;

import net.aiq9.kaupencoursev2.KaupenCourseV2;
import net.aiq9.kaupencoursev2.item.custom.ChainsawItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FLUORITE = registerItem("fluorite", new Item(new Item.Settings()));
    public static final Item RAW_FLUORITE = registerItem("raw_fluorite", new Item(new Item.Settings()));

    public static final Item CHAINSAW = registerItem("chainsaw", new ChainsawItem(new Item.Settings()));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)));

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
