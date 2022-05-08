package me.zmario.enchantedgangs.api;

import me.zmario.enchantedgangs.api.database.IDatabase;
import me.zmario.enchantedgangs.api.manager.IManager;
import me.zmario.enchantedgangs.api.objects.IConfigurationFile;
import me.zmario.enchantedgangs.api.objects.SubCommand;

public interface GangsAPI {

    IDatabase getGangsDatabase();

    IManager getGangsManager();

    IConfigurationFile getMessagesFile();

    void addSubCommand(String label, SubCommand subCommand);

}