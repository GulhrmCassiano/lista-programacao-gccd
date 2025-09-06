import java.util.Scanner;

public class AtividadeJava37 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva um numero:");
        int numero = leia.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
