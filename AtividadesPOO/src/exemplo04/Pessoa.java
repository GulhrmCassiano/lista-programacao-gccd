package exemplo04;


public class Pessoa {

       String nome ;
       int idade ;

       public Pessoa(){
           this.nome =  "";
           this.idade = 0;
       }

       public Pessoa(int idade, String nome){
           this.nome = nome;
           this.idade = idade;
       }
       //METODO
    public int getIdade(){
           return this.idade;
    }
    //set
    public void setIdade(int valor){
           this.idade = valor;
    }
    //get
    public String  getNome(){
           return this.nome;
    }
    public void setNome(String nome){
           this.nome = nome;
    }


    //Ações
    public  void falar(){
        System.out.println("Oi,eu sou o " + this.nome +
                " Eu tenho " + this.idade +" De idade");
    }



}
