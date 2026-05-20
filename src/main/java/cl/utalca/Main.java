package cl.utalca;

public class Main { // Prueba de metodo encriptarCesar y desencriptarCesar con "Hola Mundo"
    public static void main ( String [] args ) {
        InventarioLetras inv = new InventarioLetras (" Hola Mundo "); // Se crea objeto InventarioLetras
        System.out.println (" size : " + inv.size()); // 9
        System.out.println (" isEmpty : " + inv.isEmpty()); // false
        System.out.println(inv.get('o')); // Debe dar 2
        System.out.println(inv); // Tiene que retornar [adhlmnoou]
        System.out.println(inv.encriptarCesar('a')); // Da 'd'
        System.out.println(inv.desencriptarCesar('d')); // Desencripta y da la letra original 'a'
    }
}