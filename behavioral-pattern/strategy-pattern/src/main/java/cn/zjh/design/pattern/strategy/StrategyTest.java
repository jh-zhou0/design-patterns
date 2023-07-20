package cn.zjh.design.pattern.strategy;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class StrategyTest {
    
    @Test
    public void test() {
        Context context = new Context(new AliPay());
        context.action();
        
        context = new Context(new WeChatPay());
        context.action();
    }
}
