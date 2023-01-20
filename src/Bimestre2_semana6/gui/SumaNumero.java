package Bimestre2_semana6.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumero {
    private JPanel panelPrincipal;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JButton btn_suma;
    private JLabel lbl_resultado;
    private JButton btn_restar;
    private JButton btn_dividir;
    private JButton btn_mult;

    public SumaNumero() {
        btn_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt( txt_n1.getText()) + Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(suma));
            }
        });
        btn_restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resta= Integer.parseInt( txt_n1.getText()) - Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText(String.valueOf(resta));
            }
        });
        btn_dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(txt_n1.getText());
                double n2 = Double.parseDouble(txt_n2.getText());
                if(n1>n2){
                    double div = n1 / n2;
                    lbl_resultado.setText(String.valueOf(div));
                }else {
                    String mensaje= "Invalido";
                    lbl_resultado.setText(String.valueOf(mensaje));
                }

            }
        });
        btn_mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1= Integer.parseInt(txt_n1.getText());
                int n2= Integer.parseInt(txt_n2.getText());
                int mult = n1 *n2;
                lbl_resultado.setText(String.valueOf(mult));
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio = new JFrame("SumaNumero");
        inicio.setContentPane(new SumaNumero().panelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
