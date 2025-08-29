import java.util.Scanner;
public class AtividadeSala15 {

    public static double soma (double x, double y) {return x = y;}
    public static double subtrair (double x, double y) {return x - y;}
    public static double multiplicacao (double x, double y) {return x * y;}
    public  static double divisao (double x, double y) {return x / y}


    public  static void printResutado(char operador, double x,double y,double resultado){
        System.out.println(x + " " + operador + y + " = " + resultado);
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("calculadora: \n Escolha uma das opções abaixo");
            System.out.println(
                    "1-Soma \n +" +
                            "2- Subtração \n " +
                            "3- multiplicação \n" +
                            "4- Divisão \n" +
                            "5- Potenciação \n" +
                            "0-Sair \n" +

            );
            opcao = leia.nextInt();
            double x = 0;
            double y = 0;
            switch (opcao) {
                case 1;
                    System.out.println("soma: ");
                    System.out.println("Digite valor para X: ");
                    x = leia.nextDouble();
                    System.out.println("digite valor para Y");
                    y = leia.nextDouble();
                    printResutado('+', x, y, soma(x, y));

                    break;
                case 2:
                    System.out.println("soma: ");
                    System.out.println("Digite valor para X: ");
                    x = leia.nextDouble();
                    System.out.println("digite valor para Y");
                    y = leia.nextDouble();
                    printResutado('+', x, y, soma(x, y));

                    break;
                case 3:
                    System.out.println("soma: ");
                    System.out.println("Digite valor para X: ");
                    x = leia.nextDouble();
                    System.out.println("digite valor para Y");
                    y = leia.nextDouble();
                    printResutado('+', x, y, soma(x, y));

                    break;
                case 4:
                    System.out.println("soma: ");
                    System.out.println("Digite valor para X: ");
                    x = leia.nextDouble();
                    System.out.println("digite valor para Y");
                    y = leia.nextDouble();
                    printResutado('+', x, y, soma(x, y));

                    break;
                case 5:
                    System.out.println("soma: ");
                    System.out.println("Digite valor para X: ");
                    x = leia.nextDouble();
                    System.out.println("digite valor para Y");
                    y = leia.nextDouble();
                    printResutado('+', x, y, soma(x, y));

                    break;
                case 0:
                    System.out.println("Voce escoheu sair.\n ");
                    break;




            } while (opcao != 0);

        }
    }