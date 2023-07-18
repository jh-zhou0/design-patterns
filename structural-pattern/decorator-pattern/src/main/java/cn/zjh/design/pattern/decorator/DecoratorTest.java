package cn.zjh.design.pattern.decorator;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class DecoratorTest {
    
    @Test
    public void test() {
        Man man = new Man();
        FatManDecorator fatMan = new FatManDecorator();
        fatMan.setPerson(man);
        
        HealthManDecorator healthMan = new HealthManDecorator();
        healthMan.setPerson(fatMan);
        healthMan.eat();
    }
    
}
