import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args) {
        Scanner cosola = new Scanner(System.in);
        int num;
        int contador =0;
        System.out.print("***Sumatoria***");
        System.out.println();

        System.out.print("Por favor digite hasta que numero desea sumar: ");
        num= cosola.nextInt();
        long inicia = System.nanoTime();
        for(int i=1 ; i<=num; i++){
            contador= contador+i;
        }
        long finaliza= System.nanoTime();
        long diferencia = finaliza-inicia;
        System.out.println("La suma de los numeros es: "+ contador);
        System.out.println("Tiempo: "+ diferencia);
    }
}
