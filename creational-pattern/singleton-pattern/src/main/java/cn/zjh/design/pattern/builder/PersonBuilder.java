package cn.zjh.design.pattern.builder;

/**
 * Person对象的构造接口
 * 
 * @author zjh - kayson
 */
public interface PersonBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
    
}
