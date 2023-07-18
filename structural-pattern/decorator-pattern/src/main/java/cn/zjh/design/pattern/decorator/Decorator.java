package cn.zjh.design.pattern.decorator;

/**
 * @author zjh - kayson
 */
public class Decorator implements Person {

    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }
    
    @Override
    public void eat() {
        person.eat();
    }
}
