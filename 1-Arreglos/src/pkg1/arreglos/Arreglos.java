package pkg1.arreglos;

/**
 *
 * @author diego.diaz
 */
public class Arreglos {

    public static void main(String[] args) {
        
        
        System.out.println("Arreglo con valores iniciales");
        
        // Definimos un arreglo de tipo String llamado array con 6 posiciones
        // de esta manera de declara un array, con valores
        String[] array = {"juan","diego","laura","nicolas","william","nuria"};
        
        //Recorremos el arreglo llamado (array) y lo imprimirmos por pantalla
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        
        //Texto para diferenciar
        System.out.println("");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Arreglo sin valores iniciales, para posteriormente asigarcelos");
        
        //estamos definiendo un arreglo de tipo int llamado numeros con 5 posiciones
        // de esta manera de declara un array sin valores, para posterior mente asignarle valores
        int numeros[] = new int[5];
        
        //Asignamos valores a cada una de las posiciones del arreglo llamado (numeros)
        numeros[0] = 2;
        numeros[1] = 78;
        numeros[2] = 56;
        numeros[3] = 8;
        numeros[4] = 23;
        
        //Recorremos el arreglo llamado (numeros) y lo imprimirmos por pantalla
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+",");
        }
        
    }
    
}
