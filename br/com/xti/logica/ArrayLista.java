package br.com.xti.logica;
import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args) {
    
        ArrayList<String> cores = new ArrayList<String>();
        // add elemento
        cores.add("Branco");
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add(0, "Vermelho");

        System.out.println(cores.toString());
        
        //verifica o tamanho do lista
        System.out.println("Tamanho: " + cores.size());

        //Pega o elemento da lista 
        System.out.println("Elemento do indice 2: " + cores.get(2));

        // pesquisa o indice de alguma cor
        System.out.println("Qual o indice da cor branca: " + cores.indexOf("Branco"));
        
        // remover elemento
        cores.remove("Branco");
        
        //verifica se existe um elemento
        System.out.println("Tem Amarelo? " + cores.contains("Amarelo"));
    }
}