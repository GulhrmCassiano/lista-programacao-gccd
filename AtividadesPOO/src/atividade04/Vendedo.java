package atividade04;

public class Vendedo extends Funcionario {
    private double comissao;

    public Vendedo(String nome,double comissao){
        super(nome,1200.0);
        this.comissao = comissao;
    }
    public void setComissao(double valor){this.comissao = valor;}
    public double getComissao(){
        return this.comissao;
    }

    @Override
    public double calcularPagamento() {
        return this.getSalarioBase() + this.comissao;
    }
}
