package io.gamer4life1.simplelogistics.proxy;

import io.gamer4life1.simplelogistics.ModBlocks;
import io.gamer4life1.simplelogistics.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy
{
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        ModItems.initModels();
    }
}
