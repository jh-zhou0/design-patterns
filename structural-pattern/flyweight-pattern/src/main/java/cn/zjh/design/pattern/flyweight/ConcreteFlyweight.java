package cn.zjh.design.pattern.flyweight;

/**
 * @author zjh - kayson
 */
public class ConcreteFlyweight implements Flyweight {
    @Override
    public void action(int arg) {
        System.out.println("参数值: " + arg);
    }
}
