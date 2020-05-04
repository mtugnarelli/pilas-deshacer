package deshacer;

import java.util.Stack;

public class Historial {

	private Stack<String> acciones = new Stack<String>();
	
	public void aplicar(String accion) {
		
		acciones.push(accion);
		
		System.out.printf("push%-15s %s %n", "(" + accion + ")", acciones);
	}
	
	public void deshacer() {
		
		if (! acciones.isEmpty()) {
			
			String paso = acciones.pop();
		
			System.out.printf("pop() -> %-10s %s %n", paso, acciones);

		} else {
			
			System.out.printf("isEmpty()           %s %n", acciones);
		}
	}
}
