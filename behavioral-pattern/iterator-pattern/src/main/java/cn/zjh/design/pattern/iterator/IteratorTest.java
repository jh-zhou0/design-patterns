package cn.zjh.design.pattern.iterator;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class IteratorTest {
    
    @Test
    public void test() {
        ListImpl list = new ListImpl(100);
        list.add("a");
        list.add("b");
        list.add("c");
        // 第一种迭代方式
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=====");
        // 第二种迭代方式
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
}
