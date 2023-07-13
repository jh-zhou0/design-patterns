package cn.zjh.design.pattern.factotymethod;

/**
 * Work接口的具体实现
 * 
 * @author zjh - kayson
 */
public class TeacherWork implements Work {
    
    @Override
    public void doWork() {
        System.out.println("老师审批作业!");
    }
    
}
