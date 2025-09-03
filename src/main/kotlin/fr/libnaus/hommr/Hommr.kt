package fr.libnaus.hommr

import org.bukkit.plugin.java.JavaPlugin

class Hommr : JavaPlugin()
{

    override fun onEnable()
    {
        this.slF4JLogger.info("Hommr enabled")
    }

    override fun onDisable()
    {
        this.slF4JLogger.info("Hommr disabled")
    }
}
