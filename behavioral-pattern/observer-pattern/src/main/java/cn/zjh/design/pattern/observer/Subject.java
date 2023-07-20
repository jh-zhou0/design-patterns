package cn.zjh.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjh - kayson
 */
public abstract class Subject {
    
    protected List<Observer> observers;
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void register(Observer observer) {
        this.observers.add(observer);
    }

    public void unRegister(Observer observer) {
        this.observers.remove(observer);
    }
    
    public void initObservers() {
        observers = new ArrayList<>();
    }
    
    public abstract void sendMessage(String msg);
}
