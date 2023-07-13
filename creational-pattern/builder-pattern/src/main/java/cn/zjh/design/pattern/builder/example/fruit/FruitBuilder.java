package cn.zjh.design.pattern.builder.example.fruit;

/**
 * Fruit对象的构造接口
 * 
 * @author zjh - kayson
 */
public interface FruitBuilder {
    
    Fruit fruit = new Fruit();

    FruitBuilder buildName(String name);

    FruitBuilder buildColor(String color);

    FruitBuilder buildPrice(Double price);

    default Fruit build() {
        return fruit;
    }
    
}
