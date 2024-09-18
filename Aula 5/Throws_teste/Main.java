package Throws_teste;

import java.io.IOException;

public class Main{
    public static void main(String[] args) {
       try{
           ExemploThrows obj = new ExemploThrows();
           obj.umMetodo(1);
       }catch(IOException| ArithmeticException ex){
           System.out.println(ex);
       }
   }
}
