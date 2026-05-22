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

                if(counts[indice] == 0){ // Si aparece por 1ª vez la letra se agrega al contador
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

        letra = Character.toLowerCase(letra); //Convierte a minúscula

        if (letra< 'a' || letra> 'z'){
            throw new IllegalArgumentException("El carácter no es válido"); //Validación
        }
        return counts[letra - 'a']; // Retorna cuantas veces aparece la letra
    }

    public void set(char letra, int valor){
        letra = Character.toLowerCase(letra);

        if (letra< 'a' || letra> 'z'){
            throw new IllegalArgumentException("El carácter no es válido"); //Validaciones
        }
        if(valor<0){
            throw new IllegalArgumentException("El valor no puede ser negativo");
        }
        int indice = letra - 'a'; // Uso de ascii para la posicion

        totalCount = totalCount - counts[indice]; // Se resta el valor anterior del total

        if (counts[indice] == 0 && valor > 0) { // Si no existia la letra, y ahora tiene valor
            nonZeroCount++;                    //aumenta las letras distintas
        }
        if (counts[indice] > 0 && valor == 0) { // Si existia la letra y ahora vale 0
            nonZeroCount--;                    // disminuye letras distintas
        }
        counts[indice] = valor; // Se asigna el nuevo valor

        totalCount = totalCount + valor;// Suma nuevo valor al total
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
    public char encriptarCesar ( char letra ){

        letra = Character.toLowerCase(letra);

        if (letra< 'a' || letra> 'z'){ //Valida la letra
            throw new IllegalArgumentException("El carácter no es válido");
        }
        if(letra > 'w'){ // Si se pasa de 'z' vuelve al inicio
            letra= (char)(letra - 23);
        }
        else{
            letra = (char)(letra + 3); // Desplazamiento de César + 3
        }
        return letra;

    }
    public char desencriptarCesar (char letra){

        letra = Character.toLowerCase(letra);

        if (letra< 'a' || letra> 'z'){
            throw new IllegalArgumentException("El carácter no es válido");
        }
        if(letra < 'd'){ // Si la letra es a, b o c, se mueve al final del abecedario
            letra= (char)(letra + 23);
        }
        else{
            letra = (char)(letra - 3); // Se retrocede las 3 posiciones
        }
        return letra;
    }

    public String encriptarPalabra(String palabra, int desplazamiento){

        palabra = palabra.toLowerCase(); // Convierte a minúscula
        String resultado = "";

        for(int i = 0; i < palabra.length(); i++){ // Recorre cada letra de la palabra
            char letra = palabra.charAt(i);

            if(letra >= 'a' && letra <= 'z'){ // Verifica que sea letra válida

                if(letra + desplazamiento > 'z'){ // Si se pasa de z, vuelve al inicio
                    letra = (char)(letra - 26 + desplazamiento);
                }
                else{
                    letra = (char)(letra + desplazamiento);
                }
            }

            resultado += letra;
        }

        return resultado;
    }

    public String desencriptarPalabra(String palabra, int desplazamiento){

        palabra = palabra.toLowerCase();
        String resultado = "";

        for(int i = 0; i < palabra.length(); i++){ //Recorre cada letra
            char letra = palabra.charAt(i);

            if(letra >= 'a' && letra <= 'z'){ // Validación

                if(letra - desplazamiento < 'a'){ // Si es menor de 'a', vuelve al final
                    letra = (char)(letra + 26 - desplazamiento);
                }
                else{
                    letra = (char)(letra - desplazamiento);
                }
            }
            resultado += letra;
        }
        return resultado;
    }
}

