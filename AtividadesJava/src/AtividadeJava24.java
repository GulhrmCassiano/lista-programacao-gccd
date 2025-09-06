import java.util.Scanner;

public class AtividadeJava24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Ensira um numero:");
        double n1 = leia.nextInt();
        double quadrado = 0;

        quadrado = n1 * n1;
        System.out.println("O quadrado do seu numero e: " + quadrado);


        if (quadrado >= 100){
            System.out.println("Seu numero e VALIDO");
        }else if(quadrado <= 100){
            System.out.println("Seu numero e INVALIDO");
        }



    }
}
