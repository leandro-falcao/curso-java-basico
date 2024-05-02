public class CompararString {
    public static void main(String[] args) {

        String nome1 = "Leandro";
        String nome2 = "Leandro";
        String nome3 = new String("Leandro");

        String resultado = (nome1.equals(nome2)) ? "nome igual" : "Nome diferente";

        System.out.println(resultado);

    }
}
///
