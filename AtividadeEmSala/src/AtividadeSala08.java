import java.util.Scanner;

public class AtividadeSala08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome = "";
        int idade = 0;

        System.out.println("Digite o seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite a sua idade");
        idade = leia.nextInt();

        System.out.println("Seu nome e "+ nome);
        System.out.println("E tem "+ idade + " anos de idade.");
    }
}
