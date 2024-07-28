package de.soulwax.ld22.minicraft.crafting;

import de.soulwax.ld22.minicraft.entity.Furniture;
import de.soulwax.ld22.minicraft.entity.Player;
import de.soulwax.ld22.minicraft.item.FurnitureItem;

public class FurnitureRecipe extends Recipe {
	private Class<? extends Furniture> clazz;

	public FurnitureRecipe(Class<? extends Furniture> clazz) throws InstantiationException, IllegalAccessException {
		super(new FurnitureItem(clazz.newInstance()));
		this.clazz = clazz;
	}

	public void craft(Player player) {
		try {
			player.inventory.add(0, new FurnitureItem(clazz.newInstance()));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
