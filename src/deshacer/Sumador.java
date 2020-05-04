package deshacer;

import java.util.Stack;

public class Sumador {

	private int resultado = 0;

	private Stack<Integer> sumandos = new Stack<Integer>();
	
	public void sumar(int valor) {
		
		resultado += valor;
		
		sumandos.push(valor);
	}
	
	public int obtenerResultado() {
		
		return resultado;
	}
	
	public void deshacer() {
		
		if (!sumandos.isEmpty()) {
			
			int valor = sumandos.pop();
			
			resultado -= valor;
		}
	}
}
