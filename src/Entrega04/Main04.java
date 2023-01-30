
package Entrega04;

public class Main04 {
    public static void main(String[] args) {
        SmartDevice celular = new SmartPhone("gris", "c", "motorola", "j5", 1515042, 2018, "Vietnam");
        SmartDevice reloj = new SmartWatch("android", "azul", "xiaomi", "band6", 605406, 2019, "China");
        
        System.out.println(celular.toString());
        System.out.println(reloj.toString());
    }
}
