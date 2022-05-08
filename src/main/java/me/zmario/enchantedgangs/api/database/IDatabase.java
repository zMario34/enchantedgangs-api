package me.zmario.enchantedgangs.api.database;

import me.zmario.enchantedgangs.api.objects.IGang;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public interface IDatabase {

    boolean isPresent(Player player);

    void createPlayer(Player player);

    void createGang(String name, Player owner, List<OfflinePlayer> members);

    void deleteGang(String gang);

    boolean exists(String gang);

    String getPlayerGang(OfflinePlayer player);

    String getChest(String gang);

    UUID getOwner(String gang);

    List<OfflinePlayer> getMembers(String gang);

    List<IGang> getGangs();

    void setGang(OfflinePlayer player, String gang);

    void setChest(String gang, String chest);

    void setOwner(String gang, OfflinePlayer player);

    void setMembers(String gang, List<OfflinePlayer> members);

    Connection getConnection() throws SQLException;

    void close();
}
