package de.soulwax.ld22.minicraft.crafting;

import de.soulwax.ld22.minicraft.entity.Player;
import de.soulwax.ld22.minicraft.item.ResourceItem;
import de.soulwax.ld22.minicraft.item.resource.Resource;

public class ResourceRecipe extends Recipe {
	private Resource resource;

	public ResourceRecipe(Resource resource) {
		super(new ResourceItem(resource, 1));
		this.resource = resource;
	}

	public void craft(Player player) {
		player.inventory.add(0, new ResourceItem(resource, 1));
	}
}
