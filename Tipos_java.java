import java.util.Scanner;

public class Tipos_java {
        public static void main(String[] args) {
            
              
            Scanner entradaDados = new Scanner(System.in);
              
                System.out.println("digite nomee");
                String nome = entradaDados.nextLine();
                
                System.out.println("digite a primeira nota");
                float nota1 = entradaDados.nextFloat();
               
                System.out.println("digite a segunda nota");
                float nota2 = entradaDados.nextFloat();
        
                float media = (nota1 + nota2) /2;
             
            {    
                if (media >= 5) {
                    System.out.println(" Aprovado.");
                }
                else if (media <= 5 && media >= 3.5) {
                    System.out.println(" Dependencia.");
                }
                else if (media <= 5 && media <= 3.5) {
                    System.out.println("Reprovado");
                }
                
                System.out.printf("%S sua média foi: %.2f \n sendo primeira nota foi %.2f \n a segunda nota foi %.2f \n ", nome, media, nota1, nota2);  
       
            }
       
        }
    
}
