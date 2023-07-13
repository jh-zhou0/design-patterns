package cn.zjh.design.pattern.prototype.example;

/**
 * @author zjh - kayson
 */
public class ConcreteDeepPrototype extends DeepProtoType {

    public ConcreteDeepPrototype(String name, DeepCloneableTarget deepCloneableTarget) {
        setName(name);
        setDeepCloneableTarget(deepCloneableTarget);
    }
    
}
