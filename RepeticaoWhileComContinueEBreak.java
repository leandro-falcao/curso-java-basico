public class RepeticaoWhileComContinueEBreak {   
    public static void main(String[] args) {
        int count = 0;

        while(count<15){
            count++;
            
            if (count == 6 || count == 8) {
                continue;
            }
            if (count == 11) {
                break;
            }
            
            System.out.println("contador vale: " +(count + 0));
        }
    }
}