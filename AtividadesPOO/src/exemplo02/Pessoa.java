package exemplo02;
import java.util.Scanner;

public class Pessoa {
    String nome ;
    int idade ;

       //Ações
    public  void falar(){
        System.out.println("Oi,eu sou " + this.nome +
                " Eu tenho " + this.idade +" De idade");
    }


}