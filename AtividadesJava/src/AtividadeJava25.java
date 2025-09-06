import java.util.Scanner;

public class AtividadeJava25 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva seu salario real:");
        double salario = leia.nextInt();

        if(salario >= 3000){
            System.out.println("Voce deve paga inposto");
        }else if(salario <= 3000){
            System.out.println("Voce e isento de paga inposto");
        }
    }
}
