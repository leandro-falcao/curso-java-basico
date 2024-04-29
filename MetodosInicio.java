public class MetodosInicio {

    static void soma(int a, int b) {
        int somador = a + b;
        System.out.println("soma de a + b é: " + somador);
    }

    static int funSoma(int num1, int num2) {
        int somador = num1 + num2;
        return somador;
    }

    public static void main(String[] args) {
        System.out.println("inicio do main");

        int varFunSoma = funSoma(3, 8);
        System.out.println("valor da fun soma: " + varFunSoma);

        soma(5, 2);
    }
}
//