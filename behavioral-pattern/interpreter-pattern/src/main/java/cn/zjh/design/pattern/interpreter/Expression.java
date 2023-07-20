package cn.zjh.design.pattern.interpreter;

/**
 * @author zjh - kayson
 */
public interface Expression {
    boolean interpret(String context);
}
