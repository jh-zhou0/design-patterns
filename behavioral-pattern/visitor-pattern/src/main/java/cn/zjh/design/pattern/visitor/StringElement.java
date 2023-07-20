package cn.zjh.design.pattern.visitor;

/**
 * @author zjh - kayson
 */
public class StringElement implements Element {

    private String se;

    public StringElement(String se) {
        this.se = se;
    }

    public String getSe() {
        return this.se;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}
