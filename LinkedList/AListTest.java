import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class AListTest extends TestCase {
  
  private MyList l;
  
  public void setUp() {
    l = new AList();
  }
  
  public void testAddOne() {
    AList l = new AList();
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    l.add("Shampoo");
    assertEquals("added one item", "Shampoo", l.get(0));
  }
  
  public void testAddTwo() {
    AList l = new AList();
    l.add("Shampoo");
    l.add("Soap");
    assertEquals("added two items and first was Shampoo", "Shampoo", l.get(0));
    assertEquals("added two items and second was Soap", "Soap", l.get(1));
    l.add("item3");
    l.add("item4");
    l.add("item 5");
    l.add("item6");
    l.add("item7");
    l.add("item8");
    l.add("item9");
    l.add("item10");
    l.add("item11");
    l.add("item12");
    assertEquals("added one item na mo sobra", "item11", l.get(10));
    assertEquals("added another item na mo sobra", "item12", l.get(11));
    
  }
  
  public void testAddBetween() {
    AList l = new AList();
    l.add("Shampoo");
    l.add("Soap");
    l.add(1, "Deodorant");
    assertEquals("added two items and first was Shampoo", "Shampoo", l.get(0));
    assertEquals("added two items and second was Deodorant", "Deodorant", l.get(1));
    assertEquals("added two items and third was Soap", "Soap", l.get(2));
  }
  
  
  public void testAddStart() {
    AList l = new AList();
    l.add("Shampoo");
    l.add("Soap");
    l.add(0, "Deodorant");
    assertEquals("added two items and first was Shampoo", "Deodorant", l.get(0));
    assertEquals("added two items and second was Deodorant", "Shampoo", l.get(1));
    assertEquals("added two items and third was Soap", "Soap", l.get(2));
  }
  
  
  public void testGetOutOfBoundsWhenEmpty() {
    AList l = new AList();
    try {
      l.get(0);
      fail("Should have thrown an exception!");
    } catch (IndexOutOfBoundsException e) {  
      // expected!
    }
  }
  
  
  public void testGetOutOfBounds() {
    AList l = new AList();
    l.add("Shampoo");
    try {
      l.get(1);
      fail("Should have thrown an exception!");
    } catch (IndexOutOfBoundsException e) {  
      // expected!
    }
  }
  
  public void testRemoveLast() {
    AList l = new AList();
    l.add("Shampoo");
    l.add("Deodorant");
    l.add("Soap");
    l.remove(2);
    try {
      l.get(2);
      fail("Should have thrown an exception!");
    } catch (IndexOutOfBoundsException e) {  
      assertEquals("added two items and first was Shampoo", "Shampoo", l.get(0));
      assertEquals("added two items and second was Deodorant", "Deodorant", l.get(1));
    }
  }
  
  
  public void testRemoveMid() {
    AList l = new AList();
    l.add("Shampoo");
    l.add("Deodorant");
    l.add("Soap");
    l.remove(1);
    try {
      l.get(2);
      fail("Should have thrown an exception!");
    } catch (IndexOutOfBoundsException e) {  
      assertEquals("added two items and first was Shampoo", "Shampoo", l.get(0));
      assertEquals("added two items and second was Soap", "Soap", l.get(1));
    }
  }
  
  public void testRemoveString(){
    AList l = new AList();
    l.add("Shampoo");
    l.add("Deodorant");
    l.add("Soap");
    l.remove("Deodorant");
    try {
      l.get(2);
      fail("Should have thrown an exception!");
    } catch (IndexOutOfBoundsException e) {  
      assertEquals("added two items and first was Shampoo", "Shampoo", l.get(0));
      assertEquals("added two items and second was Soap", "Soap", l.get(1));
    }
    l.add("Deodorant");
    l.remove("Shampoo");
    assertEquals("Soap must be in index 0", "Soap", l.get(0));
    assertEquals("Deodorant must be in index 1", "Deodorant", l.get(1));
    
  }
  
  
  public void testSet() {
    AList l = new AList();
    l.add("Shampoo");
    l.set(0, "Deodorant");
    assertEquals("added two items and first was Deodorant", "Deodorant", l.get(0));
  }
  
}
