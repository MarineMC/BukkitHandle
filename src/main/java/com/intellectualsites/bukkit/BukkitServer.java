package com.intellectualsites.bukkit;

import org.bukkit.Server;

/**
 * Main interface for Bukkit API Methods
 *
 * @author Citymonstret
 */
public class BukkitServer implements Server {

    private final BukkitHandle handle;

    public BukkitServer(final BukkitHandle handle) {
        this.handle = handle;
    }

    public BukkitHandle getHandle() {
        return this.handle;
    }
}
