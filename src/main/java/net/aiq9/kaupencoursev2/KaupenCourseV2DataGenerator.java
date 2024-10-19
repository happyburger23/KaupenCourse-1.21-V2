package net.aiq9.kaupencoursev2;

import net.aiq9.kaupencoursev2.datagen.*;
import net.aiq9.kaupencoursev2.trim.ModTrimMaterials;
import net.aiq9.kaupencoursev2.trim.ModTrimPatterns;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class KaupenCourseV2DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagDatagen::new);
		pack.addProvider(ModItemTagDatagen::new);
		pack.addProvider(ModLootTableDatagen::new);
		pack.addProvider(ModModelDatagen::new);
		pack.addProvider(ModRecipeDatagen::new);

		pack.addProvider(ModRegistryDataGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.TRIM_MATERIAL, ModTrimMaterials::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.TRIM_PATTERN, ModTrimPatterns::bootstrap);
	}
}
