package exemplo01;
import java.util.Scanner;

public class Eemplo01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Guilherme" ;
        pessoa.idade = 17;

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);


    }
}
