package cn.zjh.design.pattern.abstractfactory;

/**
 * 抽象工厂实现类
 * 
 * @author zjh - kayson
 */
public class WhiteAnimalFactory implements IAnimalFactory {
    
    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
    
}
