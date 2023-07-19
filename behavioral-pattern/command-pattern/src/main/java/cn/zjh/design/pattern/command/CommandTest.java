package cn.zjh.design.pattern.command;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class CommandTest {
    
    @Test
    public void test() {
        CommandImpl command = new CommandImpl(new Receiver());
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.execute();
    }
    
}
