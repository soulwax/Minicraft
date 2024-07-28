package de.soulwax.ld22.minicraft.entity;

import de.soulwax.ld22.minicraft.crafting.Crafting;
import de.soulwax.ld22.minicraft.gfx.Color;
import de.soulwax.ld22.minicraft.screen.CraftingMenu;

public class Workbench extends Furniture {
	public Workbench() {
		super("Workbench");
		col = Color.get(-1, 100, 321, 431);
		sprite = 4;
		xr = 3;
		yr = 2;
	}

	public boolean use(Player player, int attackDir) {
		player.game.setMenu(new CraftingMenu(Crafting.workbenchRecipes, player));
		return true;
	}
}