package tech.zmario.enchantedgangs.api.events;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import tech.zmario.enchantedgangs.api.objects.Gang;

@Getter
public class GangCreateEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final Gang gang;

    public GangCreateEvent(Player player, Gang gang) {
        this.player = player;
        this.gang = gang;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
