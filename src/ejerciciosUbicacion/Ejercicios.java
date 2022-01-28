package ejerciciosUbicacion;

import java.util.Scanner;

public class Ejercicios {
	
	public void Ajedrez() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tablero[][]= new int[8][8];
		Scanner leer =new Scanner(System.in);
		int contador=0;
		int posicionX=0;
		int posicionY=0;
		boolean bandera;
		while (contador<8) {
			try {
				System.out.println("Ingrese posicion en X");
				posicionX=leer.nextInt();
				System.out.println("Ingrese posicion en Y");
				posicionY=leer.nextInt();
				tablero[posicionX][posicionY]=1;
				contador++;
			}catch (Exception e) {
				System.out.print(e);
			}
		}
		bandera=false;
		//Recorremos el tablero buscando coincidencias
		for (int posicx=0; posicx < tablero.length; posicx++) {
			for (int posicy=0; posicy < tablero[posicx].length; posicy++) {
				if (tablero[posicx][posicy]==1) {
					//Buscamos en la fila
					for (int x=0; x < tablero.length; x++) {
						if(posicx!=x && tablero[x][posicy]==1) {
							bandera=true;
						}
					}
					//Buscamos en la columna
					for (int y=0; y < tablero.length; y++) {
						if(posicy!=y && tablero[posicx][y]==1) {
							bandera=true;
						}
					}
					//Buscamos en diagonal izquierda derecha
				/*	int contaDiag=0;
					int posixAux=0;
					posixAux=posicx-posicy;
					if (posixAux<0) {
						posixAux=0;
					}
					while(contaDiag<7) {	
						if (posixAux!=posicx && contaDiag!=posicy && tablero[posixAux][contaDiag]==1) {
							bandera=true;
						}
					contaDiag++;
					}*/
				}
			}
		}
		
		//Impresion de tablero
		for (int x=0; x < tablero.length; x++) {
			System.out.println();
			for (int y=0; y < tablero[x].length; y++) {
				System.out.print(tablero[x][y]);
			}
		}
		System.out.println();
		if (bandera) {
			System.out.print("No");
		}else {
			System.out.print("Si");
		}
	}

}
