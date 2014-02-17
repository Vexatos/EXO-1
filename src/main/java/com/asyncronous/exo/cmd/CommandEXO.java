package com.asyncronous.exo.cmd;

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

        }
    }
}