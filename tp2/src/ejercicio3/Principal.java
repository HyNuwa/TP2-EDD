package ejercicio3;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Matriz nuevaMatriz =null;
		while(true) {
			System.out.println("MENU: \nOPCION 1: crear la matriz de tamaño mxn"
					+ "\nOPCION 2: mostrar la matriz mxn" + "\nOPCION 3:terminar el programa"+
					"\n OPCION 4: Mostrar matriz transpuesta");
			int opcion = Integer.parseInt(scanner.nextLine());
			//System.out.println("\n");
			switch(opcion) {
				case 1:
					nuevaMatriz = Matriz.crearMatriz();
					break;
				case 2:
					nuevaMatriz.imprimirMatriz();
					break;
				case 3:
					System.out.println("PROGRAMA TERMINADO");
					break;
				case 4:
					break;
				default:
					System.out.println("ERROR: REVISE EL VALOR INGRESADO");
			}
		}
	}

}
