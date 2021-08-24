package me.aamber.shitac;

import io.github.retrooper.packetevents.PacketEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShitAC extends JavaPlugin {
    public static ShitAC INSTANCE;

    @Override
    public void onLoad() {
        PacketEvents.create();
    }

    @Override
    public void onEnable() {
        INSTANCE = this;
    }

    @Override
    public void onDisable() {

    }
}
