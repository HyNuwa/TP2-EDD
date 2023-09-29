package ejercicio4;
import java.util.*;

public class Fibonacci {
	private ArrayList<Integer> fibonacciSeries;
	Scanner scanner = new Scanner(System.in);

    public Fibonacci() {
        fibonacciSeries = new ArrayList<>();
        fibonacciSeries.add(0);
        fibonacciSeries.add(1);
    }
    public void generarSerie() {

	    while (true) {
	    	mostrarSerie();
	        String respuesta = Helper.getChar("¿Desea continuar generando términos de la serie Fibonacci? (S/N): ");
	        if (respuesta.equalsIgnoreCase("N")){
	        	mostarPromedio();
	            break;
	        }
	
	        int ultimo = fibonacciSeries.get(fibonacciSeries.size() - 1);
	        int penultimo = fibonacciSeries.get(fibonacciSeries.size() - 2);
	        int siguiente = ultimo + penultimo;
	        fibonacciSeries.add(siguiente);
	    }

    scanner.close();
    }
    
    public void mostrarSerie() {
        System.out.println("Serie de Fibonacci:");
        for (int numero : fibonacciSeries) {
            System.out.print(numero + " ");
        }
    }
    public void mostarPromedio() {
       int pares = 0;
       int impares=0;
       for (int i = 0; i < fibonacciSeries.size(); i++) {

    	   if(fibonacciSeries.get(i)%2==0) {
    		   pares+=fibonacciSeries.get(i);
    	   }else {
    		   impares+=1;
    	   }
       }
       int promedio=pares/impares;
       System.out.println("SUMA DE LOS TERMINOS PARES: "+ pares);
       System.out.println("CANTIDAD DE TERMINOS IMPARES "+impares);
       System.out.println("PROMEDIO DE LOS TERMINOS GENERADOS: "+promedio);
       int cantadorValoresMayorAlPromedio=0;
       for (int numero : fibonacciSeries) {
           if(numero>promedio) {
        	   cantadorValoresMayorAlPromedio+=1;
           }
       }
       System.out.println("CANTIDAD DE TERMINOS MAYOR AL PROMEDIO: "+cantadorValoresMayorAlPromedio);
    }
    
}
