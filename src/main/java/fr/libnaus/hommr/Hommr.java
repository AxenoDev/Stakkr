package fr.libnaus.hommr;

import fr.libnaus.hommr.listener.ItemStackListener;
import fr.libnaus.hommr.manager.ItemStackManager;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;

public final class Hommr extends JavaPlugin
{

    @Getter
    public static Hommr instance;

    @Override
    public void onEnable()
    {
        instance = this;
        this.logLoadMessage();
    }

    @Override
    public void onDisable()
    {
        this.getSLF4JLogger().info("Hommr Disabled");
    }

    private void logLoadMessage()
    {
        Logger logger = this.getSLF4JLogger();

        String pluginVersion = this.getPluginMeta().getVersion();
        String javaVersion = System.getProperty("java.version");
        String server = String.format("%s %s", Bukkit.getName(), Bukkit.getVersion());

        logger.info("\u001B[1;34m                                                    \u001B[0m");
        logger.info("\u001B[1;34m  ___ _____ _   _  ___  _____        \u001B[0;90mStakkr {}\u001B[0m", pluginVersion);
        logger.info("\u001B[1;34m / __|_   _/_\\ | |/ / |/ / _ \\       \u001B[0;90mJava {}\u001B[0m", javaVersion);
        logger.info("\u001B[1;34m \\__ \\ | |/ _ \\| ' <| ' <|   /       \u001B[0;90mServer: {}\u001B[0m", server);
        logger.info("\u001B[1;34m |___/ |_/_/ \\_\\_|\\_\\_|\\_\\_|_\\       \u001B[0m");
        logger.info("\u001B[1;34m                                                    \u001B[0m");
    }
}