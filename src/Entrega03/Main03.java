
package Entrega03;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        /*
        String[] nombres = new String [5];
        
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = leer.next();
        }
        */
        
        String [] nombres = {"Federico", "Nicolas", "Brunela", "Estefania"};
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
    }
}
