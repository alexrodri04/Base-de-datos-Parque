package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clientes {
	
	private Integer id;
	private LocalDate fecha_nacimiento;
	private Integer altura;
	private String nombre;
	private LocalDate fechaentrada;
	private LocalDate fechasalida;
	private Boolean numerosa;
	private Integer puesto_id;
	private Integer atraccion_id;
	private ArrayList<int[]> ofertas_id = new ArrayList<int[]>();
	
	
	Clientes () {
		id = 0;
		fecha_nacimiento = LocalDate.of(0,0,0) ;
		altura = 0;
		nombre = "vacio";
		fechaentrada = LocalDate.of(0,0,0);
		fechasalida = LocalDate.of(0,0,0);
		numerosa = false;
		puesto_id = 0;
		atraccion_id = 0;
		ofertas_id = new ArrayList<int[]>();
		
		
	}
	
	Clientes (LocalDate d; int a, String n) {
		fecha_nacimiento = d;
		altura = a;
		nombre = n;
	}
	
	Clientes (LocalDate d; int a, String n, LocalDate in, LocalDate out; Boolean fam, int p, int at,) {
		fecha_nacimiento = d;
		altura = a;
		nombre = n;
		fechaentrada = in;
		fechasalida= out;
		numerosa = fam;
		atraccion_id = at;
		puesto_id = p;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFechaentrada() {
		return fechaentrada;
	}
	public void setFechaentrada(LocalDate fechaentrada) {
		this.fechaentrada = fechaentrada;
	}
	public LocalDate getFechasalida() {
		return fechasalida;
	}
	public void setFechasalida(LocalDate fechasalida) {
		this.fechasalida = fechasalida;
	}
	public Boolean getNumerosa() {
		return numerosa;
	}
	public void setNumerosa(Boolean numerosa) {
		this.numerosa = numerosa;
	}
	public Integer getPuesto_id() {
		return puesto_id;
	}
	public void setPuesto_id(Integer puesto_id) {
		this.puesto_id = puesto_id;
	}
	public Integer getAtraccion_id() {
		return atraccion_id;
	}
	public void setAtraccion_id(Integer atraccion_id) {
		this.atraccion_id = atraccion_id;
	}
	public ArrayList<int[]> getOfertas_id() {
		return ofertas_id;
	}
	public void setOfertas_id(ArrayList<int[]> ofertas_id) {
		this.ofertas_id = ofertas_id;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
}
