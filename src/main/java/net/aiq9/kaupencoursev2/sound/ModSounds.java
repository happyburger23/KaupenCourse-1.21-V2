package net.aiq9.kaupencoursev2.sound;

import net.aiq9.kaupencoursev2.KaupenCourseV2;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent CHAINSAW_CUT = registerSoundEvent("chainsaw_cut");
    public static final SoundEvent CHAINSAW_PULL = registerSoundEvent("chainsaw_pull");

    private static SoundEvent registerSoundEvent(String name) {
        return Registry.register(Registries.SOUND_EVENT, Identifier.of(KaupenCourseV2.MOD_ID, name),
                SoundEvent.of(Identifier.of(KaupenCourseV2.MOD_ID, name)));
    }

    public static void registerSounds() {
        KaupenCourseV2.LOGGER.info("Registering Mod Sounds for " + KaupenCourseV2.MOD_ID);
    }
}
