package cn.zjh.design.pattern.state;

/**
 * @author zjh - kayson
 */
public class Context {
    
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public String getStateMessage() {
        return state.getState();
    }
}
