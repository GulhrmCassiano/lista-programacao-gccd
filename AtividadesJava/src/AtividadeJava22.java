import java.util.Scanner;

public class AtividadeJava22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva um numero:");
        double z = leia.nextInt();


        if (z >= 1) {
            System.out.println("Seu numero e positivo");
        }else if (z <= -1){
            System.out.println("Seu numero e negativo");
        }else if (z == 0) {
            System.out.println("Seu numero e ingual a 0");
        }
    }
}
