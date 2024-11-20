package net.mrnick.tutorialmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mrnick.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item PINK_GEM = registerItem("pink_gem", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GEM = registerItem("raw_pink_gem", new Item(new Item.Settings()));
    
    
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items For " + TutorialMod.MOD_ID);


    }
}
