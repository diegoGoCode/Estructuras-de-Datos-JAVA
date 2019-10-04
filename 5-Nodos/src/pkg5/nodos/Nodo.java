package pkg5.nodos;

/**
 *
 * @author diego.diaz
 */
public class Nodo {
    
    private Nodo siguiente;
    private String contiene;

    public Nodo(){
        setSiguiente(null);
        setContiene(null);
    }
    
    public Nodo(String c){
        setSiguiente(null);
        setContiene(c);
    }
    
    public Nodo(String c, Nodo n){
        setSiguiente(n);
        setContiene(c);
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getContiene() {
        return contiene;
    }

    public void setContiene(String contiene) {
        this.contiene = contiene;
    }
    
    
}
