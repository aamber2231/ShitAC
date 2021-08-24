package me.aamber.shitac;

import io.github.retrooper.packetevents.PacketEvents;
import lombok.Getter;
import me.aamber.shitac.check.CheckManager;
import me.aamber.shitac.listener.BukkitListener;
import me.aamber.shitac.listener.PacketListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShitAC extends JavaPlugin {
    public static ShitAC INSTANCE;
    private @Getter
    CheckManager checkManager;
    @Override
    public void onLoad() {
        PacketEvents.create();
    }

    @Override
    public void onEnable() {
        INSTANCE = this;
        PacketEvents.get().registerListener(new PacketListener());
        Bukkit.getServer().getPluginManager().registerEvents(new BukkitListener(),this);
        this.checkManager = new CheckManager();
    }

    @Override
    public void onDisable() {

    }
}
