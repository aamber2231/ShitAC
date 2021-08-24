package me.aamber.shitac.check;

import me.aamber.shitac.check.impl.MoveCheck;

import java.util.HashMap;
import java.util.Map;

public class CheckManager {
    private Map<String,Check> checkMap;

    public CheckManager() {
        this.checkMap = new HashMap<>();
        addCheck("move",new MoveCheck());
    }

    public void addCheck(String name, Check c){
        this.checkMap.put(name,c);
    }
    public Check getCheck(String name){
        return this.checkMap.get(name);
    }
}
