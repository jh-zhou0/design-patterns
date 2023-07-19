package cn.zjh.design.pattern.command;

/**
 * @author zjh - kayson
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
    
}
