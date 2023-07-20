package cn.zjh.design.pattern.templatemethod;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class TemplateTest {
    
    @Test
    public void test() {
        AbstractTemplate template = new ConcreteTemplate1();
        template.eat();
        
        template = new ConcreteTemplate2();
        template.eat();
    }
}
