import java.util.*;

public class OperadoresAritmeticosComMath {
    public static void main(String[] args) {
        int num1 = 10;

        int num2 = 3;

        // media com trabalho de int e float
        float media = (num1 + num2) / 2;
        /// System.out.println(media);

        // incremento
        int valor = 5 + num1++;
        // incremento-pre incremento
        int valorPre = 5 + ++num1;
        // // System.out.println(valor);

        int numero = 10;
        int v = 4 + numero--;
        System.out.println(v);
        //

        // atribuição
        int atri = 5;
        atri *= 3;
        System.out.println("valor de atribuido é: " + atri);
        //

        // classe math

        int n = 25;
        int d = 3;
        float div = (float) n / d;
        float res = (float) Math.PI;
        System.out.println(res);

        float valorP = (float) Math.sqrt(37);

        System.out.println("valorP: " + valorP);

        // aleatorio

        int incremento = 1;
        double aleatorio = Math.random();

        int numeroAleatorio = (int) (4 + aleatorio * (100 - 0));

        System.out.println(numeroAleatorio);
    }
}
//