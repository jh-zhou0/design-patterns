package cn.zjh.design.pattern.abstractfactory;

/**
 * IDog实现类
 * 
 * @author zjh - kayson
 */
public class BlackDog implements IDog{
    
    @Override
    public void eat() {
        System.out.println("The black dog is eating!");
    }
    
}
