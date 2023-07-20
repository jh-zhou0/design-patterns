package cn.zjh.design.pattern.mediator;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class MediatorTest {
    
    @Test
    public void test() {
        Mediator mediator = new ConcreteMediator();
        // 老板来了
        mediator.notice("boss");
        // 客户来了
        mediator.notice("client");
    }
    
}
