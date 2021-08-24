package me.aamber.shitac.check;

import java.util.HashMap;
import java.util.Map;

public class CheckManager {
    private Map<String,Check> checkMap;

    public CheckManager() {
        this.checkMap = new HashMap<>();
    }

    public void addCheck(String name, Check c){
        this.checkMap.put(name,c);
    }
    public Check getCheck(String name){
        return this.checkMap.get(name);
    }
}
