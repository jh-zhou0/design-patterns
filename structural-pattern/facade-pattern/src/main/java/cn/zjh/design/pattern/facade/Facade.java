package cn.zjh.design.pattern.facade;

/**
 * @author zjh - kayson
 */
public class Facade {
    
    ServiceA serviceA;
    ServiceB serviceB;
    ServiceC serviceC;

    public Facade() {
        serviceA = new ServiceAImpl();
        serviceB = new ServiceBImpl();
        serviceC = new ServiceCImpl();
    }
    
    public void methodA() {
        serviceA.methodA();
        serviceB.methodB();
    }
    
    public void methodB() {
        serviceB.methodB();
        serviceC.methodC();
    }
    
    public void methodC() {
        serviceA.methodA();
        serviceC.methodC();
    }
    
}
