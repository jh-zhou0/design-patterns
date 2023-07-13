package cn.zjh.design.pattern.prototype.example;

import java.io.Serializable;

/**
 * 被深拷贝对象
 * 
 * @author zjh - kayson
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    
    private String cloneName;

    public DeepCloneableTarget(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "cloneName='" + cloneName + '\'' +
                '}';
    }
}
