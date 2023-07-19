package cn.zjh.design.pattern.command;

/**
 * @author zjh - kayson
 */
public class CommandImpl extends Command {
    
    public CommandImpl(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.receive();
    }
}
