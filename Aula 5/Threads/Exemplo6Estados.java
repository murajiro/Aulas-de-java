package Threads;

public class Exemplo6Estados {
    public static void main(String[] args) {
        Thread thread = new Thread(new MinhaThread());
        //Estado: A thread foi criada. mas n iniciada
        System.out.println("Estado da thread: "+ thread.getState());
        //iniciando a Thread
        thread.start();
        //Está em execução ou pronta para ser executada
        System.out.println("Estado da thread: "+ thread.getState());
        try{
            //Espera a thread completar a execução
            thread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        //Estado: TERMINATED - a thread terminou a sua execução
        System.out.println("Estado da thread: " + thread.getState());
    }
}
