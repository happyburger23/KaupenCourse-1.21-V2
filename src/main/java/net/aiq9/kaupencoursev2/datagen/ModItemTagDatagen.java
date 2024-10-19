package net.aiq9.kaupencoursev2.datagen;

import net.aiq9.kaupencoursev2.item.ModItems;
import net.aiq9.kaupencoursev2.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;

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
    }
}
