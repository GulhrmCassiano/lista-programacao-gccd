import java.util.Scanner;

public class AtividadeJava13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor para A e B :");
        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();
        int d = leia.nextInt();

        int r = 0;
        r = (a + b) * c - d;

        System.out.println("r="+ r);

    }
}
