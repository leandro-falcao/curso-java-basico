public class TiposPrimitivos {

    public static void main(String[] args) {

        float nota = 8.5f;
        float nota2 = 6.6f;

        float media = (nota + nota2) / 2;

        System.out.println(media);

        String txt1 = "https://timnews.com.br/?aff_click_id=YW1GWnFDR0p0ekYyZTFDZi8xMlZXdHdCTEdBQTFNdWJCYmtob0VaRE45YjdRTVJlamlxNlIxTVlXbkw4S0NGa3NwRzlrbUNoaWhtT0tKdE9VN2xYQ1E9PQ%3D%3D";
        String txt2 = "https://timnews.com.br/?aff_click_id=YW1GWnFDR0p0ekYyZTFDZi8xMlZXdHdCTEdBQTFNdWJCYmtob0VaRE45YjdRTVJlamlxNlIxTVlXbkw4S0NGa3NwRzlrbUNoaWhtT0tKdE9VN2xYQ1E9PQ%3D%3D";

        String comparador = (txt1.equals(txt2)) ? "texto igual" : "texto diferente";

        System.out.println(comparador);
    }
}
//