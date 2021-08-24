package me.aamber.shitac.check.impl;

import me.aamber.shitac.check.Check;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveCheck extends Check {

    public void handleCheck(Location from, Location to,
                            Player player, PlayerMoveEvent event){
        fail(player,"Move","y=%s",to.getY());
        handleLagback(from, player);
    }
    public void handleLagback(Location from, Player player){
        Location tpLoc = new Location(player.getWorld(), from.getX(),from.getY() - 1,from.getZ());
        player.teleport(tpLoc.clone());
    }
}
