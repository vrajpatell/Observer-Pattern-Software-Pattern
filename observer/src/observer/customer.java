package observer;

public class customer implements Observer 
{
String name;
String email;
String desc;
customer(String name, String email)    
{
    this.name = name;
    this.email = email; 
}

    customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public void main (String[] args){
        customer c1 = new customer("David", "david.b.north@gmail.com");
        customer c2 = new customer("Vraj", "vraj.patel@eagels.com");
        customer c3 = new customer("Random1", "random1@gmail.com");
 }    

    @Override
    public void update(String description) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    this.desc = description;
    display();
    }
    
    private void display()
    {
    System.out.println("("+email+"): " +desc );
    }
}
