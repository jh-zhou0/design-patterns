package cn.zjh.design.pattern.memento;

/**
 * @author zjh - kayson
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return this.memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
