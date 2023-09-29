package ejercicio3;

public class Matriz {
	private int filas;
	private int columnas;
	private int[][] matriz;
	
	public Matriz(int filas, int columnas) {
		this.filas=filas;
		this.columnas=columnas;
		this.matriz = new int[filas][columnas];
		llenarMatrizConsecutivos();
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
	public void llenarMatrizConsecutivos() {
        int valor = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }
    }
	
	public void imprimirMatriz() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
	//METODO A COMPLETAR PENDEJO
	public static int[][] matrizTranspuesta(int[][] matrizOriginal) {
        int m = matrizOriginal.length;
        int n = matrizOriginal[0].length;

        int[][] matrizTranspuesta = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        return matrizTranspuesta;
    }
	
	public static Matriz crearMatriz() {
		int filas = Helper.validarInt("Ingrese n° de filas: ");
		int columnas = Helper.validarInt("Ingrese n° de columnas");
		return new Matriz(filas, columnas);
	}
}
