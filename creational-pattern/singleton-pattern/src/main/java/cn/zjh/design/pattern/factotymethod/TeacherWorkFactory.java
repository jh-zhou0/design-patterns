package cn.zjh.design.pattern.factotymethod;

/**
 * IWorkFactory工厂的实现类
 * 
 * @author zjh - kayson
 */
public class TeacherWorkFactory implements IWorkFactory {
    
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
    
}
