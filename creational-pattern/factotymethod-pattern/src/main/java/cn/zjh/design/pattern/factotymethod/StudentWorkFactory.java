package cn.zjh.design.pattern.factotymethod;

/**
 * IWorkFactory工厂的实现类
 * 
 * @author zjh - kayson
 */
public class StudentWorkFactory implements IWorkFactory {
    
    @Override
    public Work getWork() {
        return new StudentWork();
    }
    
}
