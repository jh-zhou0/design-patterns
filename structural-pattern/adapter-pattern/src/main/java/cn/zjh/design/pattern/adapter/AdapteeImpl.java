package cn.zjh.design.pattern.adapter;

/**
 * @author zjh - kayson
 */
public class AdapteeImpl implements Adaptee {
    
    @Override
    public int charge220V() {
        System.out.println("220V充电...");
        return 220;
    }
    
}
