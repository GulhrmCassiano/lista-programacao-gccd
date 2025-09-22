package atividade01;

public class Lampada {
    private String cor ;
    private boolean Estado  ;
    private int brilho ;

    public Lampada() {
        this.brilho = 0;
        this.cor = "Branco";
        this.Estado = false;
    }
    public void lampada(boolean ligada, int brilho, String cor) {
        this.Estado = ligada;
        this.brilho = 50; // usa o setter para garantir validação
        this.cor = cor;
    }
    public void ligardesligar (boolean Estado) {
        if (Estado = true){
            System.out.println("A lampa esta ligada");
        }else if(Estado = false){
            System.out.println("A lampa esta desligada");
        }
    }




    public void aumentarBrilho(int valor) {
        setBrilho(this.brilho + valor);
    }

    public void reduzirBrilho(int valor) {
        setBrilho(this.brilho - valor);
    }

    public void mudarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("Vc mudou a cor para: " + cor);
    }


    private void setBrilho(int brilho) {
        if (brilho < 0) {
            this.brilho = 0;
        } else if (brilho > 100) {
            this.brilho = 100;
        } else {
            this.brilho = brilho;
        }
        System.out.println("Brilho atual: " + this.brilho + "%");
    }

    public void mostrarDados() {
        System.out.println("Estado: " +Estado );
        System.out.println("Brilho: " + brilho + "%");
        System.out.println("Cor: " + cor);
        System.out.println("---------------------------");
    }


}
