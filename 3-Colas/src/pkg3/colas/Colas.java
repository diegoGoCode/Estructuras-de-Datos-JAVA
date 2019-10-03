package pkg3.colas;

import java.util.LinkedList;


/**
 *
 * @author diego.diaz
 */
public class Colas {

    /**
     * 
     * offer, poll
     */
    public static void main(String[] args) {
        
        //FIFO Primero en entrar, Primero en salir
        //Se declara una cola con el nombre (cola)
        LinkedList cola = new LinkedList();
        System.out.println("Cola agregando valores con for");
        for (int i = 1; i < 11; i++) {
            //agregamos elementos a la fila con el metodo offer()
            cola.offer(i);
        }
        
        while(cola.peek() != null){
            System.out.print(cola.poll()+",");
        }
        
        System.out.println("");
        System.out.println("");
        LinkedList cola2 = new LinkedList();
        System.out.println("Cola agregando valores uno a uno");
        
        //agregamos elementos a la fila con el metodo offer()
        cola2.offer(2);
        cola2.offer(5);
        cola2.offer(6);
        cola2.offer(8);
        cola2.offer(1);
        cola2.offer(4);
        cola2.offer(5);
        cola2.offer(9);
        
        //Se elimina el primer valor ingresado, en este caso el numero 2
        cola2.remove();
        
        //el metodo peek() accede el primer elemento de la cola
        while(cola2.peek() != null){

            System.out.print(cola2.poll()+",");
        }
    }
    
}
