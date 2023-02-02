package Entrega07_08_09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main07_08_09 {

    public static void main(String[] args) {
        //cadena string devuelta al reves

        String cadena = "hola mundo";
        imprimirTextoAlreves(cadena);
        System.out.println("");

        //1 - Crea un array unidimensional de Strings y recórrelo, 
        //mostrando únicamente sus valores.
        String[] arrayUni = {"Federico", "Brunela", "Estefi", "Rocco"};
        mostrarArray(arrayUni);

        /*2 - Crea un array bidimensional de enteros y recórrelo,
        mostrando la posición y el valor de cada elemento en ambas dimensiones.*/
        int[][] arrayBi = new int[5][5];

        completaMuestra(arrayBi);

        /*3 - Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. 
        Elimina el 2o y 3er elemento y muestra el resultado final
         */
        Vector<String> vector = new Vector();

        vector = cargaVector(vector);
        vector = eliminaElemento(vector);
        mostrarVector(vector);

        /*4 - Indica cuál es el problema de utilizar un Vector con la capacidad por defecto 
        si tuviésemos 1000 elementos para ser añadidos al mismo.
        
        Si el vector lo creamos con capacidad de 1000 elementos, al cargar el elemento 1001
        se duplica la capacidad a 2000 ocupando mucha memoria que capaz no se utilice
         */
 /*
        5 - Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. 
        Recorre ambos mostrando únicamente el valor de cada elemento.
         */
        ArrayList<String> array = new ArrayList<>();
        array = cargaArray(array);
        List<String> linked = new LinkedList<>(array);
        recorrerAmbos(array, linked);

        /*
        6 - Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con 
        elementos 1..10. 
        A continuación, con otro bucle, recórrelo y elimina los numeros pares. 
        Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, 
        puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
         */
        //opcion 1
        ArrayList<Integer> arrayEntero = new ArrayList<>();
        arrayEntero = cargaArrayEntero(arrayEntero);
        arrayEntero = eliimaPares(arrayEntero);

        //opcion 2
        ArrayList<Integer> arrayEntero2 = new ArrayList<>();
        arrayEntero2 = cargaYEliminoElementos(arrayEntero2);

        /*
        7 - Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
        a su llamante del tipo ArithmeticException que será capturada por su llamante 
        (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje 
        "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: 
        "Demo de código".
         */
        int num1 = 5;
        int num2 = 0;
        try {
            double resultado = dividePorCero(num1, num2);
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
        System.out.println("");

        /*
            Utilizando InputStream y PrintStream, crea una función que reciba dos
            parámetros: "fileIn" y "fileOut". La tarea de la función será realizar
            la copia del fichero dado en el parámetro "fileIn" al fichero dado en
            "fileOut".
        
        
        No logre hacerlo funcionar :(
         */
        try {
            String ruta = "c:\\ACTIVACION x32.txt";
            File f = new File(ruta);
            if (f.exists()) {
                System.out.println("Existe");
            }
            InputStream fichero = new FileInputStream("constraseña.txt");
            int datos;
            try {
                while ((datos = fichero.read()) != -1) {
                    System.out.println(datos);
                }
            } catch (IOException ex) {
                Logger.getLogger(Main07_08_09.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No existe el fichero " + ex.getMessage());
        }

    }

    private static void imprimirTextoAlreves(String cadena) {

        /* for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i));
        }*/
        for (int i = (cadena.length() - 1); i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
    }

    private static void mostrarArray(String[] arrayUni) {
        System.out.println("");
        System.out.println("Comienza la lectura del array");
        for (String nombres : arrayUni) {
            System.out.println(nombres);
        }
        System.out.println("");
    }

    private static void completaMuestra(int[][] arrayBi) {

        for (int i = 0; i < arrayBi[0].length; i++) {
            for (int j = 0; j < arrayBi[1].length; j++) {
                arrayBi[i][j] = (int) (Math.random() * ((10 - 1) + 1));
            }
        }

        for (int i = 0; i < arrayBi[0].length; i++) {
            for (int j = 0; j < arrayBi[1].length; j++) {
                System.out.print(arrayBi[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static Vector<String> cargaVector(Vector<String> vector) {
        vector.add("Argentina");
        vector.add("Francia");
        vector.add("Croacia");
        vector.add("Marruecos");
        vector.add("Holanda");
        return vector;
    }

    private static Vector<String> eliminaElemento(Vector<String> vector) {
        vector.remove(1);
        vector.remove(2);
        return vector;
    }

    private static void mostrarVector(Vector<String> vector) {
        for (String elemento : vector) {
            System.out.println("El pais es: " + elemento);
        }
        System.out.println("");
    }

    private static ArrayList<String> cargaArray(ArrayList<String> array) {
        array.add("Mendoza");
        array.add("Salta");
        array.add("Buenos Aires");
        array.add("Cordoba");
        return array;
    }

    private static void recorrerAmbos(ArrayList<String> array, List<String> linked) {
        System.out.println("Mostraremos el arraylist a continuacion");
        for (String elemento : array) {
            System.out.println(elemento);
        }
        System.out.println("");
        System.out.println("Mostraremos el linkedList a continuacion");

        for (String elemento1 : linked) {
            System.out.println(elemento1);
        }
        System.out.println("");
    }

    private static ArrayList<Integer> cargaArrayEntero(ArrayList<Integer> arrayEntero) {
        System.out.println("Procedemos a cargar y visualizar el array");
        for (int i = 0; i < 10; i++) {
            arrayEntero.add(i + 1);
            System.out.print(arrayEntero.get(i) + " ");
        }
        System.out.println(" ");
        return arrayEntero;
    }

    private static ArrayList<Integer> eliimaPares(ArrayList<Integer> arrayEntero) {
        System.out.println("Removemos los pares");
        System.out.println("");
        for (int i = 0; i < arrayEntero.size(); i++) {
            if (arrayEntero.get(i) % 2 == 0) {
                arrayEntero.remove(i);
                continue;
            }
        }

        System.out.println("Visualizamos como quedo el array");
        for (Integer integer : arrayEntero) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
        return arrayEntero;
    }

    private static ArrayList<Integer> cargaYEliminoElementos(ArrayList<Integer> arrayEntero2) {
        System.out.println("");
        System.out.println("Carga de 10 numeros y elimino los pares");

        for (int i = 0; i < 10; i++) {
            arrayEntero2.add(i + 1);
            if (i == 9) {
                for (int j = 0; j < arrayEntero2.size(); j++) {
                    if (arrayEntero2.get(j) % 2 == 0) {
                        System.out.println("Numero eliminado: " + arrayEntero2.get(j));
                        arrayEntero2.remove(j);
                        continue;
                    }
                }
                break;
            }

        }
        System.out.println("");
        return arrayEntero2;

    }

    private static double dividePorCero(int num1, int num2) throws ArithmeticException {
        double resultado;
        resultado = num1 / num2;
        return resultado;
    }

}
