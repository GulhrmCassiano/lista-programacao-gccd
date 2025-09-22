package atividade04;


public class Folha {
    public void pagar(Funcionario f) {
        System.out.println("Pagando com sucesso: " + f.getNome() +
                " Salario: " + f.calcularPagamento());
        System.out.println();
    }

}
