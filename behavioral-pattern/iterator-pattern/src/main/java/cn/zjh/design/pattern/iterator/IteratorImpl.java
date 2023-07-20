package cn.zjh.design.pattern.iterator;

/**
 * @author zjh - kayson
 */
public class IteratorImpl implements Iterator {
    
    private List list;
    
    private int index;

    public IteratorImpl(List list) {
        index = 0;
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}
