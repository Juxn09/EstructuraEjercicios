public class MainLD {
    public static void main(String[] args) {
        ListaDoble<Integer> lista = new ListaDoble<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println("Primer elemento: " + lista.getFirst());
        System.out.println("Último elemento: " + lista.getLast());

        // Agregar en una posición específica
        lista.addIndex(1, 25);
        System.out.println("Elemento en índice 1: " + lista.get(1));

        // Comprobar si contiene un elemento
        System.out.println("¿Contiene 20? " + lista.contains(20));
        System.out.println("¿Contiene 40? " + lista.contains(40));

        // Obtener el índice de un elemento
        System.out.println("Índice de 20: " + lista.indexOf(20));

        // Remover un elemento
        System.out.println("Elemento eliminado: " + lista.remove());
        System.out.println("Nuevo primer elemento: " + lista.getFirst());

        // Limpiar la lista
        lista.clear(null);
        System.out.println("Lista vacía, cantidad de nodos: " + lista.cantidadNodos);
    }
}
