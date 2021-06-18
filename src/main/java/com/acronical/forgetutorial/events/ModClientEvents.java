package com.acronical.forgetutorial.events;

import com.acronical.forgetutorial.ForgeTutorial;
import com.acronical.forgetutorial.init.ModBlocks;
import com.acronical.forgetutorial.init.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ForgeTutorial.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onJumpWithStick(LivingEvent.LivingJumpEvent event) {
        LivingEntity player = event.getEntityLiving();
        if (player.getHeldItemMainhand().getItem() == Items.STICK) {
            ForgeTutorial.LOGGER.info("A player jumped with a stick!");
            World world = player.getEntityWorld();
            world.setBlockState(player.getPosition().add(0, -1, 0), ModBlocks.RUBY_BLOCK.get().getDefaultState());
        }
    }

    @SubscribeEvent
    public static void poisonEntity(AttackEntityEvent event){
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == ModItems.POISON_APPLE.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof SheepEntity) {
                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10 * 20, 0));
                    target.setGlowing(true);
                }
            }
        }
    }
}
