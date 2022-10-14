package com.thaddev.room9.content.items;

import com.thaddev.room9.content.entities.TaserZapEntity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TaserItem extends Item {

    public TaserItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.getItemCooldownManager().set(this, 40);
        TaserZapEntity taserZapEntity = new TaserZapEntity(world, user);
        double d = user.getRotationVector().x * 10;
        double e = user.getRotationVector().y * 10;
        double f = user.getRotationVector().z * 10;
        double g = Math.sqrt(d * d + f * f) * (double)0.2f;
        taserZapEntity.setVelocity(d, e + g, f, 1.5f, 10.0f);
        if (!user.isSilent()) {
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_LLAMA_SPIT, user.getSoundCategory(), 1.0f, 1.0f + (user.getRandom().nextFloat() - user.getRandom().nextFloat()) * 0.2f);
        }
        world.spawnEntity(taserZapEntity);
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.of("intentioandlly no texure del wit ittttttt"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
