import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;
  //When you add your unit tests to TestCompute,
  //you are going to use mockito to mock MessageQueue interface.
  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void testSizeZero(){
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(0);
    when(mq.contains(anyString())).thenReturn(true);

    Compute a = new Compute(mq);
    assertEquals(-1, a.countNumberOfOccurrences("test"));
  }

  @Test
  public void testNotContains(){
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3);
    when(mq.contains(anyString())).thenReturn(false);

    Compute a = new Compute(mq);
    assertEquals(0, a.countNumberOfOccurrences("test"));
  }

  @Test
  public void testMain(){
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(5);
    when(mq.getAt(0)).thenReturn("t");
    when(mq.getAt(1)).thenReturn("e");
    when(mq.getAt(2)).thenReturn("s");
    when(mq.getAt(3)).thenReturn("t");
    when(mq.getAt(4)).thenReturn("t");
    when(mq.contains("t")).thenReturn(true);

    Compute a = new Compute(mq);
    assertEquals(3, a.countNumberOfOccurrences("t"));
  }

}