package Pila;

public class Pila {
    
    private int longitud = 10; 
    private int[] s = new int[10];
    private int cantidad= -1;
    
    public boolean isEmpty(){
        if(cantidad==-1){
            return true;
        }else{
            return false;
        }
    }
    
    public void push(int valor) {
            cantidad++;
            s[cantidad] = valor;
    }

    public void pop() {
        if(cantidad>-1){
            cantidad--;
        }else{
           throw new UnsupportedOperationException("La pila esta vacia, no se pueden retirar elementos");
        }
    }
    
    public int returnpop(){
        int pop;
        pop=s[cantidad];
        return pop;
    }
}
