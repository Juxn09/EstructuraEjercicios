public class MainPila {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        System.out.println("¿La pila está vacía? " + pila.empty());

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Elemento en la cima: " + pila.peek());

        System.out.println("Elemento desapilado: " + pila.pop());
        System.out.println("Nuevo elemento en la cima: " + pila.peek());

        System.out.println("Posición del 10 en la pila: " + pila.search(10));
        System.out.println("Posición del 40 en la pila: " + pila.search(40));
    }
}
