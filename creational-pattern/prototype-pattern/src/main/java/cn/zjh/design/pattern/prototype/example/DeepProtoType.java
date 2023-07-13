package cn.zjh.design.pattern.prototype.example;

import java.io.*;

/**
 * @author zjh - kayson
 */
public class DeepProtoType implements Serializable, Cloneable {

    private static final long serialVersionUID = 2L;
    
    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    // 方式一：重写clone方法来实现深拷贝
    @Override
    public Object clone() {
        DeepProtoType deepProtoType = null;
        try {
            // 这里完成对基本数据类型(属性)和String的克隆
            Object deep = super.clone();
            // 对引用类型的属性，进行单独处理
            deepProtoType = (DeepProtoType) deep;
            deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepProtoType;
    }
    
    // 方式二：通过对象的序列化实现 (推荐)
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
                if (oos != null) {
                    oos.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }
}
