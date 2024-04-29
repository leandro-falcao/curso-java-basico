import java.util.*;

public class Condicionais {
    public static void main(String[] args) {

        Scanner inputTeclado = new Scanner(System.in);

        System.out.println("digite a nota1");
        float n1 = inputTeclado.nextFloat();

        System.out.println("digite a nota2");
        float n2 = inputTeclado.nextFloat();

        float media = (n1 + n2) / 2;

        System.out.println("a media é: " + media);

        if (media > 6) {
            System.out.println("Aprovado!!!!!!!!!!");
        }
        // 1= precisa de ler a idade e se for mais do 18 anos determina maioridade, se
        // manoe menoridade; vai ter entrada de dados no teclado
        // 2= saber ser um numero é para ou impar
        // 3= idade pra saber se o voto é obrigtório
        Scanner entradaDados = new Scanner(System.in);

        /// 1:
        System.out.println("digite a idade");
        int idade = entradaDados.nextInt();

        if (idade >= 18) {
            System.out.println("voce tem: " + idade);
            System.out.println("Maior de Idade");
        }

        else if (idade < 18) {
            System.out.println("voce tem: " + idade);
            System.out.println("Menor de Idade");
        }

        /// 2:
        System.out.println("digite um numero, pra sabermos sé é par ou impara");
        int parInpar = entradaDados.nextInt();

        if (parInpar % 2 == 0) {
            System.out.println("Numero Par");
        } else if (parInpar % 2 != 0) {
            System.out.println("Numero inpar");
        }

        /// 3:
        System.out.println("digite sua idade, para saber se é obrigado votar");
        int suaIdade = entradaDados.nextInt();

        if (suaIdade >= 18 && suaIdade <= 70) {
            System.out.println("Voto Obrigatorio!!!");
        }

        else if (suaIdade < 18 && suaIdade >= 16 || suaIdade > 70) {
            System.out.println("Voto Facultativo!!");
        }

        else if (suaIdade < 16) {
            System.out.println("Voto Proibido!");
        }
    }
}
//