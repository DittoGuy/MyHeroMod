
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myhero.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.myhero.entity.NomutestEntity;
import net.mcreator.myhero.entity.CopyEntity;
import net.mcreator.myhero.entity.AirCannonEntity;
import net.mcreator.myhero.MyHeroMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MyHeroModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MyHeroMod.MODID);
	public static final RegistryObject<EntityType<AirCannonEntity>> AIR_CANNON = register("projectile_air_cannon",
			EntityType.Builder.<AirCannonEntity>of(AirCannonEntity::new, MobCategory.MISC).setCustomClientFactory(AirCannonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CopyEntity>> COPY = register("copy",
			EntityType.Builder.<CopyEntity>of(CopyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CopyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NomutestEntity>> NOMUTEST = register("nomutest",
			EntityType.Builder.<NomutestEntity>of(NomutestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NomutestEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CopyEntity.init();
			NomutestEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(COPY.get(), CopyEntity.createAttributes().build());
		event.put(NOMUTEST.get(), NomutestEntity.createAttributes().build());
	}
}
