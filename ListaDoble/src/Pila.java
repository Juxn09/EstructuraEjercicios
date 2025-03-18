import java.util.Objects;

public class Pila<T> extends ListaDoble<T> {

    public Pila(){
        super();
    }

    // Empty
    public boolean empty(){
        return cantidadNodos == 0;
    }
    public T peek(){
        return head.getSig().getDato();
    }
    public T pop(){
        return super.remove();
    }

    public T push(T dato) {
        super.addFirst(dato);
        return dato;
    }

    public int search(T dato){
        Nodo<T> nodo = head;
        for (int i = 0; i <cantidadNodos ; i++) {
            nodo= nodo.getSig();
            if (Objects.equals(nodo.getDato(),dato)){
                return i+1;
            }
        }
        return -1;
    }
}
