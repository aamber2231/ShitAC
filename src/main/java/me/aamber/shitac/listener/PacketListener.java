package me.aamber.shitac.listener;

import io.github.retrooper.packetevents.event.PacketListenerDynamic;
import io.github.retrooper.packetevents.event.impl.PacketReceiveEvent;
import io.github.retrooper.packetevents.event.impl.PacketSendEvent;
import io.github.retrooper.packetevents.event.priority.PacketEventPriority;

public class PacketListener extends PacketListenerDynamic {
    public PacketListener() {
        super(PacketEventPriority.NORMAL);
    }

    @Override
    public void onPacketSend(PacketSendEvent event) {

    }

    @Override
    public void onPacketReceive(PacketReceiveEvent event) {

    }
}
