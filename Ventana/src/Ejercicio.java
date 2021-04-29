import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoStr = new Scanner(System.in);
		int tamVen;
		String cuaVen="";
		
		do {
			System.out.print("Introduce el tamaño de la ventana: ");
			tamVen = teclado.nextInt();
			if (tamVen % 2 == 0 || tamVen < 10) {
				System.out.println("El número debe ser impar y mayor que 10");
			}
		} while ((tamVen % 2 == 0) || tamVen < 10);
		
		System.out.println();
		System.out.println("¿Que cuadrante de la ventana quiere romper? ");
		System.out.println();
		System.out.println("- Arriba izquierda");
		System.out.println("- Arriba derecha");
		System.out.println("- Abajo izquierda");
		System.out.println("- Abajo derecha");
		System.out.println("- Pepita pulgarcita");
		System.out.println();
		
		do {
			System.out.print("Escribe una opción: ");
			
			cuaVen = tecladoStr.nextLine();
			cuaVen = cuaVen.toLowerCase();
			System.out.println(cuaVen);
		} while (!(cuaVen.equals("arriba izquierda")   || cuaVen.equals("arriba derecha") || cuaVen.equals("abajo izquierda") || cuaVen.equals("abajo derecha") || cuaVen.equals("pepita pulgarcita")));		
		
		System.out.println(cuaVen);
		
		System.out.println();
		
		int mitad = (tamVen / 2) + 1;
		
		if ( cuaVen.equals("arriba izquierda")   || cuaVen.equals("arriba derecha") || cuaVen.equals("abajo izquierda") || cuaVen.equals("abajo derecha") || cuaVen.equals("pepita pulgarcita")) {
			// Primera linea de la ventana
			for (int i = 0; i <tamVen; i++) {
				System.out.print("* ")	;
			}		
			
			System.out.println();
			//Lineas del medio	
			for (int i = 0; i < tamVen-2; i++) {
				for (int j = 0; j < tamVen; j++) {
					
					if (cuaVen.equals("arriba izquierda")) {
						if (i < mitad-1 && j < mitad || j == 0 || i == mitad-2 || j == mitad-1 || j == tamVen-1) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					} else if (cuaVen.equals("arriba derecha")){
						if (i < mitad-1 && j >= mitad || j == 0 || i == mitad-2 || j == mitad-1 || j == tamVen-1) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					}	else if (cuaVen.equals("abajo izquierda")){
						if (i >= mitad-2 && j < mitad || j == 0 || i == mitad-2 ||j == mitad-1 ||j == tamVen-1) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					}	else if (cuaVen.equals("abajo derecha")){
						if (i >= mitad-2 && j >= mitad || j == 0 || i == mitad-2 ||j == mitad-1 ||j == tamVen-1) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
						
					}	else if (cuaVen.equals("pepita pulgarcita")){
						if ( j == 0 || i == mitad-2 ||j == mitad-1 ||j == tamVen-1) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}						
					}
				}
				System.out.println();		
			}		
			
			// Última linea de la ventana
			for (int i = 0; i <tamVen; i++) {
				System.out.print("* ")	;
			}
		}	else {
			System.out.print("Escriba una opción del menú");
		}
		
		teclado.close();
		tecladoStr.close();
	}
}

	