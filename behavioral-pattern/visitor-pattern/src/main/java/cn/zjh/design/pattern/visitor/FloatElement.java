package cn.zjh.design.pattern.visitor;

/**
 * @author zjh - kayson
 */
public class FloatElement implements Element {

    private Float fe;

    public FloatElement(Float fe) {
        this.fe = fe;
    }

    public Float getFe() {
        return this.fe;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitFloat(this);
    }
}
