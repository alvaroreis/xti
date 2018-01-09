package br.com.xti.logica;
public class Fibonacci {
    public static void main(String[] args) {
        Integer anterior = 0;
        Integer proximo = 1;
        System.out.println(anterior); 
        
        while( proximo < 50){
            System.out.println(proximo); 
            proximo = proximo + anterior;
            anterior = proximo - anterior;
        }
    }
}