package de.soulwax.ld22.minicraft.crafting;

import de.soulwax.ld22.minicraft.entity.Player;
import de.soulwax.ld22.minicraft.item.ToolItem;
import de.soulwax.ld22.minicraft.item.ToolType;

public class ToolRecipe extends Recipe {
	private ToolType type;
	private int level;

	public ToolRecipe(ToolType type, int level) {
		super(new ToolItem(type, level));
		this.type = type;
		this.level = level;
	}

	public void craft(Player player) {
		player.inventory.add(0, new ToolItem(type, level));
	}
}
