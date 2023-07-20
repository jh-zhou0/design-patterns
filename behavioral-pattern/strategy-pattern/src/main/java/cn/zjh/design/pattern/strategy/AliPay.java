package cn.zjh.design.pattern.strategy;

/**
 * @author zjh - kayson
 */
public class AliPay implements Strategy {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
