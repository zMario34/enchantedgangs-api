package tech.zmario.enchantedgangs.api;

import tech.zmario.enchantedgangs.api.commands.SubCommand;
import tech.zmario.enchantedgangs.api.configuration.ConfigurationFile;
import tech.zmario.enchantedgangs.api.manager.GangsManager;

public interface EnchantedGangsAPI {

    GangsManager getGangsManager();

    ConfigurationFile getMessagesFile();

    void registerSubCommand(String label, SubCommand subCommand);

}