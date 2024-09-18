package Throws_teste;

import java.io.IOException;

public class ExemploThrows {
    void umMetodo(int num) throws IOException, ArithmeticException{
        if(num == 1){
            throw new IOException("IOException");
        }else{
            throw new ArithmeticException("ArithmeticException");
        }
    }
}