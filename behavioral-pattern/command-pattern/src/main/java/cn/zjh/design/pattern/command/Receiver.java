package cn.zjh.design.pattern.command;

/**
 * 任何类都可能作为一个接收者。
 * 
 * @author zjh - kayson
 */
public class Receiver {
    public void receive() {
        System.out.println("This is Receive class!");
    }
}
