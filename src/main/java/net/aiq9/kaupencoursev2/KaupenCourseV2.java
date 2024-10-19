package net.aiq9.kaupencoursev2;

import net.aiq9.kaupencoursev2.block.ModBlocks;
import net.aiq9.kaupencoursev2.component.ModDataComponentTypes;
import net.aiq9.kaupencoursev2.event.AttackEntityHandler;
import net.aiq9.kaupencoursev2.item.ModItemGroups;
import net.aiq9.kaupencoursev2.item.ModItems;
import net.aiq9.kaupencoursev2.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KaupenCourseV2 implements ModInitializer {
	public static final String MOD_ID = "kaupen-course-v2";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600); //log 300, coal 1600

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

		ModDataComponentTypes.registerDataComponentTypes();

		AttackEntityCallback.EVENT.register(new AttackEntityHandler());

		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.STRAWBERRY, 0.5f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.STRAWBERRY_SEEDS, 0.25f);
	}
}