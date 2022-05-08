package me.zmario.enchantedgangs.api.events;

import lombok.Getter;
import me.zmario.enchantedgangs.api.objects.IGang;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class GangCreateEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final IGang gang;

    public GangCreateEvent(Player player, IGang gang) {
        this.player = player;
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
