package cn.zjh.design.pattern.command;

/**
 * @author zjh - kayson
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
    
}
