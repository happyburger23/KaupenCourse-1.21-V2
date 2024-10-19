package net.aiq9.kaupencoursev2.item;

import net.aiq9.kaupencoursev2.KaupenCourseV2;
import net.aiq9.kaupencoursev2.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
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
                        entries.add(ModItems.STARLIGHT_ASHES);
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

                        entries.add(ModBlocks.FLUORITE_ORE);
                        entries.add(ModBlocks.FLUORITE_DEEPSLATE_ORE);
                        entries.add(ModBlocks.FLUORITE_NETHER_ORE);
                        entries.add(ModBlocks.FLUORITE_END_ORE);

                        entries.add(ModBlocks.MAGIC_BLOCK);

                        entries.add(Blocks.AMETHYST_BLOCK);
                        entries.add(Blocks.AMETHYST_CLUSTER);
                    })
                    .build());


    public static void registerModItemGroups() {
        KaupenCourseV2.LOGGER.info("Registering Mod Item Groups for " + KaupenCourseV2.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
}
