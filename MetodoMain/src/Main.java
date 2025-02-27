public class Main {

    // <> Operador diamante
    public static void main(String[] args) {
        Caja<String> c = new Caja<>("""
                Hola Ediso.
                """);
        System.out.println(c.getContenido());
        Caja<Double> c2 = new Caja<>(20.00);
        System.out.println(c2.getContenido());
    }
}
