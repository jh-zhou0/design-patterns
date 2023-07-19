package cn.zjh.design.pattern.composite;

/**
 * @author zjh - kayson
 */
public class Programmer extends Employer {

    public Programmer(String name) {
        setName(name);
        // 程序员, 表示没有下属了
        employers = null;
    }

    @Override
    public void add(Employer employer) {
        
    }

    @Override
    public void delete(Employer employer) {

    }
}
