import java.util.Scanner;

public class AtividadeSala07 {

    public static void main(String[] args) {
        /*Exemplo com o SE(IF)
        int a = 5, b = -5, x = 30, y = 9;
        if (a < 0 && b < 0 && x < 0 && y < 0){
            System.out.println("Todos os valores são negativos.");
        } else if(a < 0 || b < 0 || x < 0 || y < 0){
            System.out.println("Pelo menos um valor é negativo.");
        } else {
            System.out.println("Todos os valores são positivos");
        }
        /*Exemplo com o Escolha (Switch/Case)
        char opcao = 'S';
        switch (opcao){
            case 'S':
                System.out.println("A opção 'S' foi escolhida");
                break;
            case 'N':
                System.out.println("A opção 'S' foi escolhida");
                break;
            default:
                System.out.println("A opção escolhida é inválida");
                break; /*
        }

        // LEITURA DE DADOS
        /*
        Bliblioteca Java.util.Scanner será utilizada para realizar a leitura de dados
        1- Faça um script que receba a idade de um usuário e que retorne se ele é maior de idade ou não.
        2- Faça um script que receba a inicial do sexo do usuário e que retorne o sexo completo utilizando a estrutra "switch".
         */


        Scanner leia = new Scanner(System.in);
        System.out.println("enforme sua idade verdadeira:");
         int idade = leia.nextInt();
         if(idade >= 18) System.out.println("Voce e de maior!");


        System.out.println("Digite o sexo: (m,f)");
        char opcao = leia.next().charAt(0);
        switch (opcao){
            case'm':
                System.out.println("masculino");
                break;
            case 'f':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção invalida!" );
                break;
        }







    }
}
