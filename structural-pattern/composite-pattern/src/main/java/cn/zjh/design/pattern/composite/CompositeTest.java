package cn.zjh.design.pattern.composite;

import org.junit.Test;

import java.util.List;

/**
 * @author zjh - kayson
 */
public class CompositeTest {
    
    @Test
    public void test() {
        Employer pm = new ProjectManager("项目经理");
        Employer pa = new ProjectAssistant("项目助理");
        Employer programmer1 = new Programmer("程序员一");
        Employer programmer2 = new Programmer("程序员二");
        // 为项目经理添加项目助理
        pm.add(pa);
        // 为项目经理添加程序员
        pm.add(programmer1);
        pm.add(programmer2);

        List<Employer> ems = pm.getEmployers();
        for (Employer em : ems) {
            System.out.println(em.getName());
        }
    }
    
}
