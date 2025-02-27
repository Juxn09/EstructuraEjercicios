public class Main {

    // <> Operador diamante
    public static void main(String[] args) {
        Caja<String> c = new Caja<>("""
                Hola Ediso.
                """);
        System.out.println(c.getContenido());
        Caja<Double> c2 = new Caja<>(20.00);
        System.out.println(c2.getContenido());

        Caja<Perro> c3 = new Caja<>(new Perro("Carlos"));
        System.out.println(c3.getContenido());
    }
}
