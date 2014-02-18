package com.asyncronous.exo.api;

import com.asyncronous.exo.EXO;

import java.util.LinkedList;
import java.util.List;

public enum CoreRegistry{
    INSTANCE;

    private final List<ICore> CORES = new LinkedList<ICore>();

    public void registerCore(ICore core){
        if(isValidCoreName(core.getCoreName())){
            return;
        } else{
            EXO.LOGGER.info("Registering Core: " + core.getCoreName());

            this.CORES.add(core);
        }
    }

    public boolean isValidCoreName(String name){
        for(ICore core : this.CORES){
            if(core.getCoreName().equalsIgnoreCase(name)){
                return true;
            }
        }

        return false;
    }
}