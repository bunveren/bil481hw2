import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
    assertFalse(c.compute(new int[]{1}));
  }

  @Test
  public void testArgLengthEven(){
    assertFalse(c.compute(new int[]{2,4,6,8}));
    assertFalse(c.compute(new int[]{2,4}));
  }

  @Test
  public void testArgZero(){
    assertFalse(c.compute(new int[]{2,0,4,6}));
    assertFalse(c.compute(new int[]{3,4,0,5}));
  }

  @Test
  public void testComputeMain(){
    assertTrue(c.compute(new int[]{2,4,6}));
  }
}