package tech.zmario.enchantedgangs.api.manager;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import tech.zmario.enchantedgangs.api.objects.Gang;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IGangsManager {

    boolean exists(String gangName);

    Optional<Gang> getPlayerGang(OfflinePlayer player);

    boolean isInGang(OfflinePlayer player);

    Gang getGang(String gang);

    Optional<Gang> getGangOptional(String gang);

    boolean hasGangChat(OfflinePlayer player);

    void setGangChat(OfflinePlayer player, boolean enabled);

    void addMember(String gang, OfflinePlayer player);

    void removeMember(String gang, OfflinePlayer player);

    void openGangChest(Player player);

    boolean isOwner(UUID uuid);

    List<OfflinePlayer> getGangMembers(String gangName, boolean online);

    void setGangOwner(String gangName, OfflinePlayer target);

    UUID getOwner(String gangName);

    void updateGangChest(Inventory inventory, String gangName);

    void setGang(Player player, String gangName);

    void depositMoney(String name, int amount);

    void withdrawMoney(String name, int amount);
}
