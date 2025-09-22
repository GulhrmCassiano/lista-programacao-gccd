package atividade01;
import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Lampada lampada = new Lampada();
        lampada.mostrarDados();


        lampada.aumentarBrilho(80);
        lampada.reduzirBrilho(0);
        lampada.mudarCor("green");
        lampada.ligardesligar(true);



    }

}
