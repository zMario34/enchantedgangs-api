package tech.zmario.enchantedgangs.api.objects;

import lombok.Data;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Gang {

    private final String name;

    private UUID owner;
    private List<OfflinePlayer> members;
    private List<OfflinePlayer> allies = new ArrayList<>();

    private Inventory chest;

    private double balance;
    private int kills;

    public void addMember(UUID uuid) {
        members.add(Bukkit.getOfflinePlayer(uuid));
    }

    public void removeMember(UUID uuid) {
        members.remove(Bukkit.getOfflinePlayer(uuid));
    }

    public boolean isMember(UUID uuid) {
        return members.contains(Bukkit.getOfflinePlayer(uuid));
    }

    public void addAlly(UUID uuid) {
        allies.add(Bukkit.getOfflinePlayer(uuid));
    }

    public void removeAlly(UUID uuid) {
        allies.remove(Bukkit.getOfflinePlayer(uuid));
    }

    public boolean isAlly(UUID uuid) {
        return allies.contains(Bukkit.getOfflinePlayer(uuid));
    }

    public void increaseKills() {
        kills += 1;
    }
}
