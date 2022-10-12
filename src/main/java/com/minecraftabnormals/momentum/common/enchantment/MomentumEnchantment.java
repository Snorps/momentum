package com.minecraftabnormals.momentum.common.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.DiggingEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class MomentumEnchantment extends Enchantment {
    public MomentumEnchantment() {
        super(Rarity.RARE, EnchantmentCategory.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    public boolean canApplyTogether(Enchantment ench) {
        return ench instanceof DiggingEnchantment ? false : super.isCompatibleWith(ench);
    }

    public boolean isTreasureEnchantment() {
        return true;
    }
}
