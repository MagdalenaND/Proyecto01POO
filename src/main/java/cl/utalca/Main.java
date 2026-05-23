package cl.utalca;

public class Main { // Prueba de métodos con "Hola Mundo"
    public static void main(String[] args) {
        InventarioLetras inv = new InventarioLetras (" Hola Mundo "); // Se crea objeto InventarioLetras
        System.out.println (" size : " + inv.size()); // 9
        System.out.println (" isEmpty : " + inv.isEmpty()); // false
        System .out. println ("get ('o'): " + inv . get ('o')); // Debe dar 2
        System.out.println(inv); // Tiene que retornar [adhlmnoou]
        System.out.println(inv.encriptarCesar('a')); // Da 'd'
        System.out.println(inv.desencriptarCesar('d')); // Desencripta y da la letra original 'a'
        inv.set('a', 5);
        System.out.println(inv.get('a')); // Debe dar 5
        System.out.println(inv.encriptarPalabra("play", 3)); // 'sodb'
        System.out.println(inv.desencriptarPalabra("sodb", 3)); // 'play'

        InventarioLetras inv2 = new InventarioLetras("Ada Lovelace"); // Segundo inventario
        InventarioLetras suma = inv.add(inv2); // Suma los inventarios
        System.out.println(suma);

        InventarioLetras resta = suma.subtract(inv2); //Resta los inventarios
        System.out.println(resta);
    }
}