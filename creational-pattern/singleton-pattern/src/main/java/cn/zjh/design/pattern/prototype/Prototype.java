package cn.zjh.design.pattern.prototype;

/**
 * 原型类，实现Cloneable接口
 * 
 * @author zjh - kayson
 */
public class Prototype implements Cloneable {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
