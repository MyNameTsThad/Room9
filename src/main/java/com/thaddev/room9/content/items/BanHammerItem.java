package com.thaddev.room9.content.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class BanHammerItem extends AxeItem {

    public BanHammerItem(float attackDamage, float attackSpeed, Settings settings) {
        super(ToolMaterials.NETHERITE, attackDamage, attackSpeed, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.getItemCooldownManager().set(this, 100 + user.getRandom().nextInt(40));
        world.createExplosion(user, user.getX(), user.getY(), user.getZ(), (float)(4.0 + user.getRandom().nextDouble() * 1.5 * 5), Explosion.DestructionType.BREAK);
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
