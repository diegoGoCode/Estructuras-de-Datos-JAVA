package pkg4.pilas;

import java.util.Stack;

/**
 *
 * @author diego.diaz
 */
public class Pilas {
    /**
     * push
     * pop
     * peek
     * empty
     * @param args 
     */
    public static void main(String[] args) {
        //FILO First in, last out
        //En una pila se pueden ingresar cualquier tipo de dato
        Stack pila = new Stack();
        pila.push(50);
        pila.push("Hola");
        pila.push(34);
        pila.push(1000);
        pila.push("mundo");
        pila.push("cola");
        
        //solo se puede obtener el ultimo valor
        //el metodo peek() para ver, y pop() para obtener y eliminar el ultimo valor
        System.out.println("El ultimo elemento en el pila es: " + pila.peek());
        
        //Validamos que la pila no este basia 
        while(pila.empty() == false){
            System.out.println(pila.pop());
        }
    }
    
}
