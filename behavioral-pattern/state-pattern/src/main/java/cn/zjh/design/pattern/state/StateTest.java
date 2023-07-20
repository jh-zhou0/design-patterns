package cn.zjh.design.pattern.state;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class StateTest {
    
    @Test
    public void test() {
        Context context = new Context();
        
        context.setState(new RainState());
        System.out.println(context.getStateMessage());

        context.setState(new SnowState());
        System.out.println(context.getStateMessage());
    }
}
