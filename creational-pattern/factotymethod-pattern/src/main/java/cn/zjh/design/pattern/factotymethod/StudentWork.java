package cn.zjh.design.pattern.factotymethod;

/**
 * Work接口的具体实现
 * 
 * @author zjh - kayson
 */
public class StudentWork implements Work {
    
    @Override
    public void doWork() {
        System.out.println("学生做作业!");
    }
    
}
