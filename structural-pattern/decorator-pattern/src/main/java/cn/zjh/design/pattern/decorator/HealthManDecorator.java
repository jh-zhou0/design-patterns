package cn.zjh.design.pattern.decorator;

/**
 * @author zjh - kayson
 */
public class HealthManDecorator extends Decorator {

    @Override
    public void eat() {
        System.out.println("======HealthManDecorator======");
        super.eat();
        drink();
    }
    
    private void drink() {
        System.out.println("喝一杯苹果汁...");
    }
    
}
