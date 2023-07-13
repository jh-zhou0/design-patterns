package cn.zjh.design.pattern.builder.example;

import cn.zjh.design.pattern.builder.example.food.Food;
import cn.zjh.design.pattern.builder.example.food.FoodBuilder;
import cn.zjh.design.pattern.builder.example.fruit.AppleBuilder;
import cn.zjh.design.pattern.builder.example.fruit.Fruit;
import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class TestExample {
    
    @Test
    public void testAppleBuilder() {
        Fruit fruit = AppleBuilder.newBuilder()
                .buildName("apple")
                .buildColor("red")
                .buildPrice(13.0)
                .build();
        System.out.println(fruit);
    }

    @Test
    public void testFoodBuilder() {
        Food food = FoodBuilder.newBuilder()
                .name("potato")
                .color("yellow")
                .taste("delicious")
                .build();
        System.out.println(food);
    }
}
