package br.com.xti.logica;
public class Rotulos {
    public static void main(String[] args) {
        boolean[][] matrix= 
        {
            {false, true, false, false, false},
            {false, false, false, false, false}
        };

        // parando for's atraves de rotulos
        busca:  //todo rotulo e declarado com o nome seguido de : . Ex.:  nome_rotulo:
        for(int a=0; a < matrix.length; a++ ){
            System.out.print("A ");
            for(int b=0; b < matrix[a].length; b++ ){
                if(matrix[a][b]){
                    System.out.print("TRUE ");
                    break busca; // para o rotulo busca
                }
                System.out.print("B ");
            }
        }
    }
}