package cn.zjh.design.pattern.abstractfactory;

/**
 * IDog实现类
 * 
 * @author zjh - kayson
 */
public class WhiteDog implements IDog {
    
    @Override
    public void eat() {
        System.out.println("The white dog is eating!");
    }
    
}
