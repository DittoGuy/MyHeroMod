
package net.mcreator.myhero.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FloatflingItem extends Item {
	public FloatflingItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
