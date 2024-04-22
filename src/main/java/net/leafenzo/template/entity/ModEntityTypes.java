/*
 * SOURCES:
 * Team Hibiscus - https://github.com/Team-Hibiscus/NaturesSpirit/blob/c69094e549abe10993e009cff36efdf2c5e1e828/src/main/java/net/hibiscus/naturespirit/registration/HibiscusEntityTypes.java
 */

package net.leafenzo.template.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.leafenzo.template.ModInit;
import net.leafenzo.template.Super;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntityTypes {
    public static <T extends EntityType <?>> T registerEntityType(String id, T type) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(Super.MOD_ID, id), type);
    }

    public static EntityType <BoatEntity> createBoatType(boolean chest, ModBoatEntity.ModBoat boat) {
        return FabricEntityTypeBuilder.create(SpawnGroup.MISC, boat.factory(chest)).dimensions(EntityDimensions.changing(1.375f, 0.5625f)).trackRangeChunks(10).build();
    }

    public static void registerEntityTypes() {
        ModInit.LOGGER.debug("Registering mod entity types for " + Super.MOD_ID);
    }
}