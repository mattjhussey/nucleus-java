import static org.junit.Assert.assertTrue;

import hussey.matt.Main;
import org.junit.Test;

public class MainTest {
  @Test
  public void thisIsATest() {
    String[] strings = new String[] {"one", "two", "three"};
    Main m = new Main();
    m.main(strings);
    assertTrue(true);
  }
}
