package cl.utalca;


public class InventarioLetras {

    private int [] counts; // Arreglo que guarda las veces que aparece cada letra del abcdario
    private int totalCount; //Guarda el total de letras encontradas
    private int nonZeroCount; // Guarda la cantidad de letras distintas que hay

    public InventarioLetras(String data){
        counts = new int[26]; // Arreglo de 26 posiciones (abcdario)
        totalCount = 0;  //Inicializadores
        nonZeroCount = 0;

        data = data.toLowerCase(); //convierte a minúscula

        for(int i = 0; i < data.length(); i++){ // Recorre cada carácter

            char letra = data.charAt(i);

            if(letra>= 'a' && letra <= 'z'){ // ve que la letra esté dentro de a-z
                int indice = letra - 'a'; // uso de ascii para las posiciones, para que no sea largo

                if(counts[indice] == 0){ // si aparece por 1ª vez la letra se agrega al contador
                    nonZeroCount++;      // de letras distintas
                }
                counts[indice]++; // aumenta la cantidad de esa letra

                totalCount++; // aumenta total de letras
            }
        }
    }
}

