package me.zmario.enchantedgangs.api.events;

import lombok.Getter;
import me.zmario.enchantedgangs.api.objects.Gang;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class GangPromoteEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final OfflinePlayer promoted;
    private final Gang gang;

    public GangPromoteEvent(Player player, OfflinePlayer promoted, Gang gang) {
        this.player = player;
        this.promoted = promoted;
        this.gang = gang;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList(){
        return handlers;
    }
}
