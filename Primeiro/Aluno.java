package Primeiro;
class Aluno extends Pessoa{
    private int matricula;

public Aluno(){}    

public Aluno(String nome, int idade, int matricula){
    super(nome,idade);
    this.matricula= matricula;
}    
public int getMatricula(){
    return matricula;
}
public void setMatricula(){
    this.matricula= matricula;
}

public void apresentar(){
    System.out.println("Olá seu sou o aluno" + getNome() + " e minha matricula é " +matricula+"!");
}
}
