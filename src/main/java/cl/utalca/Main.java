package cl.utalca;

public class Main { // primera prueba de metodo size y isEmpty con "Hola Mundo"
    public static void main ( String [] args ) {
        InventarioLetras inv = new InventarioLetras (" Hola Mundo "); // se crea objeto InventarioLetras
        System.out.println (" size : " + inv.size()); // 9
        System.out.println (" isEmpty : " + inv.isEmpty()); // false


    }
}