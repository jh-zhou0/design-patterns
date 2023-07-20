package cn.zjh.design.pattern.observer;

/**
 * @author zjh - kayson
 */
public class ConcreteObserver1 implements Observer {
    
    private Subject subject;

    public ConcreteObserver1(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void action() {
        String message = subject.getMessage();
        if ("normal".equals(message)) {
            System.out.println("ConcreteObserver1 观察到一切正常");
        }
        if ("abnormal".equals(message)) {
            System.out.println("ConcreteObserver1 观察到不正常，请求支援");
        }
    }
}
