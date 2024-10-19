package net.aiq9.kaupencoursev2.datagen;

import net.aiq9.kaupencoursev2.item.ModItems;
import net.aiq9.kaupencoursev2.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagDatagen extends FabricTagProvider.ItemTagProvider {
    public ModItemTagDatagen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.FLUORITE)
                .add(ModItems.RAW_FLUORITE)
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.APPLE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.FLUORITE_HELMET)
                .add(ModItems.FLUORITE_CHEST_PLATE)
                .add(ModItems.FLUORITE_LEGGINGS)
                .add(ModItems.FLUORITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS).add(ModItems.FLUORITE);
        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES).add(ModItems.KAUPEN_SMITHING_TEMPLATE);
    }
}
