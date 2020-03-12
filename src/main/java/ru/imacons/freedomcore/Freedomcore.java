package ru.imacons.freedomcore;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Freedomcore.MODID, name = Freedomcore.NAME, version = Freedomcore.VERSION)
public class Freedomcore {

    public static final String MODID = "freedomcore";
    public static final String NAME = "Freedom Core";
    public static final String VERSION = "1.0";
    @SidedProxy(clientSide = "ru.imacons.freedomcore.ClientProxy", serverSide = "ru.imacons.freedomcore.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit(e);
    }
}
