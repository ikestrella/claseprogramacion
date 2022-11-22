package estructura_for;

import java.util.Scanner;

public class TablaAsterisco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int fila = sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columna= sc.nextInt();


        String fila_asteriscos = "";

        for (int cont = 1; cont <= columna; cont++){ //controlamos numero de columnas
            fila_asteriscos= fila_asteriscos + "*";
        }


        for(int contador = 1; contador <= fila; contador++){ //controlamos numero de filas
            //String fila_asteriscos = "";
            //for (int cont = 1; cont <= columna; cont++){ //controlamos numero de columnas
                //fila_asteriscos= fila_asteriscos + "*";
            //}
            System.out.println(fila_asteriscos);
        }
    }
}
