package net.aiq9.kaupencoursev2;

import net.aiq9.kaupencoursev2.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class KaupenCourseV2DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagDatagen::new);
		pack.addProvider(ModItemTagDatagen::new);
		pack.addProvider(ModLootTableDatagen::new);
		pack.addProvider(ModModelDatagen::new);
		pack.addProvider(ModRecipeDatagen::new);
	}
}
