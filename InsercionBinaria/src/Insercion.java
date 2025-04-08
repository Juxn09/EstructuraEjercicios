class Nodo <T extends Comparable<T>>{
    T dato;
    Nodo <T> izquierdo;
    Nodo <T>  derecho;

    public Nodo(T dato){
        this.dato=dato;
        this.izquierdo= null;
        this.derecho= null;
    }
}
public class  Insercion<T extends Comparable<T>> {

    Nodo<T> raiz;

    public Insercion(Nodo<T> raiz) {
        this.raiz = raiz;
    }

    public Insercion() {

    }

    public void insertar(T dato){
    Nodo<T> nuevo= new Nodo<>(dato);
    if(raiz== null){
        raiz=nuevo;
        return;
    }
    Nodo<T> a = raiz;
    Nodo<T> p= null;
    while (a!= null){
        p=a;
        if(dato.compareTo(a.dato)<0){
            a= a.izquierdo;

        }else{
            a=a.derecho;
        }
    }
    if(dato.compareTo(p.dato)<0){
        p.izquierdo=nuevo;
    }else{
        p.derecho=nuevo;
    }

    }

    public void inOrden(Nodo<T> nodo){
        if(nodo!=null){
            inOrden(nodo.izquierdo);
            System.out.println(nodo.dato+" ");
            inOrden(nodo.derecho);
        }
    }

    public void imprimirInOrden(){
        inOrden(raiz);
        System.out.println();
    }

//    public Nodo<T> busquedaNodo(T dato){
//
//    }

    public static void main(String[] args) {
        Insercion<Integer> arbol = new Insercion<>();


        arbol.insertar(100);
        arbol.insertar(80);
        arbol.insertar(20);
        arbol.insertar(150);
        arbol.insertar(110);
        arbol.insertar(30);
        arbol.insertar(180);


        System.out.println("Recorrido en orden del arbol: ");
        arbol.imprimirInOrden();
    }
}



