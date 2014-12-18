package com.intellectualsites.bukkit;

import org.bukkit.entity.Player;
import org.marinemc.server.Marine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/**
 * Created 2014-12-19 for BukkitHandle
 *
 * @author Citymonstret
 */
public class BukkitPlayerHandler {

    public Player getPlayer(final UUID uuid) {
        return new Player(Marine.getPlayer(uuid));
    }

    public Player getPlayer(final String name) {
        return new Player(Marine.getPlayer(name));
    }

    public Collection<Player> getPlayers() {
        final List<Player> players = new ArrayList<>();
        for (org.marinemc.player.Player p : Marine.getPlayers()) {
            players.add(new Player(p));
        }
        return players;
    }
}
