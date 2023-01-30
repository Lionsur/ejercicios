
package Entrega02;

public class Main02 {
    public static void main(String[] args) {
        double precio = 443;
        double precioFinal = precioConIva(precio);
        System.out.println("El precio con IVA es: " + precioFinal);
    }

    private static double precioConIva(double precio) {
        return precio * 1.21;
    }
}
