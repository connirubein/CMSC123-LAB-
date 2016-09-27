public class AList implements MyList {
  private String[] items;
  private int count;
  private String[] temp;
  
  public AList() {
    items = new String[10];
    count = 0;
  }
  
  public void add(String item) {
    count++;
    //System.out.println(items.length);
    if(count>items.length){
      count--;
      throw new IndexOutOfBoundsException();
    }
    
     items[count-1] = item;
    
    if (count==items.length){
      newString();
    }
    
 }
  
  public void add(int i, String item) {
    count++;
    if(count>items.length){
      count--;
      throw new IndexOutOfBoundsException();
    }
    
    if(i==0){
      for(int y = count; y>0;y--){
        items[y] = items[y-1];
      }    
    }
    
    else{
      for(int  y = i ; y<items.length - 1;y++){
        items[y+1] = items[y];
      }
     }
    
    items[i] = item;
    
    if(count==items.length){
      newString();
    }
    
  }
  
  public void newString() {
    int x;
    temp = new String[items.length];
    for (x=0; x<items.length; x++){
      temp[x] = items[x];
    }
    
    items = new String [temp.length + 1];
    for (x=0; x<items.length-1; x++){
      items[x] = temp[x];
    }
    
 }
  
  public String get(int i) {
    if (count == 0 || i >= count) {
      throw new IndexOutOfBoundsException();
    }
    return items[i];
  }
  
  public void remove(int i) {

    if (i>count){
      throw new IndexOutOfBoundsException();
    }
    
    if (i == items.length -1){
      items[i] = null;
    }
    
    for(; i<items.length-1;i++){
      items[i] = items[i+1];
      }
    
    count--;
    }

  public void remove(String str) {

    for(int i =0;i<items.length;i++){
      if(items[i].equals(str)){
        remove(i);
        break;
      }
    
    }
  }
  
  public void set(int i, String item) {
    items[i] = item;
  }
 
  
}
