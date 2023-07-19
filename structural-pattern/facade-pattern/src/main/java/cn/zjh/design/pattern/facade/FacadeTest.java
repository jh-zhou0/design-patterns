package cn.zjh.design.pattern.facade;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class FacadeTest {
    
    @Test
    public void test() {
        ServiceA serviceA = new ServiceAImpl();
        ServiceB serviceB = new ServiceBImpl();
        serviceA.methodA();
        serviceB.methodB();
        System.out.println("===================");
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
    
}
