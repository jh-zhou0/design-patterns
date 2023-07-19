/**
 * @author zjh - kayson
 */
public class Female extends Person {

    public Female(Clothing clothing) {
        super(clothing);
        setName("女人");
    }

    @Override
    public void dress() {
        clothing.dressClothing(getName());
    }
    
}
