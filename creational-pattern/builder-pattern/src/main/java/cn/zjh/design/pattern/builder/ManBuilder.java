package cn.zjh.design.pattern.builder;

/**
 * Person对象的构造器
 * 
 * @author zjh - kayson
 */
public class ManBuilder implements PersonBuilder {

    Person person;

    public ManBuilder() {
        person = new Man();
    }
    
    @Override
    public void buildHead() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildBody() {
        person.setFoot("建造男人的脚");
    }

    @Override
    public void buildFoot() {
        person.setHead("建造男人的头");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
    
}
