
package Entrega05;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("Hemos guardado el coche");
    }

    @Override
    public void findAll() {
        System.out.println("Hemos encontrado el coche solicitado");
    }

    @Override
    public void delete() {
        System.out.println("Hemos eliminado el coche");
    }

    
    
}
