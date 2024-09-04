package Abstrato;

public class Gerente extends Funcionario {
    private double comissao;

    public Gerente(String nome, double salarioBase, double comissao){
        super(nome, salarioBase);
        this.comissao = comissao;
    }
    public double getComissao(){
        return comissao;
    }
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    @Override
    public double calcularSalario(){
        return getsalarioBase()+ getComissao();
    } 
}
