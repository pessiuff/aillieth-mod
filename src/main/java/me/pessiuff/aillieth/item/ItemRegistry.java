package me.pessiuff.aillieth.item;

import me.pessiuff.aillieth.AilliethMod;
import me.pessiuff.aillieth.item.items.BovynItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry {
    public static final BovynItem MAGICAL_BOVYN = new BovynItem(new FabricItemSettings().maxCount(1));
    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier(AilliethMod.MOD_ID, "magical_bovyn"), MAGICAL_BOVYN);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(content -> content.add(MAGICAL_BOVYN));
        AilliethMod.LOGGER.info("Registered all items.");
    }
}
