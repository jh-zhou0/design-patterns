package cn.zjh.design.pattern.abstractfactory;

/**
 * ICat实现类
 * 
 * @author zjh - kayson
 */
public class BlackCat implements ICat{
    
    @Override
    public void eat() {
        System.out.println("The black cat is eating!");
    }
    
}
