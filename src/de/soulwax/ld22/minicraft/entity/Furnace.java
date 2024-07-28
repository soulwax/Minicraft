package de.soulwax.ld22.minicraft.entity;

import de.soulwax.ld22.minicraft.crafting.Crafting;
import de.soulwax.ld22.minicraft.gfx.Color;
import de.soulwax.ld22.minicraft.screen.CraftingMenu;

public class Furnace extends Furniture {
	public Furnace() {
		super("Furnace");
		col = Color.get(-1, 000, 222, 333);
		sprite = 3;
		xr = 3;
		yr = 2;
	}

	public boolean use(Player player, int attackDir) {
		player.game.setMenu(new CraftingMenu(Crafting.furnaceRecipes, player));
		return true;
	}
}