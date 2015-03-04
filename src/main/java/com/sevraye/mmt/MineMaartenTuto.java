package com.sevraye.mmt;

import com.sevraye.mmt.proxy.CommonProxy;
import com.sevraye.mmt.reference.Reference;
import com.sevraye.mmt.utility.Log;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class MineMaartenTuto
{
    @Mod.Instance(Reference.MOD_ID)
    public static MineMaartenTuto instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
        Log.info("Pre Initialization Complete !");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
        Log.info("Initialization Complete !");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
        Log.info("Post Initialization Complete !");
    }
}
