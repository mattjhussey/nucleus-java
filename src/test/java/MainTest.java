import static org.junit.Assert.assertTrue;
import org.junit.Test;
import hussey.matt.Main;

public class MainTest {
    @Test
    public void aTest() {
	String[] strings = new String[] {"one", "two", "three"};
	Main m = new Main();
	m.main(strings);
	assertTrue(true);
    }
}
