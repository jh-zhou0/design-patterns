package cn.zjh.design.pattern.proxy;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class ProxyTest {
    
    @Test
    public void test() {
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.action();
    }
    
}
