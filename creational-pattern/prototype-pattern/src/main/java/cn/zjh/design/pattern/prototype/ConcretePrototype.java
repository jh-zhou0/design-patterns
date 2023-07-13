package cn.zjh.design.pattern.prototype;

/**
 * 原型类的子类，用于构建原型
 * 
 * @author zjh - kayson
 */
public class ConcretePrototype extends Prototype {

    public ConcretePrototype(String name) {
        setName(name);
    }
    
}
