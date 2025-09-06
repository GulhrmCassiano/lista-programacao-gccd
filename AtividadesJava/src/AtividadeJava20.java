import java.util.Scanner;

public class AtividadeJava20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        boolean temCNH = false;
        int idade = 0;

        System.out.println("Digite a idade:");
        idade = leia.nextInt();
        if (idade < 18) {
            temCNH = false;
        }
        System.out.println("Possui CNH: ('S' ou 'N')");//'0'
        char input = leia.next().toLowerCase().charAt(0);
        if (input == 's') {
            temCNH = true;
        }
        leia.close();



    }
}