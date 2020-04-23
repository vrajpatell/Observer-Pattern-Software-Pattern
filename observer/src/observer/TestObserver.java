
package observer;

import java.util.ArrayList;

public class TestObserver {
    public static void main(String[] args){
    
       //Subject subject = new items(new ArrayList<Observer>(),"");
       items i1 = new items();
       customer c1 = new customer();
       i1.addInventory(c1);
       i1.setDesc("you ask to receive notice when"+i1.description+" is in inventory");
    }
}
