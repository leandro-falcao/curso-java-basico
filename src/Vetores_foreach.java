import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetores_foreach {
    public static void main(String[] args) {
        int vazio[] = new int[3];

        int numeros[] = { 2, 5, 4, 8, 1, 3, 7, 9, 6 };
        double numeros2[] = { 1.12, 34.3, 14.67, 4, 2, 38.43, -5.1 };

        /// colocar vetores em ordem em java com Arrays.sort --- que pertence ao import
        /// do java.utils.
        Arrays.sort(numeros2);
        ///
        /// preencendeo vetores
        Arrays.fill(vazio, 1);

        ///
        for (int iii : vazio) {
            System.out.print(iii + " ");
        }

        // // // for(int iii : vazio){
        // // // System.out.print(iii +" ");
        // // // }

        /// fazendo uma busca binaria
        System.out.println("");
        int posicao = Arrays.binarySearch(numeros, 6);
        System.out.println(posicao);

        ///
    }
}
//
