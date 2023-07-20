package cn.zjh.design.pattern.mediator;

/**
 * @author zjh - kayson
 */
public class ConcreteMediator extends Mediator {
    
    private ColleagueA colleagueA;
    
    private ColleagueB colleagueB;

    public ConcreteMediator() {
        colleagueA = new ColleagueA();
        colleagueB = new ColleagueB();
    }

    @Override
    public void notice(String content) {
        if ("boss".equals(content)) {
            // 老板来了, 通知员工A
            colleagueA.action();
        }
        // 客户来了, 通知前台B
        if ("client".equals(content)) {
            colleagueB.action();
        }
    }
}
