package cn.zjh.design.pattern.visitor;

import java.util.Collection;

/**
 * @author zjh - kayson
 */
public interface Visitor {
    void visitString(StringElement stringE);
    void visitFloat(FloatElement floatE);
    <T> void visitCollection(Collection<T> collection);
}
