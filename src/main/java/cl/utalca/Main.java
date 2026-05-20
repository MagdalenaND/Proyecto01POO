package cl.utalca;

public class Main { // Prueba de metodo get y toString con "Hola Mundo"
    public static void main ( String [] args ) {
        InventarioLetras inv = new InventarioLetras (" Hola Mundo "); // Se crea objeto InventarioLetras
        System.out.println (" size : " + inv.size()); // 9
        System.out.println (" isEmpty : " + inv.isEmpty()); // false
        System.out.println(inv.get('o')); // Debe dar 2
        System.out.println(inv); // Tiene que retornar [adhlmnoou]

    }
}