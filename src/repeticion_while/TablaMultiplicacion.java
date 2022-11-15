package repeticion_while;


import javax.swing.JOptionPane; // Con el signo "*" se llevan todos los documentos de la biblioteca al archivo

/**
 * Generar la tabla de multiplicar hasta el 10 de un numero ingresado por teclado
 */
public class TablaMultiplicacion {
    public static void main(String[] args) {
        //System.out.println("PROGRAMA PARA GENERAR LA TABLA DE MULTIPLICAR");
        JOptionPane.showMessageDialog(null,"PROGRAMA PARA GENERAR LA TABLA DE MULTIPLICAR");
        //System.out.println("Ingrese un numero: ");
        String num = JOptionPane.showInputDialog("Ingrese un numero: ");
        int contador= 1;
        String acumulador= "";
        while (contador <= 10 ){
            int mult= Integer.parseInt(num) * contador;//se convierte valor tipo string a int
            String salida= num+" x " + String.valueOf(contador) + " = "+ String.valueOf(mult)+ "\n";
            acumulador= acumulador + salida;
            contador= contador + 1;
        }
        JOptionPane.showMessageDialog(null, acumulador);
    }
}
