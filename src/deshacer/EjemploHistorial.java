package deshacer;

public class EjemploHistorial {

	public static void main(String[] args) {

		Historial historial = new Historial();
		
		historial.aplicar("Recortar");
		historial.aplicar("Sepia");
		historial.aplicar("Rotar");
		historial.aplicar("Luz");
		historial.deshacer();
		historial.aplicar("Enfocar");
		historial.aplicar("Brillo");
		historial.deshacer();
		historial.deshacer();
		historial.deshacer();
		historial.deshacer();
		historial.aplicar("Retro");
		historial.aplicar("Rotar");
		historial.deshacer();
		historial.deshacer();
		historial.deshacer();
		historial.deshacer();
	}
}
