package cn.zjh.design.pattern.state;

/**
 * @author zjh - kayson
 */
public class SnowState implements State {
    @Override
    public String getState() {
        return "下雪";
    }
}
