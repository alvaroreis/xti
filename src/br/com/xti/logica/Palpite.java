package br.com.xti.logica;
import java.util.Random;

import javax.swing.JOptionPane;

public class Palpite {
    public static void main(String[] args) {
        
        Integer[] dado = {1, 2, 3, 4, 5, 6};
        String n = JOptionPane.showInputDialog("Informe seu palpite: ");
        Integer nPalpite = Integer.parseInt(n);
        Random r = new Random();
        
        Integer indicePalpite = r.nextInt(dado.length);
        Integer nDado = dado[indicePalpite];

        if (nDado.equals(nPalpite)){
            //JOptionPane.showMessageDialog(null, palpite);
            JOptionPane.showMessageDialog(null,"Palpite: "+nPalpite+ "\nDado:"+nDado +"\nVoce acertou!");
        } else {
            //JOptionPane.showMessageDialog(null, palpite);
            JOptionPane.showMessageDialog(null,"Palpite: "+nPalpite+ "\nDado:"+nDado +"\nVoce errou!");
        }

    }
}