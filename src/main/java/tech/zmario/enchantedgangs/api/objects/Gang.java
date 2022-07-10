package tech.zmario.enchantedgangs.api.objects;

import lombok.Data;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
public class Gang {

    private final String name;

    private UUID owner;
    private List<UUID> members;
    private List<UUID> allies = new ArrayList<>();

    private Inventory chest;

    private double balance;
    private int kills;

    public void addMember(OfflinePlayer player) {
        members.add(player.getUniqueId());
    }

    public void removeMember(OfflinePlayer player) {
        members.remove(player.getUniqueId());
    }

    public boolean isMember(OfflinePlayer player) {
        return members.contains(player.getUniqueId());
    }

    public void addAlly(OfflinePlayer player) {
        allies.add(player.getUniqueId());
    }

    public void removeAlly(OfflinePlayer player) {
        allies.remove(player.getUniqueId());
    }

    public boolean isAlly(OfflinePlayer player) {
        return allies.contains(player.getUniqueId());
    }

    public void increaseKills() {
        kills += 1;
    }
}
