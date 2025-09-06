import java.util.Scanner;

public class AtividadeJava50 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] n1 = new int[3][3];
        int[][] n2 = new int[3][3];
        String local = "";

        for (int l =  0 ; l < n1.length; l++){
            for (int c = 0; c < n1.length;c++){
                System.out.println("Digite um numero");
                n1[l][c] = leia.nextInt();
                n2[l][c] = n1 [l][c] *n1 [l][c];
            }
        }
        System.out.println("Matriz original");
        System.out.println(n1);
        System.out.println("Matris quadrada");
        System.out.println(n2);

    }

}
