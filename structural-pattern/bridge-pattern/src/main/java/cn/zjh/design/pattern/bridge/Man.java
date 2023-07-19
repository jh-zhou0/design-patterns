package cn.zjh.design.pattern.bridge;

/**
 * @author zjh - kayson
 */
public class Man extends Person {

    public Man(Clothing clothing) {
        super(clothing);
        setName("男人");
    }

    @Override
    public void dress() {
        clothing.dressClothing(getName());
    }
    
}
