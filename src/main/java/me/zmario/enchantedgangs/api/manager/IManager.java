package me.zmario.enchantedgangs.api.manager;

import me.zmario.enchantedgangs.api.objects.IGang;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IManager {

    boolean exists(String gangName);

    Optional<IGang> getPlayerGang(OfflinePlayer player);

    boolean isInGang(OfflinePlayer player);

    IGang getGang(String gang);

    Optional<IGang> getGangOptional(String gang);

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
}
