import java.util.Scanner;

public class AtividadeJava46 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int [][] n1 = new int[2][2];

        System.out.println("Escreva os numeros:");
        for (int g = 0; g < n1.length ; g++){
            for (int c = 0; c < n1.length; c++){
                n1[g][c] = leia.nextInt();
            }

        }
        int resultado = 0;
        for (int g = 0;g < n1.length; g ++ ){
            for (int c = 0; c < n1.length; c ++){
                resultado += n1[g][c];

            }

        }
        System.out.println(resultado);

    }
}