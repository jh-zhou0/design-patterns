package cn.zjh.design.pattern.iterator;

/**
 * @author zjh - kayson
 */
public interface List {
    Iterator iterator();
    Object get(int index);
    int size();
    void add(Object obj);
}
