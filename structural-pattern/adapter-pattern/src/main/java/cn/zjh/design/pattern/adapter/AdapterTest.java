package cn.zjh.design.pattern.adapter;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class AdapterTest {
    
    @Test
    public void testAdapter() {
        Adapter adapter = new Adapter(new AdapteeImpl());
        System.out.println(adapter.charge5V());
    }
    
}
