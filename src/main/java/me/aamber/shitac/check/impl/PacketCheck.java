package me.aamber.shitac.check.impl;

import io.github.retrooper.packetevents.event.impl.PacketReceiveEvent;
import io.github.retrooper.packetevents.event.impl.PacketSendEvent;
import me.aamber.shitac.check.Check;
import org.bukkit.entity.Player;

public class PacketCheck extends Check {
    public void handlePacketReceive(Player player, byte packetId, Object packet, PacketReceiveEvent event){

    }
    public void handlePacketSend(Player player, byte packetId, Object packet, PacketSendEvent event){

    }
}
