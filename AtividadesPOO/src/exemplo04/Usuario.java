package exemplo04;

import javax.swing.*;

public class Usuario extends Pessoa {
    private String userName;
    private String passWord;

    public Usuario(){
        super();
    }
    public Usuario(String nome,int idade,String userName,String passWord){
        super(idade, nome);
        this.userName = userName;
        this.passWord = passWord;

    }
    //metodo

    public  void falar(){
        System.out.println("Oi,eu sou o " + this.nome +
                " Eu tenho " + this.idade +" De idade");
        System.out.println("Meu nome de usuario e: "
                + this.userName);
    }

}
