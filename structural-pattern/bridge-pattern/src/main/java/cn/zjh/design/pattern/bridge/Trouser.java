package cn.zjh.design.pattern.bridge;

/**
 * @author zjh - kayson
 */
public class Trouser implements Clothing {
    @Override
    public void dressClothing(String name) {
        System.out.println(name + "穿裤子");
    }
}
