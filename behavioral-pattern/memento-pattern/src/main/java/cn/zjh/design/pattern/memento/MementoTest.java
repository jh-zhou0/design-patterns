package cn.zjh.design.pattern.memento;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class MementoTest {
    
    @Test
    public void test() {
        Originator org = new Originator();
        org.setState("开会中");

        // 将数据封装在Caretaker
        Caretaker ctk = new Caretaker();
        ctk.setMemento(org.createMemento());

        org.setState("睡觉中");
        org.showState();

        // 将数据重新导入
        org.setMemento(ctk.getMemento());
        org.showState();
    }
    
}
