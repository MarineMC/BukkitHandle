package org.bukkit;

/**
 * Static Bukkit Class
 *
 * @author Citymonstret
 */
public class Bukkit {

    private static Server server;

    public static void setServer(final Server server) {
        if (Bukkit.server != null) {
            throw new UnsupportedOperationException("Cannot replace BukkitHandle Server Singleton");
        }
        Bukkit.server = server;
    }

}
