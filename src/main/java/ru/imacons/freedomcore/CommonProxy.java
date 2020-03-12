package ru.imacons.freedomcore;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import ru.imacons.freedomcore.items.*;

@Mod.EventBusSubscriber
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e){

    }

    public void init(FMLInitializationEvent e){

    }

    public void postInit(FMLPostInitializationEvent e){

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e){

        e.getRegistry().register(new ProofSanity());
        e.getRegistry().register(new ProofBlank());
        e.getRegistry().register(new ProofScience());
        e.getRegistry().register(new ProofDragon());
        e.getRegistry().register(new ProofEngineering());
        e.getRegistry().register(new ProofLogistics());
        e.getRegistry().register(new ProofMachinery());
        e.getRegistry().register(new ProofMagic());
        e.getRegistry().register(new ProofNature());
    }

}
