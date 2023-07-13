package cn.zjh.design.pattern.builder.example.fruit;

/**
 * Fruit对象的构造
 * 
 * @author zjh - kayson
 */
public class AppleBuilder implements FruitBuilder {
    
    public static AppleBuilder newBuilder() {
        return new AppleBuilder();
    }
     
    @Override
    public FruitBuilder buildName(String name) {
        fruit.setName(name);
        return this;
    }

    @Override
    public FruitBuilder buildColor(String color) {
        fruit.setColor(color);
        return this;
    }

    @Override
    public FruitBuilder buildPrice(Double price) {
        fruit.setPrice(price);
        return this;
    }
    
}
