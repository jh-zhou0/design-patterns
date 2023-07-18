package cn.zjh.design.pattern.decorator;

/**
 * @author zjh - kayson
 */
public class FatManDecorator extends Decorator {

    @Override
    public void eat() {
        System.out.println("======FatManDecorator======");
        super.eat();
        reEat();
    }

    public void reEat() {
        System.out.println("再吃一碗饭...");
    }
    
}
