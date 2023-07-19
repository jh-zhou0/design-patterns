package cn.zjh.design.pattern.composite;

import java.util.List;

/**
 * @author zjh - kayson
 */
public abstract class Employer {
    
    private String name;
    
    protected List<Employer> employers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employer> getEmployers() {
        return employers;
    }

    public abstract void add(Employer employer);

    public abstract void delete(Employer employer);
}
