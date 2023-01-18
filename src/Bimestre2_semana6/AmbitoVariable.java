package Bimestre2_semana6;

public class AmbitoVariable {
    static int numero=10; // creacion de variable global

    //metodos sobrecargados
    public static void cambiar_valor(){
        numero = numero + 15;
    }
    public void cambiar_valor(int numero){
        //this. para distinguir la variable local y global con el mismo nombre
        this.numero = this.numero + 50;
    }
    public static void main(String[] args) {
        cambiar_valor();
        System.out.println("El nuevo valor de numero es = " + numero);
        AmbitoVariable mivariable = new AmbitoVariable();
        mivariable.cambiar_valor(100);
        System.out.println("El nuevo valor de numero es = " + numero);
        int indice = 0;
        for (indice = 0;indice < 5; indice++) {
            System.out.println("repericion " + indice);
        }
        System.out.println("Valor final de indice: " + indice);
    }
}
