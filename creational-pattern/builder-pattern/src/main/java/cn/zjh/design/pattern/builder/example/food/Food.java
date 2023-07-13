package cn.zjh.design.pattern.builder.example.food;

/**
 * Food对象
 * 
 * @author zjh - kayson
 */
public class Food {
    
    private String name;
    private String color;
    private String taste;

    public Food() {
    }

    public Food(String name, String color, String taste) {
        this.name = name;
        this.color = color;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
