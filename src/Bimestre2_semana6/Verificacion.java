package Bimestre2_semana6;

/**
 * Programa para verificar a traves de metodos si un numero es primo o no
 * y si es para o impar
 */
public class Verificacion {
    public boolean verificar_primo(int num_a_verificar){
        int verif=0;
        for (int indice = 1; indice <= num_a_verificar; indice++) {
            if (num_a_verificar%indice == 0) {
                verif++;
            }
        }
        if (verif==2){
            return true;
        }else{
            return false;
        }
    }
    public boolean verificar_par(int num){
        if (num%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Verificacion mivariable = new Verificacion();
        if (mivariable.verificar_primo(5)==true){
            System.out.println("Si es primo");
        }else{
            System.out.println("No es primo");
        }
        Verificacion verif= new Verificacion();
        if (verif.verificar_par(5)==true){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
