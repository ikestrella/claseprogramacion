package estructura_for;

import java.util.Scanner;

public class TrianguloAsterisco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas = sc.nextInt();

        for (int contador = 1; contador <= filas; contador++) {
            String fila_asteriscos = "";

            for (int conta = 1; conta <= contador; conta++) {
                fila_asteriscos = fila_asteriscos + "*";
            }
            System.out.println(fila_asteriscos);
        }
    }
}
