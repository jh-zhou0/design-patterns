package cn.zjh.design.pattern.factotymethod;

/**
 * 抽象工厂接口
 * 
 * @author zjh - kayson
 */
public interface IWorkFactory {

    /**
     * 定义获取Work实例对象的方法
     * 
     * @return Work
     */
    Work getWork();
    
}
