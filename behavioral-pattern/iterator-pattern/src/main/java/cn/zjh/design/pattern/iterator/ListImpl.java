package cn.zjh.design.pattern.iterator;

/**
 * @author zjh - kayson
 */
public class ListImpl implements List {

    private Object[] list;

    private int index;

    private int size;

    public ListImpl(int length) {
        index = 0;
        size = 0;
        list = new Object[length];
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl(this);
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object obj) {
        list[index++] = obj;
        size++;
    }
}
