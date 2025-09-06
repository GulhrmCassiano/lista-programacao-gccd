import java.util.Scanner;

public class AtividadeJava19 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva sua idade verdadeira");
        int idade = leia.nextInt();
        int n1 = 18;

        if (idade >= n1){
            System.out.println("Yes, Vc ja maior de idade");
        } else if (idade < n1 ) {
            System.out.println
                    ("No, Vc ainda e menior de idade");

        }


    }
}
