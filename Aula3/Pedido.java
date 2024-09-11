package Aula3;
public class Pedido{
    private int numero;
    private String prato;

    public Pedido(int numero, String prato){
        this.numero = numero;
        this.prato = prato;
    }

    public void SetNumero(int numero){
        this.numero = numero;
    }

    public int GetNumero(){
        return numero;
    }
    public void SetPrato(String prato){
        this.prato = prato;
    }
    public String GetPrato(){
        return prato;
    }

    public String toString(){
        return "Pedido #" + numero + ":" + prato;
    }
}