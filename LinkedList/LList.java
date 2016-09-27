public class LList implements MyList{
  
  //private String data;
  private int size;
  private MyNode head;
  //private MyNode next;
  
  private static class MyNode{
    
    private MyNode next;
    private String item;
        
    public MyNode(String data){
      item = data;
      next = null;
    }
    
    public MyNode(){
      next = null;
    }    
  
  }
  
  public LList(){
    size = 0;
    head = null;
  }
  
  public void set(int pos, String data){
    if (pos>size-1){
      throw new IndexOutOfBoundsException("LAPAS!");
    }
    
    MyNode current = head;
    int x = 0;
    for(;x<pos;x++){
      current = current.next;
    }
    current.item = data;
  }
  
  public void add(String data){
    
    MyNode n = new MyNode(data);
    MyNode current = head;  
    
    if (size==0){
      head = n;
    }
    else{
     // MyNode current = head;
      while(current.next!=null){
        current = current.next;
      }
      current.next = n;
    }
    
    size++;
  }
  
  public void add(int pos, String data){
    if(size==0){
      add(data);
    }
    
    else if (pos>size+1){
      throw new IndexOutOfBoundsException();
    }
    
    else if(pos==size+1){
      add(data);
    }
    
    else if (pos==0){
      MyNode current = head;
      MyNode n = new MyNode(data);
      n.next = head;
      head = n;
      size++;
    }
    
    else{
      MyNode current = head;
      MyNode n = new MyNode(data);
      int i=0;
      for(;i!=pos-1;i++){
        current = current.next;
      }
      
      n.next = current.next;
      current.next = n;
      size++;
    }
  }

  public void remove(String data){
    MyNode current = head;
    boolean flag = false;
    int pos=0;
//    MyNode toRemove = current.next;
    for(;pos<size;pos++){
      if(current.item == data){
        flag = true;
        break;
      }
      
      current = current.next;
    
    }
    
    if(flag){
      remove(pos);
    }
    
    else{
      throw new IndexOutOfBoundsException("NOT IN LIST!");
    }
    
  }
 
  public void remove(int i){
    
    if (i>size-1 || i<0 || size==0){
      throw new IndexOutOfBoundsException("LAPAS!");
    }
    
    if (i == 0){
      head = head.next;
    }
    
    else{
      //MyNode temp = head;
      MyNode current = head;
      int x = 1;
      for(;x<i; x++){
        current = current.next;
        //temp = temp.next;
      }
      current.next = current.next.next;
    }
    size--;    
  
  }
  
  public String get(int pos){
    int i=0;
    if (pos>size-1){
      throw new IndexOutOfBoundsException("LAPAS!");
    }
    
    MyNode current = head;
    
    for(;i<pos;i++){
      current = current.next;
    }
    return current.item;
  }
  
  public int size(){
    return size;
  }

}