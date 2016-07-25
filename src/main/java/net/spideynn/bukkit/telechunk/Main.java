package net.spideynn.bukkit.telechunk;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Copyright (C) 2016 Spideynn
 * <p>
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
public class Main extends JavaPlugin implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    public void onPlayerTeleport(PlayerTeleportEvent event) {
        if (event.getTo().getChunk().isLoaded())
            event.getTo().getChunk().unload();
        event.getTo().getChunk().load();
    }
}
