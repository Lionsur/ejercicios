
package Entrega05;

public class Main05 {
    
                 
    public static void main(String[] args) {
        CocheCRUD coche = new CocheCRUDImpl();
        coche.save();
        coche.findAll();
        coche.delete();
    }
    
}
