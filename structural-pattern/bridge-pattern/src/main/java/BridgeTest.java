import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class BridgeTest {
    
    @Test
    public void test() {
        Jacket jacket = new Jacket();
        Trouser trouser = new Trouser();
        Person man = new Man(jacket);
        man.dress();
        Person female = new Female(trouser);
        female.dress();
    }
    
}
