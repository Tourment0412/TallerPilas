package co.edu.uniquindio.estructuras.tallerpilas.pila;

public class SimpleNode<E> {

	private E value;
	private SimpleNode<E> next;

	public SimpleNode(E valor) {
		this.value = valor;
		this.next = null;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public SimpleNode<E> getNext() {
		return next;
	}

	public void setNext(SimpleNode<E> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return next != null ? String.format("%s, %s", value, next) : value.toString();
	}

}
