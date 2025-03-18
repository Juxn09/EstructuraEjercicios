import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacidadInicial = 2;
        Marcador[] marcadores = new Marcador[capacidadInicial];
        int cantidad = 0;

        while (true) {
            System.out.println("\n1. Agregar marcador");
            System.out.println("2. Mostrar marcadores");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (cantidad == marcadores.length) {
                        marcadores = redimensionar(marcadores, marcadores.length * 2);
                        System.out.println("Capacidad aumentada a " + marcadores.length);
                    }

                    System.out.print("Ingrese URL: ");
                    String url = scanner.nextLine();
                    System.out.print("Ingrese Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese Categoría: ");
                    String categoria = scanner.nextLine();

                        marcadores[cantidad] = new Marcador(url, titulo, categoria);
                    cantidad++;
                    System.out.println("Marcador agregado con éxito.");
                    break;

                case 2:
                    if (cantidad == 0) {
                        System.out.println("No hay marcadores almacenados.");
                    } else {
                        System.out.println("\nLista de marcadores:");
                        for (int i = 0; i < cantidad; i++) {
                            System.out.println((i + 1) + ". " + marcadores[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        }
    }

    public static Marcador[] redimensionar(Marcador[] redimension, int nuevaCapacidad) {
        Marcador[] nuevoArray = new Marcador[nuevaCapacidad];
        System.arraycopy(redimension, 0, nuevoArray, 0, redimension.length);
        return nuevoArray;
    }
}

