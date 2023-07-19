/**
 * @author zjh - kayson
 */
public abstract class Person {
    
    protected Clothing clothing;
    private String name;

    public Person(Clothing clothing) {
        this.clothing = clothing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void dress();
}
