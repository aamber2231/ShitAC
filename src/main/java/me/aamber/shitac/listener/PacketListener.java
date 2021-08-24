package me.aamber.shitac.listener;

import io.github.retrooper.packetevents.event.PacketListenerDynamic;
import io.github.retrooper.packetevents.event.impl.PacketReceiveEvent;
import io.github.retrooper.packetevents.event.impl.PacketSendEvent;
import io.github.retrooper.packetevents.event.priority.PacketEventPriority;
import me.aamber.shitac.ShitAC;
import me.aamber.shitac.check.impl.PacketCheck;

public class PacketListener extends PacketListenerDynamic {
    public PacketListener() {
        super(PacketEventPriority.NORMAL);
    }

    @Override
    public void onPacketSend(PacketSendEvent event) {
        PacketCheck check = (PacketCheck) ShitAC.INSTANCE.getCheckManager().getCheck("packet");
        check.handlePacketSend(event.getPlayer(),event.getPacketId(),event.getNMSPacket(),event);
    }

    @Override
    public void onPacketReceive(PacketReceiveEvent event) {
        PacketCheck check = (PacketCheck) ShitAC.INSTANCE.getCheckManager().getCheck("packet");
        check.handlePacketReceive(event.getPlayer(),event.getPacketId(),event.getNMSPacket(),event);
    }
}
