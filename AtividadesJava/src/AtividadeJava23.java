import java.util.Scanner;

public class AtividadeJava23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Ensira um numero:");
        int k = leia.nextInt();

        if (k % 2 == 0){
            System.out.println("Seu numero e par");
        } else if(k % 1 == 0) {
            System.out.println("Seu numero e impa");
            
        }


    }
}
