package atividade04;

public class Executavel {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Zw");
        Vendedo auxiliar = new Vendedo("Lucas");
        Gerente gerente = new Gerente("Guilherme");
        Folha folha = new Folha();
        auxiliar.setComissao(1.2);
        gerente.setComissao(1200);
        folha.pagar(f1);
        folha.pagar(auxiliar);
        folha.pagar(gerente);
    }
}
