package Aula3;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Restaurante {
private Set<String> pratosUnicos = new HashSet<>();//Usando set para armazenar os pratos únicos
private List<Pedido> pedidos = new ArrayList<>();//Usando List para armazenar a ordem dos pedidos
private Queue<Pedido> filaPedidos = new LinkedList<>();//Usando Queue para simular a fila de pedidos
private Deque<Pedido> acoesChef = new LinkedList<>(); //Usando Deque para simular as ações do Chef(Retirar da fila e preparar)

public static void main(String[] args) {
    Restaurante restaurante = new Restaurante();
    restaurante.adicionarPedidos();
    restaurante.processarPedidos();
    restaurante.exibirInformacoes();
}

public void adicionarPedidos(){
    Pedido pedido3= new Pedido(3, "Pizza de Calabresa");
    Pedido pedido2 = new Pedido(2, "Hamburguer com fritas");
    Pedido pedido1 = new Pedido(1, "Cookie de M&M");
    pratosUnicos.add(pedido1.GetPrato());
    pratosUnicos.add(pedido2.GetPrato());
    pratosUnicos.add(pedido3.GetPrato());
    pedidos.add(pedido1);
    pedidos.add(pedido2);
    pedidos.add(pedido2);
    filaPedidos.add(pedido1);
    filaPedidos.add(pedido2);
    filaPedidos.add(pedido3);
}

public void processarPedidos(){
    acoesChef.offer(filaPedidos.poll());
    acoesChef.offer(filaPedidos.poll());
}

public void exibirInformacoes(){
    System.out.println("Pratos únicos pedidos: " + pratosUnicos);
    System.out.println("Ordem dos Pedidos: " + pedidos);
    System.out.println("Ações do Chef: " + acoesChef);
    System.out.println("Fila de Pedidos: " + filaPedidos);
}
}
