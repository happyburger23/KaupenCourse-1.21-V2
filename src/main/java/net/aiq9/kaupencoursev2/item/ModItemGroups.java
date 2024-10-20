package net.aiq9.kaupencoursev2.item;

import net.aiq9.kaupencoursev2.KaupenCourseV2;
import net.aiq9.kaupencoursev2.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FLUORITE_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KaupenCourseV2.MOD_ID, "fluorite_item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.fluorite_items"))
                    .icon(() -> new ItemStack(ModItems.FLUORITE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_FLUORITE);
                        entries.add(ModItems.FLUORITE);
                        entries.add(ModItems.CHAINSAW);
                        entries.add(ModItems.STRAWBERRY);
                        entries.add(ModItems.STRAWBERRY_SEEDS);
                        entries.add(ModItems.STARLIGHT_ASHES);

                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.DATA_TABLET);
                        entries.add(ModItems.KAUPEN_BOW);

                        entries.add(ModItems.FLUORITE_SWORD);
                        entries.add(ModItems.FLUORITE_PICKAXE);
                        entries.add(ModItems.FLUORITE_SHOVEL);
                        entries.add(ModItems.FLUORITE_AXE);
                        entries.add(ModItems.FLUORITE_HOE);
                        entries.add(ModItems.FLUORITE_PAXEL);
                        entries.add(ModItems.FLUORITE_HAMMER);

                        entries.add(ModItems.FLUORITE_HELMET);
                        entries.add(ModItems.FLUORITE_CHEST_PLATE);
                        entries.add(ModItems.FLUORITE_LEGGINGS);
                        entries.add(ModItems.FLUORITE_BOOTS);

                        entries.add(ModItems.FLUORITE_HORSE_ARMOR);
                        entries.add(ModItems.KAUPEN_SMITHING_TEMPLATE);
                    })
                    .build());

    public static final ItemGroup FLUORITE_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KaupenCourseV2.MOD_ID, "fluorite_block_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.fluorite_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.FLUORITE_BLOCK))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FLUORITE_BLOCK);
                        entries.add(ModBlocks.FLUORITE_STAIRS);
                        entries.add(ModBlocks.FLUORITE_SLAB);
                        entries.add(ModBlocks.FLUORITE_BUTTON);
                        entries.add(ModBlocks.FLUORITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.FLUORITE_FENCE);
                        entries.add(ModBlocks.FLUORITE_FENCE_GATE);
                        entries.add(ModBlocks.FLUORITE_WALL);
                        entries.add(ModBlocks.FLUORITE_DOOR);
                        entries.add(ModBlocks.FLUORITE_TRAPDOOR);

                        entries.add(ModBlocks.FLUORITE_ORE);
                        entries.add(ModBlocks.FLUORITE_DEEPSLATE_ORE);
                        entries.add(ModBlocks.FLUORITE_NETHER_ORE);
                        entries.add(ModBlocks.FLUORITE_END_ORE);

                        entries.add(ModBlocks.MAGIC_BLOCK);
                        entries.add(ModBlocks.FLUORITE_LAMP);
                        entries.add(ModBlocks.DAHLIA);
                        entries.add(ModBlocks.COLORED_LEAVES);
                    })
                    .build());


    public static void registerModItemGroups() {
        KaupenCourseV2.LOGGER.info("Registering Mod Item Groups for " + KaupenCourseV2.MOD_ID);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
}
