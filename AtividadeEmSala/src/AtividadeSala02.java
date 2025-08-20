public class AtividadeSala02 {
    public static void main(String[]args) {
        String nome = "Guilherme";
        String sobrenome = "Cassiano";
        int idade = 17;
        double peso = 60;
        double altura = 1.7;
        double imc = 0;

        System.out.println(nome+" "+sobrenome);
        int anoNasc = 2025 - idade;
        System.out.println("ano de nacimento:"+ anoNasc);
        String texto ="peso:"+ peso+";Altura: " + altura;
        System.out.println("peso:"+ peso+",Altura: " + altura);
        imc = peso/(altura*altura);
        System.out.println("Seu imc e:"+imc);









    }
}
