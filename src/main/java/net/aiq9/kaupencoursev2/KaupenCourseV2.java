package net.aiq9.kaupencoursev2;

import net.aiq9.kaupencoursev2.block.ModBlocks;
import net.aiq9.kaupencoursev2.item.ModItemGroups;
import net.aiq9.kaupencoursev2.item.ModItems;
import net.aiq9.kaupencoursev2.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KaupenCourseV2 implements ModInitializer {
	public static final String MOD_ID = "kaupen-course-v2";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600); //log 300, coal 1600

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
	}
}