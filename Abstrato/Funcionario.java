package Abstrato;

public abstract class Funcionario implements Pagamento{
    private String nome;
    private double salarioBase;

    public Funcionario(){}

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase= salarioBase;
    }
    public String getNome(){
        return nome;
    }
    public double getsalarioBase(){
        return salarioBase;
    }
    public abstract double calcularSalario();
}
