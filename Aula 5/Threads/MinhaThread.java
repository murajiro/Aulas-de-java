package Threads;
class MinhaThread implements Runnable{
    @Override
    public void run(){
        //Runnable(executável)
        System.out.println("Estado da thread: "+ Thread.currentThread().getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Estado da Thread " + Thread.currentThread().getState());
    }
}
