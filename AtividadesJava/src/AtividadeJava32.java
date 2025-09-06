import java.util.Scanner;

public class AtividadeJava32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva uma senha de 4 digitus numericos de 0-9");
        double senha = leia.nextDouble();
        System.out.println("Sua senha foi salva");

        Scanner leia2 = new Scanner(System.in);
        System.out.println("Escreva sua senha para pode entra");
        double n1 = leia2.nextDouble();

        if (senha == n1){
            System.out.println("Bem vindo de volta");
        }else if (senha != n1){
            System.out.println("Sua senha esta incoreta");
        }

    }

}
