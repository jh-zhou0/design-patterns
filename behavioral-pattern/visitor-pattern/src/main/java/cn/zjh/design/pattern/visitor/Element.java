package cn.zjh.design.pattern.visitor;

/**
 * @author zjh - kayson
 */
public interface Element {
    void accept(Visitor visitor);
}
