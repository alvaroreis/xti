package br.com.xti.logica;
import java.util.ArrayList;

public class RepeticaoForeach {
    public static void main(String[] args) {
        
        
        int[] pares = {2, 4, 6, 8};
        
        // for normal
        /*
        for(int i=0; i < pares.length; i++){
            int par= pares[i];
            System.out.println(par);
        }

        //foreach
        
        for( int par : pares ){
            System.out.println(par);
        }
        */

        ArrayList<Integer> list = new ArrayList<>();
        for(Integer i=0; i<10; i++){
            list.add(i);
        }
        for(Integer numero : list ){
            System.out.println(numero);
        }
    }
}