package org.bukkit.entity;

import org.marinemc.server.Marine;

import java.util.UUID;

/**
 * Created 2014-12-19 for BukkitHandle
 *
 * @author Citymonstret
 */
public class Player {

    // Temporary
    private final UUID uuid;

    private final org.marinemc.player.Player player;

    public Player(final org.marinemc.player.Player player) {
        this.player = player;
        this.uuid = player.getUUID();
    }

    public Player(final UUID uuid) {
        this.uuid = uuid;
        this.player = Marine.getPlayer(uuid);
    }
}
