package cn.zjh.design.pattern.abstractfactory;

/**
 * ICat实现类
 * 
 * @author zjh - kayson
 */
public class WhiteCat implements ICat {
    
    @Override
    public void eat() {
        System.out.println("The white cat is eating!");
    }
    
}
