import java.util.Scanner;

public class AtividadeJava14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor para A e B :");
        int a = leia.nextInt();
        int b = leia.nextInt();

        System.out.println("soma:"+ a + "+" + b + "= " +(a+b));
        System.out.println("subtração:"+ a + "-" + b + "= " +(a-b));
        System.out.println("multiplicação:"+ a + "*" + b + "= " +(a*b));
        System.out.println("Divisão:"+ a + "/" + b + "= " +(a/b));
        System.out.println("Modulo:"+ a + "%" + b + "= " +(a%b));


    }
}
