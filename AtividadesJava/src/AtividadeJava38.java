import java.util.Scanner;
public class AtividadeJava38 {

        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);

            System.out.print("Digite um número para ver a tabuada: ");
            int numero = leia.nextInt();

            System.out.println("Tabuada do " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            leia.close();
        }

}
