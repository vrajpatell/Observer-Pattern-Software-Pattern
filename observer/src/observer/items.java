package observer;

import java.util.List;

public class items implements Subject{
   List<Observer> observerList;
   String number;
   String description;
   int quantity;
   
   items(String number, String description, int quantity){
       this.number = number;
       this.description = description;
       this.quantity = quantity;  
   }
   public static void main(String[] arg){
       items item1 = new items("1", "Widget 1", 1);
       items item2 = new items("2", "Widget 2", 2);
       items item3 = new items("3", "Widget 3", 3);
   }

    items() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   @Override
    public void addInventory(Observer o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        observerList.add(o);
    }

    @Override
    public void sellInventory(Observer o) {
      
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 int index = observerList.indexOf(o);
 observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println();
        observerList.stream().forEach((Observer o) -> {
            o.update(description);
        });
    }
    public void setDesc(String description){
        this.description = description;
        notifyObservers();
    }
     
  
}
