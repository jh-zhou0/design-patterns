package cn.zjh.design.pattern.strategy;

/**
 * @author zjh - kayson
 */
public class WeChatPay implements Strategy {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
