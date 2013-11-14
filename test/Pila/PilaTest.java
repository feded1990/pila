package Pila;

import org.junit.Test;
import static org.junit.Assert.*;

public class PilaTest {
    
    public PilaTest() {
    }
    
    @Test
    public void pruebaVacio() {
        System.out.println("Prueba si el vector esta vacio");
        Pila S = new Pila();
        assertTrue(S.isEmpty());
    }
    
    @Test
    public void pruebaPush(){
        System.out.println("Prueba si se agrega un elemento, debe estar no vacio");
        Pila S = new Pila();
        S.push(7);
        assertFalse(S.isEmpty());
    }
    
    @Test
    public void pruebaPop(){
        System.out.println("Prueba pop, la pila debe estar no vacio");
        Pila S = new Pila();
        S.push(7);
        S.pop();
        assertTrue(S.isEmpty());
    }

    @Test
    public void pruebaElementosIguales(){
        System.out.println("Prueba al agregar dos elementos y si retiro uno, el tope de pila debe ser el primero elemento agregado");
        Pila S = new Pila();
        S.push(7);
        S.push(8);
        S.pop();
        assertTrue(S.returnpop()==7);
    }
    
    @Test
    public void pruebaQuitarElementos(){
        System.out.println("Prueba al agregar tres elementos, y al retirarlos deben salir en forma en el orden correcto");
        Pila S = new Pila();
        S.push(7);
        S.push(8);
        S.push(9);
        assertTrue(S.returnpop()==9);
        S.pop();
        assertTrue(S.returnpop()==8);
        S.pop();
        assertTrue(S.returnpop()==7);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void pruebaExcepcion(){
        System.out.println("Probar excepción");
        Pila S = new Pila();
        S.pop();
    }
}
