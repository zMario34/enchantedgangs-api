package tech.zmario.enchantedgangs.api.objects;

import org.bukkit.Location;
import org.bukkit.inventory.Inventory;
import tech.zmario.enchantedgangs.api.enums.GameState;

import java.util.Collection;
import java.util.UUID;

public interface Arena {

    String getArenaName();

    Collection<UUID> getFightingPlayers();

    Location getFirstSpawn();

    Location getSecondSpawn();

    Location getWaitingLocation();

    Location getEndLocation();

    Inventory getKitInventory();

    GameState getGameState();

    ArenaConfig getArenaConfig();

    int getCountdown();

    void setGameState(GameState gameState);

    void setCountdown(int countdown);

    void endWar();

    void clear();

}
