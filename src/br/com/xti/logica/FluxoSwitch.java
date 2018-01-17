package br.com.xti.logica;
public class FluxoSwitch {
    public static void main(String[] args) {
        
     /*   char sexo = 'o';
        switch(sexo) {
            case 'M':
            System.out.println("Macho");
            break;
            case 'F': 
            System.out.println("Femea");
            break;
            default: System.out.println("Outro ");
        }
    */

        String tecnologia = "postegresql";

        switch(tecnologia) {
            case "C++":;
            case "Cobol":; 
            case "Java":
                System.out.println("Linguagem de Programacao");
                break;
            case "oracle":
            case "mysqlServer": 
            case "postegresql":
                System.out.println("Banco de Dados");
                break;
            default: System.out.println("Tecnologia desconhecida");
        }
    }
}