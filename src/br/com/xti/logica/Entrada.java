package br.com.xti.logica;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Entrada{
    public static void main(String[] args){

        String nome = JOptionPane.showInputDialog("Qual seu nome?");
            JOptionPane.showMessageDialog(null,"Olá " + nome);

    }
}