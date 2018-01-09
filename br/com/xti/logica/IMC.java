package br.com.xti.logica;
import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {
        
        String peso = JOptionPane.showInputDialog("Digite seu peso?");
        String altura = JOptionPane.showInputDialog("Digite sua altura?");
        
        double pesoEmkl = Double.parseDouble(peso);
        double alturaEmMt = Double.parseDouble(altura) ;
        
        double imc = pesoEmkl / (alturaEmMt*alturaEmMt);
        
        String msg = (imc >= 20 && imc <= 25 ) ? "Peso ideal." : "Acima do Peso."; 
        System.out.println("IMC: " + imc);
        System.out.println(msg);
        JOptionPane.showMessageDialog(null, "IMC: " + imc + "\n" + msg);

    }
}