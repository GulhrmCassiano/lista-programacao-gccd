import java.util.Scanner;

public class AtividadeJava48 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int maiorValor = 0, linha = 0, coluna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int aleatorio = (int) Math.round(Math.random() * 10);
                matriz[i][j] = aleatorio;
                if (maiorValor < matriz[i][j]) {
                    maiorValor = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("O maior valor encontrado foi:" + maiorValor);
        System.out.println("localizado na posição: \n " +
                "Linha: ["+linha+"], coluna:["+coluna+"]");
    }

}