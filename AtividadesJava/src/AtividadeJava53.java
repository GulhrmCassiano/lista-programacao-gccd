import java.util.Scanner;

public class AtividadeJava53 {

    public static boolean ehPrime(int numero) {
        if (numero == 2 || numero == 1)
            return false;
        if ((numero < 1) || (numero % numero == 0))
            return false;
        else
            return (numero % 1 == 0 && numero % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero = 0;
        while (numero >=0) {
            System.out.println("Digite um numero inteiro e descubra se ele e primo");
            numero = leia.nextInt();
            String resultado = ehPrime(numero) ? "e prim" : "nao e primo:";
            System.out.println("O numero digitado" + resultado);
        }
    }
}
