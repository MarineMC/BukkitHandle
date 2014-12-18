package com.intellectualsites.bukkit;

import org.bukkit.Bukkit;
import org.marinemc.plugins.Plugin;
import org.marinemc.settings.JSONConfig;

/**
 * BukkitHandle MarineStandalone Plugin
 *
 * @author Citymonstret
 */
public class BukkitHandle extends Plugin {

    JSONConfig config;

    @Override
    public void onEnable() {
        Bukkit.setServer(new BukkitServer(this));
        config = new JSONConfig(getDataFolder(), "bukkit");
    }

    @Override
    public void onDisable() {
        // Save the config file
        config.saveFile();
    }

}
