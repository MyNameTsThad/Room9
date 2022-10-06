package com.thaddev.room9.mechanics.inits;

import com.thaddev.room9.Room9;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundInit {
    public static final Identifier SOIJU_ID = new Identifier("room9:soiju");
    public static final Identifier MORB_ID = new Identifier("room9:morb");
    public static final Identifier IDOL_ID = new Identifier("room9:idol");
    public static final Identifier IT_STARTS_WITH_ID = new Identifier("room9:it_starts_with");

    public static final Identifier DEW_AMBIENT_1_ID = new Identifier("room9:dew_ambient_1");
    public static final Identifier DEW_AMBIENT_2_ID = new Identifier("room9:dew_ambient_2");
    public static final Identifier DEW_AMBIENT_3_ID = new Identifier("room9:dew_ambient_3");
    public static final Identifier DEW_AMBIENT_4_ID = new Identifier("room9:dew_ambient_4");
    public static final Identifier DEW_AMBIENT_5_ID = new Identifier("room9:dew_ambient_5");
    public static final Identifier DEW_AMBIENT_6_ID = new Identifier("room9:dew_ambient_6");
    public static final Identifier DEW_AMBIENT_7_ID = new Identifier("room9:dew_ambient_7");
    public static final Identifier DEW_AMBIENT_8_ID = new Identifier("room9:dew_ambient_8");
    public static final Identifier DEW_AMBIENT_9_ID = new Identifier("room9:dew_ambient_9");
    public static final Identifier DEW_AMBIENT_LONG_ID = new Identifier("room9:dew_ambient_long");
    public static final Identifier DEW_ANGRY_ID = new Identifier("room9:dew_angry");
    public static final Identifier DEW_HURT_ID = new Identifier("room9:dew_hurt");
    public static final Identifier DEW_DEATH_ID = new Identifier("room9:dew_death");

    public static SoundEvent SOIJU = new SoundEvent(SOIJU_ID);
    public static SoundEvent MORB = new SoundEvent(MORB_ID);
    public static SoundEvent IDOL = new SoundEvent(IDOL_ID);
    public static SoundEvent IT_STARTS_WITH = new SoundEvent(IT_STARTS_WITH_ID);

    public static SoundEvent DEW_AMBIENT_1 = new SoundEvent(DEW_AMBIENT_1_ID);
    public static SoundEvent DEW_AMBIENT_2 = new SoundEvent(DEW_AMBIENT_2_ID);
    public static SoundEvent DEW_AMBIENT_3 = new SoundEvent(DEW_AMBIENT_3_ID);
    public static SoundEvent DEW_AMBIENT_4 = new SoundEvent(DEW_AMBIENT_4_ID);
    public static SoundEvent DEW_AMBIENT_5 = new SoundEvent(DEW_AMBIENT_5_ID);
    public static SoundEvent DEW_AMBIENT_6 = new SoundEvent(DEW_AMBIENT_6_ID);
    public static SoundEvent DEW_AMBIENT_7 = new SoundEvent(DEW_AMBIENT_7_ID);
    public static SoundEvent DEW_AMBIENT_8 = new SoundEvent(DEW_AMBIENT_8_ID);
    public static SoundEvent DEW_AMBIENT_9 = new SoundEvent(DEW_AMBIENT_9_ID);
    public static SoundEvent DEW_AMBIENT_LONG = new SoundEvent(DEW_AMBIENT_LONG_ID);
    public static SoundEvent DEW_ANGRY = new SoundEvent(DEW_ANGRY_ID);
    public static SoundEvent DEW_HURT = new SoundEvent(DEW_HURT_ID);
    public static SoundEvent DEW_DEATH = new SoundEvent(DEW_DEATH_ID);

    public static BlockSoundGroup SOIJU_SOUNDS = new BlockSoundGroup(1.0f, 1.0f, SOIJU, SOIJU, SOIJU, SOIJU, SOIJU);
    public static BlockSoundGroup MORB_SOUNDS = new BlockSoundGroup(1.0f, 1.0f, MORB, MORB, MORB, MORB, MORB);
    public static BlockSoundGroup IDOL_SOUNDS = new BlockSoundGroup(1.0f, 1.0f, IDOL, IDOL, IDOL, IDOL, IDOL);
    public static BlockSoundGroup IT_STARTS_WITH_SOUNDS = new BlockSoundGroup(1.0f, 1.0f, IT_STARTS_WITH, IT_STARTS_WITH, IT_STARTS_WITH, IT_STARTS_WITH, IT_STARTS_WITH);

    public static SoundEvent[] DEW_AMBIENT = new SoundEvent[] {
            DEW_AMBIENT_1,
            DEW_AMBIENT_2,
            DEW_AMBIENT_3,
            DEW_AMBIENT_4,
            DEW_AMBIENT_5,
            DEW_AMBIENT_6,
            DEW_AMBIENT_7,
            DEW_AMBIENT_8,
            DEW_AMBIENT_9,
            DEW_AMBIENT_LONG
    };

    public static void registerSounds() {
        Room9.LOGGER.info("Registering Sounds for " + Room9.MODID + " (3/4)");
        Registry.register(Registry.SOUND_EVENT, SOIJU_ID, SOIJU);

        Registry.register(Registry.SOUND_EVENT, DEW_AMBIENT_1_ID, DEW_AMBIENT_1);
        Registry.register(Registry.SOUND_EVENT, DEW_AMBIENT_2_ID, DEW_AMBIENT_2);
        Registry.register(Registry.SOUND_EVENT, DEW_AMBIENT_3_ID, DEW_AMBIENT_3);
        Registry.register(Registry.SOUND_EVENT, DEW_AMBIENT_4_ID, DEW_AMBIENT_4);
        Registry.register(Registry.SOUND_EVENT, DEW_AMBIENT_5_ID, DEW_AMBIENT_5);
        Registry.register(Registry.SOUND_EVENT, DEW_AMBIENT_6_ID, DEW_AMBIENT_6);
        Registry.register(Registry.SOUND_EVENT, DEW_AMBIENT_7_ID, DEW_AMBIENT_7);
        Registry.register(Registry.SOUND_EVENT, DEW_AMBIENT_8_ID, DEW_AMBIENT_8);
        Registry.register(Registry.SOUND_EVENT, DEW_AMBIENT_9_ID, DEW_AMBIENT_9);
        Registry.register(Registry.SOUND_EVENT, DEW_AMBIENT_LONG_ID, DEW_AMBIENT_LONG);
        Registry.register(Registry.SOUND_EVENT, DEW_ANGRY_ID, DEW_ANGRY);
        Registry.register(Registry.SOUND_EVENT, DEW_HURT_ID, DEW_HURT);
        Registry.register(Registry.SOUND_EVENT, DEW_DEATH_ID, DEW_DEATH);
    }
}
