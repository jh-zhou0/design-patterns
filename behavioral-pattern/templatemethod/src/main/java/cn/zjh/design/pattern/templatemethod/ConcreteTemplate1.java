package cn.zjh.design.pattern.templatemethod;

/**
 * @author zjh - kayson
 */
public class ConcreteTemplate1 extends AbstractTemplate {
    @Override
    public void eat() {
        System.out.println("eat apple");
    }
}
