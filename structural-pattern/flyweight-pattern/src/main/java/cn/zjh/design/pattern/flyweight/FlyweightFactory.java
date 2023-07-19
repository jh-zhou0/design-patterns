package cn.zjh.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjh - kayson
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> flyweights = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        if (flyweights.get(key) == null) {
            flyweights.put(key, new ConcreteFlyweight());
        }
        return flyweights.get(key);
    }

    public static int getSize() {
        return flyweights.size();
    }    
}
