import java.util.Scanner;

public class AtividadeJava30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String opcao = "";
        System.out.println("Escolha uma das opição:");
        System.out.println("" +
                "Opção: A \n" +
                "Opção: B \n" +
                "Opção: C \n" +
                "Opção: D \n");
        opcao = leia.next();
        switch (opcao.toUpperCase()) {
            case "A":
                System.out.println("Quis conserta o mundo... mas no fumdo ,eu so queria um onde eu nunca tivesse perdido");
                break;
            case "B":
                System.out.println("Voces querem apanha com susano,ou sem susano ");
                break;
            case "C":
                System.out.println("Shicamaro naro tem maio cara de otario");
                break;
            case "D":
                System.out.println("VC e fraco le falta odio");
                break;
            default:
                System.out.println("Voce n escolheu uma opção valida");
        }


    }



}
