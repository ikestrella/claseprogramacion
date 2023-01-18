package Bimestre2_Semana5;

import java.util.Locale;

public class ClaseConMetodoSinRetornoDeValor {
    public static void main(String[] args) {
        //crear una variable a partir de nuestra clase
        //ClaseConMetodoSinRetornoDeValor llamada = new ClaseConMetodoSinRetornoDeValor();
        //llamada.saludar();
        saludar_con_nombre("Iam",5);
    }
    public static void saludar(){
        System.out.println("BIENVENIDO A LA CREACION DE METODOS");
        System.out.println("Metodo creado en java");
    }

    //sobre carga de metodos:
    //se diferencia por el tipo de valor que se pide en el metodo
    public static void saludar_con_nombre(String nombre){
        System.out.println("BIENVENID@ "+ nombre.toUpperCase(Locale.ROOT) +" A LA CREACION DE METODOS");
        System.out.println("Metodo creado en java");
    }
    public static void saludar_con_nombre(String nombre, String apellido){
        System.out.println("BIENVENID@ "+ nombre.toUpperCase(Locale.ROOT) +" A LA CREACION DE METODOS");
        System.out.println("Metodo creado en java");
    }
    public static void saludar_con_nombre(String nombre, int edad){
        System.out.println("BIENVENID@ "+ nombre.toUpperCase(Locale.ROOT) +" A LA CREACION DE METODOS");
        System.out.println("Metodo creado en java");
        System.out.println("Su edad es: "+ edad);
    }
}
