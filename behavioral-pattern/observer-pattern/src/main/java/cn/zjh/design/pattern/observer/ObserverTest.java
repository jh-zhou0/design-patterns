package cn.zjh.design.pattern.observer;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class ObserverTest {
    
    @Test
    public void test() {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1(subject);
        Observer observer2 = new ConcreteObserver2(subject);
        subject.register(observer1);
        subject.register(observer2);
        
        subject.sendMessage("normal");
        System.out.println("===================");
        subject.sendMessage("abnormal");
    }
}
