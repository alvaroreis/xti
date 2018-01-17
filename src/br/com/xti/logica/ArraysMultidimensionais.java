package br.com.xti.logica;
import java.util.Arrays;
import java.util.Random;

/*
** @author Alvaro Barros
*/

public class ArraysMultidimensionais {
    
    public static void main(String[] args) {

    // Declarações de Arrays Multidimensionais
       /* 
       String[] uma  = {"Ricardo", "Sandra"};
        
        String[][] duas = {
            {"Ricardo", "M", "DF"},
            {"Sandra", "F", "PA"}
        };
        
        System.out.println(duas[0][0]);
        */
        
        String[] faces = {"A","1","2","3","4","5","6","7","8","9","10","Valete","Dama", "Rei"};
        String[] nipes = {"Espadas","Paus","Copas","Ouros",};

        Random r = new Random();

        int indiceFace = r.nextInt(faces.length);
        String face = faces[indiceFace];

        int indiceNipe = r.nextInt(nipes.length);
        String nipe = nipes[indiceNipe];

        String carta = face + " " + nipe;
        System.out.println(carta);

    }
}