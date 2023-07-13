package cn.zjh.design.pattern.builder;

/**
 * Person对象的整体构造器
 * 
 * @author zjh - kayson
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
    
}
