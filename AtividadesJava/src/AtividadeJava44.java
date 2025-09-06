import java.util.Scanner;

public class AtividadeJava44 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] n1 = new int[5];

        System.out.println("Digite as nots da turma");
        for (int i = 0; i < n1.length; i++){
            n1[i] = leia.nextInt();
        }
        int media = 0;
        for (int i = 0; i < n1.length; i++){
            media += n1[i];
        }
        media = media / n1.length;
        System.out.println("A media da turma e:"+ media);

    }
}
