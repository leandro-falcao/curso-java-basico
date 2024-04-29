import java.util.Scanner;

public class RepeticaoDo {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println("cambalhotas: " + (count + 1));
            count++;
        } while (count < 4);

        int numero;
        int somador = 0;
        String resposta = new String();

        Scanner entradaDados = new Scanner(System.in);
        do {
            System.out.print("digite um numero: ");
            numero = entradaDados.nextInt();

            somador += numero;

            System.out.print("quer continuar? S/N ");
            resposta = entradaDados.next();
        } while (resposta.equals("S") || resposta.equals("s"));

        System.out.println(" a soma de todos os valores é: " + somador);

    }
}
