package Abstrato;

public class Main {
    public static void main(String[] args) {
        Funcionario dev= new Desenvolvedor("Landim", 500000, 200000);
        Funcionario gerente= new Gerente("Tite", 300000, 100000);

        System.out.println("Salário do presidente "+ dev.getNome() + " é de: "+ dev.calcularSalario()) ;
        System.out.println("O técnico "+ gerente.getNome()+" é de: "+gerente.calcularSalario());
    }
}
