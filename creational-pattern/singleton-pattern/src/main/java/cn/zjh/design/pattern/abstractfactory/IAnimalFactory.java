package cn.zjh.design.pattern.abstractfactory;

/**
 * 抽象工厂类
 * 
 * @author zjh - kayson
 */
public interface IAnimalFactory {

    /**
     * 定义创建ICat接口实例的方法
     * 
     * @return ICat
     */
    ICat createCat();
    
    /**
     * 定义创建IDog接口实例的方法
     * 
     * @return IDog
     */
    IDog createDog();
    
}
