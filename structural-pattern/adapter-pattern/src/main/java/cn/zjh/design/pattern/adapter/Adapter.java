package cn.zjh.design.pattern.adapter;

/**
 * 适配器，使用第三方接口
 * 
 * @author zjh - kayson
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int charge5V() {
        int origin = adaptee.charge220V();
        System.out.println("转换成5V充电...");
        return origin / 44;
    }
    
}
