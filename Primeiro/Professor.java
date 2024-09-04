package Primeiro;
class Professor extends Pessoa{
    private String funcao;

public Professor(){}

public Professor(String nome, int idade, String funcao ){
    super(nome,idade);
    this.funcao = funcao;
}
public String getFuncao(){
    return funcao;
}
public void apresentar(){
    System.out.println("Olá seu sou o professor " + getNome() + " e minha matricula é " +funcao+"!");
}
}
