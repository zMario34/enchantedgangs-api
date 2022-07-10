package tech.zmario.enchantedgangs.api.manager;

import org.bukkit.entity.Player;
import tech.zmario.enchantedgangs.api.objects.Arena;

import java.util.Optional;

public interface SetupManager {

    void start(Player player, String arenaName);

    void save(Player player);

    boolean isInSetup(Player player);

    Optional<Arena> getArena(Player player);

    void removeAll();

}
