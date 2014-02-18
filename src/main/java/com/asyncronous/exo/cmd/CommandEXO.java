package com.asyncronous.exo.cmd;

import com.asyncronous.exo.EXO;
import com.asyncronous.exo.api.CoreRegistry;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public final class CommandEXO extends CommandBase {
    @Override
    public String getCommandName() {
        return "exo";
    }

    @Override
    public String getCommandUsage(ICommandSender var1) {
        return "/exo help";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args){
        if(!(args.length > 0)){
            sender.addChatMessage(new ChatComponentText("Invalid Arguments: /exo help"));
        } else{
            if(args[0].equalsIgnoreCase("validate")){
                if(CoreRegistry.INSTANCE.isValidCoreName(args[1])){
                    sender.addChatMessage(new ChatComponentText(args[1] + " is a valid core"));
                } else{
                    sender.addChatMessage(new ChatComponentText(args[1] + " is not a valid core"));
                }
            } else if(args[0].equalsIgnoreCase("version")){
                sender.addChatMessage(new ChatComponentText("Current Exoskeleton Version: " + EXO.MOD_VERSION));
            } else{
                sender.addChatMessage(new ChatComponentText("Invalid Switch: " + args[0]));
            }
        }
    }
}