import java.time.LocalDate;

public class vetores {
    public static void main(String[] args) {
        int n[] = {2, 4, 1, 5, 8, 3};

        System.out.println("tamanho >> " +n.length);

        for(int ii = 0; ii < n.length; ii++){
            System.out.println("indice: " +(ii + 1) +" = " +n[ii]);
        }


        //// faça mostrar os meses do ano e seu dias e mostra no ano bisexto fevereiro com 29 dias
            String meses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            
            int dim = 0;
            int ano = (LocalDate.now().getYear()) - dim;                
            
            for(int iii = 0; iii < meses.length; iii++){
                int anoBi = ( ((ano % 4 == 0) && !(ano/100 == 0 ))  ) ? 29 :  28;
                tot[1] = anoBi;

                System.out.println(ano +" -- mês de " +meses[iii] +" >> Tem: " + tot[iii] +" Dias");
            }

        ////     
    }
}