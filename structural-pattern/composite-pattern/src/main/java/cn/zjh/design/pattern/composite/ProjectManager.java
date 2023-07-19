package cn.zjh.design.pattern.composite;

import java.util.ArrayList;

/**
 * @author zjh - kayson
 */
public class ProjectManager extends Employer{

    public ProjectManager(String name) {
        setName(name);
        employers = new ArrayList<>();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }
}
