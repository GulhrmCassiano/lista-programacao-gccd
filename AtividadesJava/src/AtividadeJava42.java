import java.util.Scanner;
public class AtividadeJava42 {


        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            int[] numeros = new int[10];


            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
                numeros[i] = leia.nextInt();
            }


            System.out.println("Números pares digitados:");
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0) {
                    System.out.println(numeros[i]);
                }
            }



        }
}
