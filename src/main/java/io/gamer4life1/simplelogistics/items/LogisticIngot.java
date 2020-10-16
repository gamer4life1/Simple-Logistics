package io.gamer4life1.simplelogistics.items;

import io.gamer4life1.simplelogistics.SimpleLogistics;
import io.gamer4life1.simplelogistics.util.Reference;
import net.minecraft.item.Item;

public class LogisticIngot extends Item
{
    public LogisticIngot()
    {
        setRegistryName("logistic_ingot");
        setUnlocalizedName(Reference.MOD_ID + ".logistic_ingot");
        setCreativeTab(SimpleLogistics.ItemTAB);
    }
}
