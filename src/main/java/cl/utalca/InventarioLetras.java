package cl.utalca;


public class InventarioLetras {

    private int [] counts; // Arreglo que guarda las veces que aparece cada letra del abecedario
    private int totalCount; //Guarda el total de letras encontradas
    private int nonZeroCount; // Guarda la cantidad de letras distintas que hay

    public InventarioLetras(String data){
        counts = new int[26]; // Arreglo de 26 posiciones (abcdario)
        totalCount = 0;  //Inicializadores
        nonZeroCount = 0;

        data = data.toLowerCase(); //Convierte a minúscula

        for(int i = 0; i < data.length(); i++){ // Recorre cada carácter

            char letra = data.charAt(i);

            if(letra>= 'a' && letra <= 'z'){ // Ve que la letra esté dentro de a-z
                int indice = letra - 'a'; // Uso ASCII para obtener la posición de la letra en el arreglo

                if(counts[indice] == 0){ // si aparece por 1ª vez la letra se agrega al contador
                    nonZeroCount++;      // de letras distintas
                }
                counts[indice]++; // Aumenta la cantidad de esa letra

                totalCount++; // Aumenta total de letras
            }
        }
    }

    public int size (){ //Metodo que retorna el total de letras que se encontraron
        return totalCount;
    }
    public boolean isEmpty (){ // Metodo que retorna "true" si esta vacio el inventario
        return nonZeroCount == 0;
    }
    public int get(char letra){
        letra = Character.toLowerCase(letra); //Convierte a minuscula
        if (letra< 'a' || letra> 'z'){
            throw new IllegalArgumentException("El carácter no es válido"); //Validacion
        }
        return counts[letra - 'a']; // Retorna cuantas veces aparece la letra
    }

    public String toString() {
        String resultado = "[";

        for(int i = 0; i < 26; i++){ // Recorre las 26 letras

            for(int j = 0; j < counts[i]; j++){// Repite la letra según su cantidad

                resultado += (char)('a' + i); // Genera letras
            }
        }
        resultado += "]";

        return resultado;
    }
}

