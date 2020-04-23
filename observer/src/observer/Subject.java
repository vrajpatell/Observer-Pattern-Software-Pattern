
package observer;

public interface Subject {
    public void addInventory(Observer o);
    public void sellInventory(Observer o);
    public void notifyObservers();
    
}
