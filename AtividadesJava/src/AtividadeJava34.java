import java.util.Scanner;

public class AtividadeJava34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int i = 0;
        while (i <= numero) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        scanner.close();
    }

}
