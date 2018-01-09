package br.com.xti.logica;
import java.util.Arrays;

/*
** @author Alvaro Barros
*/

public class ArraySimples {
    
    public static void main(String[] args) {
        
// Declarações de Arrays simples
        String[] paises= {"Brasil","Russia","India","China"}; 
        System.out.println(paises[0]);
        System.out.println(paises.length);
        System.out.println(Arrays.toString(paises));


        int posicao =  Arrays.binarySearch(paises, "China");
        System.out.println(posicao); 
        
        //sort() === Ele ordena a lista
        Arrays.sort(paises ,0 , paises.length);
        System.out.println(Arrays.toString(paises));
        
        int posicao2 =  Arrays.binarySearch(paises, "China");
        System.out.println(posicao2); 
    }
}