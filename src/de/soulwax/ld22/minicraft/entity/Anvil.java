package de.soulwax.ld22.minicraft.entity;

import de.soulwax.ld22.minicraft.crafting.Crafting;
import de.soulwax.ld22.minicraft.gfx.Color;
import de.soulwax.ld22.minicraft.screen.CraftingMenu;

public class Anvil extends Furniture {
	public Anvil() {
		super("Anvil");
		col = Color.get(-1, 000, 111, 222);
		sprite = 0;
		xr = 3;
		yr = 2;
	}

	public boolean use(Player player, int attackDir) {
		player.game.setMenu(new CraftingMenu(Crafting.anvilRecipes, player));
		return true;
	}
}