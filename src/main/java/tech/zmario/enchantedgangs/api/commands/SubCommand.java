package tech.zmario.enchantedgangs.api.commands;

import org.bukkit.command.CommandSender;

public abstract class SubCommand {

    /*
     * Method to execute the subcommand
     * @param sender of the command
     * @param args of the command
     */
    public abstract void execute(CommandSender sender, String[] args);

    /*
     * Integer to indicate the minimum amount of arguments needed
     */
    public abstract int getMinArgs();

    /*
     * String displayed when the subcommand syntax is wrong
     */
    public abstract String getUsage();

    /*
     * Boolean to indicate if the subcommand is executable from console
     */
    public abstract boolean useConsole();

}
