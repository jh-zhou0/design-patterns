package cn.zjh.design.pattern.builder.example.food;

/**
 * @author zjh - kayson
 */
public class FoodBuilder {
    
    public static Builder newBuilder() {
        return new Builder();
    }
    
    public static class Builder {
        
        private String name;
        private String color;
        private String taste;
        
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        
        public Builder color(String color) {
            this.color = color;
            return this;
        }
        
        public Builder taste(String taste) {
            this.taste = taste;
            return this;
        }
        
        public Food build() {
            return new Food(name, color, taste);
        }
        
    }
    
}
