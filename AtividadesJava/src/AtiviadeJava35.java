import java.util.Scanner;

public class AtiviadeJava35 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível

        System.out.println("Digite uma sequência de números inteiros (digite -1 para encerrar):");

        while (true) {
            numero = leia.nextInt();

            if (numero == -1) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }
        }

        if (maior != Integer.MIN_VALUE) {
            System.out.println("O maior número digitado foi: " + maior);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }


    }

}
