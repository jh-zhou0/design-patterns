package cn.zjh.design.pattern.observer;

/**
 * @author zjh - kayson
 */
public class ConcreteSubject extends Subject {

    public ConcreteSubject() {
        initObservers();
    }

    @Override
    public void sendMessage(String msg) {
        setMessage(msg);
        observers.forEach(Observer::action);
    }
    
}
