package tech.zmario.enchantedgangs.api.manager;

import tech.zmario.enchantedgangs.api.objects.Arena;

import java.util.Map;
import java.util.Optional;

public interface ArenaManager {

    Map<String, Arena> getArenas();

    void enableArena(Arena arena);

    void disableArena(Arena arena);

    void deleteArena(Arena arena);

    Optional<Arena> getFirstArena();

    Optional<Arena> getArena(String name);

    void loadArenas();

    void unloadArenas();

}
