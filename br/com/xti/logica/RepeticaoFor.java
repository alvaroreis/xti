package br.com.xti.logica;
public class RepeticaoFor {
    public static void main(String[] args) {
       
       /* String texto = "";

        for(int i=10; i>3; i--){
            texto += i +", ";
        }
        System.out.println(texto );
    */
        int tamanho = 30;
        
        for( int x=0; x < tamanho; x++){
            for(int i = 0; i < tamanho; i++) {
                System.out.print("* ");
            }
            System.out.println();
       }
    }
}