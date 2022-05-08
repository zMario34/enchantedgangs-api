package me.zmario.enchantedgangs.api.events;

import lombok.Getter;
import me.zmario.enchantedgangs.api.objects.IGang;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class GangJoinEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final Player inviting;
    private final IGang gang;

    public GangJoinEvent(Player player, Player inviting, IGang gang) {
        this.player = player;
        this.inviting = inviting;
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
