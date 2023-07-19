package cn.zjh.design.pattern.proxy;

/**
 * @author zjh - kayson
 */
public class RealSubject implements Subject {
    @Override
    public void action() {
        System.out.println("========");
        System.out.println("========");
        System.out.println("这是被代理的类");
        System.out.println("========");
        System.out.println("========");
    }
}
