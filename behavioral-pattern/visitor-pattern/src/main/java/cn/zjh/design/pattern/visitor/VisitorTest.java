package cn.zjh.design.pattern.visitor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjh - kayson
 */
public class VisitorTest {
    
    @Test
    public void test() {
        Visitor visitor = new ConcreteVisitor();
        StringElement se = new StringElement("apple");
        se.accept(visitor);

        FloatElement fe = new FloatElement(1.5F);
        fe.accept(visitor);
        
        System.out.println("===========");

        List<Element> result = new ArrayList<>();
        result.add(new StringElement("apple"));
        result.add(new StringElement("apple"));
        result.add(new StringElement("apple"));
        result.add(new FloatElement(1.5F));
        result.add(new FloatElement(1.5F));
        result.add(new FloatElement(1.5F));
        visitor.visitCollection(result);
    }
}
