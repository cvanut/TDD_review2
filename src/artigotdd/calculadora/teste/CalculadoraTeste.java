package artigotdd.calculadora.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTeste {
	
	Calculadora calculadora = new Calculadora();
	
	@Test
    public void deveriaSomarDoisValoresPassados() throws Exception {
		
		 int valorA = 1;
	        int valorB = 2;
	        
	        Calculadora calculadora = new Calculadora();
	        int soma = calculadora.soma(valorA, valorB);
	 
	        assertEquals(3, soma);
    }
	
	@Test
	public void deveriaSubtrairDoisValoresPassados() throws Exception {
	    
	    int valorA = 1;
	    int valorB = 2;
	    int soma = calculadora.subtrai(valorA, valorB);
	 
	    assertEquals(-1, soma);
	}
	
	@Test
    public void deveriaDividirDoisValoresPassados() throws Exception {
            int valorA = 6;
        int valorB = 3;
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divide(valorA, valorB);
 
        assertEquals(2, divisao);
    }
 
    @Test (expected = ArithmeticException.class)
    public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero()
             throws Exception {
        int valorA = 6;
        int valorB = 0;
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divide(valorA, valorB);
 
        assertEquals(0, divisao);
    }
	

}
