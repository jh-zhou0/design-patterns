package cn.zjh.design.pattern.strategy;

/**
 * @author zjh - kayson
 */
public class Context {
    
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void action() {
        strategy.pay();
    }
}
