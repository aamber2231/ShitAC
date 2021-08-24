package me.aamber.shitac.listener;

import me.aamber.shitac.ShitAC;
import me.aamber.shitac.check.impl.MoveCheck;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class BukkitListener implements Listener {
    @EventHandler
    public void onMove(PlayerMoveEvent event){
        MoveCheck moveCheck = (MoveCheck) ShitAC.INSTANCE.getCheckManager().getCheck("move");
        moveCheck.handleCheck(event.getFrom(),event.getTo(),event.getPlayer(),event);
    }
}
