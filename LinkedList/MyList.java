public interface MyList{
  
  //public MyNode(Object item);
  public void add(String item);
  public void add(int i, String item);
  public void remove(String item);
  public void remove(int i);
  public String get(int i);
  public void set(int i, String item);
  //public int size();
}