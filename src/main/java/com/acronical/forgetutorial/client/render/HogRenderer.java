package com.acronical.forgetutorial.client.render;

import com.acronical.forgetutorial.ForgeTutorial;
import com.acronical.forgetutorial.client.model.HogModel;
import com.acronical.forgetutorial.entities.HogEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class HogRenderer extends MobRenderer<HogEntity, HogModel<HogEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ForgeTutorial.MOD_ID, "textures/entity/hog.png");

    public HogRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new HogModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(HogEntity entity) {
        return TEXTURE;
    }
}
