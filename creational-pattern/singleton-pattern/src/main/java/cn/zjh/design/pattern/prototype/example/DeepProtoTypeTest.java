package cn.zjh.design.pattern.prototype.example;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class DeepProtoTypeTest {
    
    @Test
    public void testDeepProtoType1() {
        DeepProtoType deepProtoType = new ConcreteDeepPrototype("deepProtoType", 
                new DeepCloneableTarget("deepCloneName"));
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.clone();
        System.out.println(deepProtoType);
        System.out.println(deepProtoType2);
    }
    
    @Test
    public void testDeepProtoType2() {
        DeepProtoType deepProtoType = new ConcreteDeepPrototype("deepProtoType",
                new DeepCloneableTarget("deepCloneName"));
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepProtoType);
        System.out.println(deepProtoType2);
    }
    
}
