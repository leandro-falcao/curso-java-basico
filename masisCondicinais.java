import java.util.*;

public class masisCondicinais {
    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);


        System.out.println("digite de 1 a 8, quantiadde de pernas");
        int qtdPernas = entradaDados.nextInt();
        // int pernas = int;

        String tipo = new String();

        switch (qtdPernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;    
            case 4:
                tipo = "Quadrupede";
                break;       
            case 6:
                tipo = "Araquinide 6 patas";
                break;       
            case 8:
                tipo = "Araquinide 8 patas";    
                break;       

            default:
                tipo = "Anormal";
                break;
        }
            
            System.out.println("é um: " +tipo);
    }



}
