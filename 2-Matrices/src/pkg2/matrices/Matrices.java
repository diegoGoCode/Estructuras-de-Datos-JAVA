package pkg2.matrices;

/**
 *
 * @author diego.diaz
 */
public class Matrices {

    public static void main(String[] args) {
        
        System.out.println("Matriz con valores iniciales");
        //Se crea una matriz con con 3 filas y 3 columnas
        //De esta manera se crea una matris llamada (numeros), con valores iniciales
        //La matris se a organizado de esta manera para mayor entendimiento
        //Tambien se puede escribir en unsa sola linea
        //Ejemplo: int[][] numeros = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] numeros = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                          };
        
        
        //Se recorre la matriz llamada (numeros), para imprimirla por pantalla
        // for para recorrer las filas
        for (int i = 0; i < numeros.length; i++) {
            //for para recorrer las columnas
            for (int j = 0; j < numeros[i].length; j++) {
                //se imprime por pantalla cada uno de los valores de la matriz
                System.out.print("["+numeros[i][j]+"]");
            }
            System.out.println("");
        }
        
        
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");
        
        
        System.out.println("Matriz sin valores iniciales, para posteriormente asignarcelos");
        //De esta manera se crea una matris llamada (numero), con valores iniciales
        //Se crea una matriz con con 3 filas y 3 columnas
        //int numero[][] = new int[filas][columnas];
        int numero[][] = new int[3][3];
        
        //Se asignar valores a la matriz llamada(numero)
        
        numero[0][0] = 3; // se le asignar el valor de 3, en la posicion (fila) = 0 con (columna) = 0;
        numero[0][1] = 5; // se le asignar el valor de 5, en la posicion (fila) = 0 con (columna) = 1;
        numero[0][2] = 4; // se le asignar el valor de 4, en la posicion (fila) = 0 con (columna) = 2;
        numero[1][0] = 8; // se le asignar el valor de 8, en la posicion (fila) = 1 con (columna) = 0;
        numero[1][1] = 2; // se le asignar el valor de 2, en la posicion (fila) = 1 con (columna) = 1;
        numero[1][2] = 3; // se le asignar el valor de 3, en la posicion (fila) = 1 con (columna) = 2;
        numero[2][0] = 9; // se le asignar el valor de 9, en la posicion (fila) = 2 con (columna) = 0;
        numero[2][1] = 6; // se le asignar el valor de 6, en la posicion (fila) = 2 con (columna) = 1;
        numero[2][2] = 5; // se le asignar el valor de 5, en la posicion (fila) = 2 con (columna) = 2;
        
        //Al finalizar la matriz (numero) quedaria asi:
        //[3][5][4]
        //[8][2][3]
        //[9][6][5]

        //Se recorre la matriz llamada (numero), para imprimirla por pantalla
        // for para recorrer las filas
        for (int i = 0; i < numero.length; i++) {
            //for para recorrer las columnas
            for (int j = 0; j < numero[i].length; j++) {
                //se imprime por pantalla cada uno de los valores de la matriz
                System.out.print("["+numero[i][j]+"]");
            }
            System.out.println("");
        }
        
    }
    
}
