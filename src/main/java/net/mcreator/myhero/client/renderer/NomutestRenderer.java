
package net.mcreator.myhero.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.myhero.entity.NomutestEntity;
import net.mcreator.myhero.client.model.ModelNomu;

public class NomutestRenderer extends MobRenderer<NomutestEntity, ModelNomu<NomutestEntity>> {
	public NomutestRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNomu(context.bakeLayer(ModelNomu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NomutestEntity entity) {
		return new ResourceLocation("my_hero:textures/entities/texture.png");
	}
}
