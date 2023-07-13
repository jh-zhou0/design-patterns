package cn.zjh.design.pattern.prototype;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class ProtoTypeTest {
    
    @Test
    public void testProtoType() {
        Prototype prototype = new ConcretePrototype("prototype");
        Prototype prototype2 = (Prototype) prototype.clone();
        System.out.println(prototype.getName());
        System.out.println(prototype2.getName());
    }
    
}
