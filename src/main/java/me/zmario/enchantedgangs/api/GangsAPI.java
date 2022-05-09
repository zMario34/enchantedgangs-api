package me.zmario.enchantedgangs.api;

import me.zmario.enchantedgangs.api.commands.SubCommand;
import me.zmario.enchantedgangs.api.configuration.ConfigurationFile;
import me.zmario.enchantedgangs.api.manager.IGangsManager;

public interface GangsAPI {

    IGangsManager getGangsManager();

    ConfigurationFile getMessagesFile();

    void addSubCommand(String label, SubCommand subCommand);

}