package cn.zjh.design.pattern.state;

/**
 * @author zjh - kayson
 */
public class RainState implements State {
    @Override
    public String getState() {
        return "下雨";
    }
}
