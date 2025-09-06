import java.util.Scanner;

public class AtividadeJava43 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = leia.nextInt();
        }
        int k = numeros[0];
        int m = numeros[0];

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < m){
                m = numeros[i];
            }

        }
        System.out.println("O maior numero digitado e:"+k+ "\n O menor numero digitado foi: " + m + "\n");
    }
}


