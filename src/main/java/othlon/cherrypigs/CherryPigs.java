package othlon.cherrypigs;/*
 * Created by Jen on 24-Aug-16.
 */

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import othlon.cherrypigs.proxies.CommonProxy;

import java.util.logging.Logger;

@Mod(modid = CherryPigs.MODID, name = CherryPigs.MODNAME, version = CherryPigs.VERSION)
public class CherryPigs {

    public static final String MODID = "cherrypigs";
    public static final String MODNAME = "CherryPigs";
    public static final String VERSION = "2.0";

    //proxy stuff
    @SidedProxy( clientSide = "othlon.cherrypigs.proxies.ClientProxy",
                 serverSide = "othlon.cherrypigs.proxies.ServerProxy" )
    public static CommonProxy proxy;

    //instanmce
    @Mod.Instance
    public static CherryPigs instance;

    //for err messages and such like
    public static final Logger logger = LogManager.getLogger(MODID);

    @Mod.EventHandler
    public void preInit( FMLPreInitializationEvent preEvent)
    {
        logger = preEvent.getModLog();

        proxy.preInit(preEvent);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent) {
        proxy.postInit(postEvent);
    }

}




