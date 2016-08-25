package com.github.othlon.cherrypigs;/*
 * Created by Jen on 25-Aug-16.
 */

import com.github.othlon.cherrypigs.proxies.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Conpig {

    public static boolean isThisAGoodTutorial = true;
    public static String yourRealName = "Steve";
    public static int     dimensionId = 100;


    public static void  readConpig()
    {

        Configuration pig = CommonProxy.conpig;
        try {
            pig.load();
        } catch (Exception e1) {
            CherryPigs.pigLogger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (pig.hasChanged()) {
                pig.save();
            }
        }
    }

}
