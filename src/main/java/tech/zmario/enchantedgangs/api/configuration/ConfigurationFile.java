package tech.zmario.enchantedgangs.api.configuration;

import com.google.common.collect.Lists;
import lombok.Getter;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Getter
public class ConfigurationFile {
    private final Plugin plugin;
    private final String path;

    private Configuration config;
    private final File file;

    private static final List<ConfigurationFile> list = Lists.newArrayList();

    public ConfigurationFile(Plugin plugin, String path) {
        this.plugin = plugin;
        this.path = path;

        file = new File(plugin.getDataFolder(), path);
        try {
            config = create();
        } catch (IOException e) {
            e.printStackTrace();
        }

        list.add(this);
    }

    private Configuration create() throws IOException {
        if (!file.exists()) {
            plugin.saveResource(path, false);
        }

        return YamlConfiguration.loadConfiguration(file);
    }

    public void recreate() {
        file.delete();
        try {
            create();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reload() {
        config = YamlConfiguration.loadConfiguration(file);
    }

    public static void reloadAll() {
        list.forEach(ConfigurationFile::reload);
    }
}