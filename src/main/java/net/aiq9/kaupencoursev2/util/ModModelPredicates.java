package net.aiq9.kaupencoursev2.util;

import net.aiq9.kaupencoursev2.KaupenCourseV2;
import net.aiq9.kaupencoursev2.component.ModDataComponentTypes;
import net.aiq9.kaupencoursev2.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModModelPredicates {
    public static void registerModelPredicates() {
        ModelPredicateProviderRegistry.register(ModItems.DATA_TABLET, Identifier.of(KaupenCourseV2.MOD_ID, "_on"),
                (stack, world, entity, seed) -> stack.get(ModDataComponentTypes.FOUND_BLOCK) != null ? 1f : 0f);

        registerCustomBow(ModItems.KAUPEN_BOW);
    }

    private static void registerCustomBow(Item item) {
        ModelPredicateProviderRegistry.register(item, Identifier.ofVanilla("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            }
            if (entity.getActiveItem() != stack) {
                return 0.0f;
            }
            return (float) (stack.getMaxUseTime(entity) - entity.getItemUseTimeLeft()) / 20.0f;
        });

        ModelPredicateProviderRegistry.register(item, Identifier.ofVanilla("pulling"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }
}
