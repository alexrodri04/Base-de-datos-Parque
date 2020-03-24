package model;

public class Ofertas {

	private int id;
	private String tipo;
	private int descuento;

	public Ofertas(String tipo, int descuento) {
		this.tipo =tipo;
		this.descuento = descuento;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
}
