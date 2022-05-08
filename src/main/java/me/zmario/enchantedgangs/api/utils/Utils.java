package me.zmario.enchantedgangs.api.utils;

import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UtilityClass
public class Utils {

    public String colorize(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public String toBase64(ItemStack[] items) throws IllegalStateException {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            BukkitObjectOutputStream dataOutput = new BukkitObjectOutputStream(outputStream);

            dataOutput.writeInt(items.length);

            for (ItemStack item : items) {
                dataOutput.writeObject(item);
            }

            dataOutput.close();
            return Base64Coder.encodeLines(outputStream.toByteArray());
        } catch (Exception e) {
            throw new IllegalStateException("Error while serializing itemstacks.", e);
        }
    }

    public Inventory fromBase64(String data, String inventoryName) throws IOException {
        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(Base64Coder.decodeLines(data));
            BukkitObjectInputStream dataInput = new BukkitObjectInputStream(inputStream);
            Inventory inventory = Bukkit.getServer().createInventory(null, dataInput.readInt(), colorize(inventoryName));

            for (int i = 0; i < inventory.getSize(); i++) {
                inventory.setItem(i, (ItemStack) dataInput.readObject());
            }

            dataInput.close();
            return inventory;
        } catch (ClassNotFoundException e) {
            throw new IOException("Unable to decode class type.", e);
        }
    }

    public boolean containsIllegals(String string) {
        Matcher matcher = Pattern.compile("[~#@*+%{}<>\\[\\]|^]").matcher(string);
        return matcher.find();
    }

    public String listToString(List<OfflinePlayer> members) {
        StringBuilder builder = new StringBuilder();
        for (OfflinePlayer member : members) {
            builder.append(member.getUniqueId().toString());
            if (members.get(members.size() - 1) != member) {
                builder.append(";");
            }
        }
        return builder.toString();
    }

    public Object getPrivateField(Object instance, String fieldName) throws Exception {
        return getPrivateField(instance.getClass(), instance, fieldName);
    }

    public Object getPrivateField(Class<?> clazz, Object instance, String fieldName) throws Exception {
        Field f = clazz.getDeclaredField(fieldName);
        f.setAccessible(true);
        return f.get(instance);
    }
}
