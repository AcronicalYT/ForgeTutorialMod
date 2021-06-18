package com.acronical.forgetutorial.items;

import com.acronical.forgetutorial.ForgeTutorial;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(ForgeTutorial.TAB));
    }
}
