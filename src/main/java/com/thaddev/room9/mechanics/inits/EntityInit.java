package com.thaddev.room9.mechanics.inits;

import com.thaddev.room9.Room9;
import com.thaddev.room9.content.entities.DewEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityInit {
    public static final EntityType<DewEntity> DEW = Registry.register(
        Registry.ENTITY_TYPE,
        new Identifier(Room9.MODID, "dew"),
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DewEntity::new).dimensions(EntityDimensions.fixed(0.75f, 1.65f)).build()
    );

    public static void registerEntities() {
        Room9.LOGGER.info("Registering Blocks for " + Room9.MODID + " (4/4)");

        FabricDefaultAttributeRegistry.register(DEW, DewEntity.createDewAttributes());
    }
}
