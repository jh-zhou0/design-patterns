package cn.zjh.design.pattern.visitor;

import java.util.Collection;

/**
 * @author zjh - kayson
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visitString(StringElement stringE) {
        System.out.println(stringE.getSe());
    }

    @Override
    public void visitFloat(FloatElement floatE) {
        System.out.println(floatE.getFe());
    }

    @Override
    public <T> void visitCollection(Collection<T> collection) {
        for (Object obj : collection) {
            if (obj instanceof Element) {
                ((Element) obj).accept(this);
            }
        }
    }
}
