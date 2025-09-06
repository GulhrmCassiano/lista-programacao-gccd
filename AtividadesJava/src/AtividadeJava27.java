import java.util.Scanner;

public class AtividadeJava27 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva seu nome:");
        String nome = "";
        nome = leia.next();
        System.out.println("Escreva sua idade:");
        int idade = leia.nextInt();

        System.out.println("Ola "+ nome + ",Voce tem "+ idade + "anos");


    }
}
