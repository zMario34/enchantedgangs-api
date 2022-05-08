package me.zmario.enchantedgangs.api.commands;

import org.bukkit.command.CommandSender;

public abstract class SubCommand {

    public abstract void execute(CommandSender sender, String[] args);

    public abstract int getMinArgs();

    public abstract String getUsage();

    public abstract boolean useConsole();

}
