import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void testArgLengthOne(){
    assertFalse(c.compute(1));
  }

  @Test
  public void testArgLengthEven(){
    assertFalse(c.compute(2,4,6,8));
    assertFalse(c.compute(2,4));
  }

  @Test(expected = RuntimeException.class)
  public void testArgZeroThrows(){
    assertFalse(c.compute(0,2,4));
  }


  @Test
  public void testComputeMain(){
    assertTrue(c.compute(2,4,6));
    assertFalse(c.compute(3,5,11));

  }
}