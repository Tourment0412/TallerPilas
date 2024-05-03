package co.edu.uniquindio.estructuras.tallerpilas.ejercicio;

import co.edu.uniquindio.estructuras.tallerpilas.pila.Pila;

public class Solucion1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila<Integer> pila = new Pila<Integer>();
		pila.push(40);
		pila.push(78);
		pila.push(12);
		pila.push(20);
		pila.push(10);
		System.out.println(pila);
		eliminarElementos(pila, 2, 4);
		System.out.println(pila);

	}

	private static<E> void eliminarElementos(Pila<E> pila, int i, int j) {
		// TODO Auto-generated method stub
		int nivel=1;
		Pila<E> pilaVolcado= new Pila<E>();
		while(!pila.estaVacia()) {
			E elemento= pila.pop();
			if(!(nivel>=i && nivel<=j)) {
				pilaVolcado.push(elemento);
			}
			nivel++;
		}
		while(!pilaVolcado.estaVacia()) {
			pila.push(pilaVolcado.pop());
		}
		
	}

}
