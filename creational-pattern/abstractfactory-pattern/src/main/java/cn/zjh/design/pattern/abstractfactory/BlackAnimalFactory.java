package cn.zjh.design.pattern.abstractfactory;

/**
 * 抽象工厂实现类
 * 
 * @author zjh - kayson
 */
public class BlackAnimalFactory implements IAnimalFactory {
    
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
    
}
