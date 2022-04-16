package eedd.Project.business;

import java.util.Date;

/**
 * La clase Persona
 * 
 * Contiene informacion de cada persona
 * 
 * @author Jose Antonio Vazquez
 *
 */

public class Persona {
	/**
	 * Nombre de la persona
	 */

	protected String nombre;
	/**
	 * Apellidos de la persona
	 */
	protected String apellidos;
	/**
	 * Dni de la persona
	 */
	protected String dni;
	/**
	 * Fecha de nacimiento de la persona
	 */
	protected Date fechaNacimiento;
	/**
	 * Horario asignado a la persona
	 */
	public String horarioAsignado;
	/**
	 * Hora de entrada de la persona
	 */
	public int horaEntrada;
	/**
	 * Hora de salida de la persona
	 */
	public int horaSalida;

	public Persona() {
		super();
	}

	public Persona(String nombre, String apellidos, String dni, Date fechaNacimiento, String horarioAsignado,
			int horaEntrada, int horaSalida) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.horarioAsignado = horarioAsignado;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;

	}

	/**
	 * Devuelve el nombre de la persona
	 * 
	 * @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre de la persona
	 * 
	 * @param nombre
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve los apellidos de la persona
	 * 
	 * @return apellidos de la persona
	 */

	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Modifica los apellidos de la persona
	 * 
	 * @param apellidos
	 */

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Devuelve el dni de la persona
	 * 
	 * @return dni de la persona
	 */

	public String getDni() {
		return dni;
	}

	/**
	 * Modifica el dni
	 * 
	 * @param dni
	 */

	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Devuelve la fecha de nacimiento de la persona
	 * 
	 * @return fecha de nacimiento de la persona
	 */

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Modifica la fecha de nacimiento de la persona
	 * 
	 * @param fechaNacimiento
	 */

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Devuelve el horario asignado de la persona
	 * 
	 * @return horario asignado de la persona
	 */

	public String getHorarioAsignado() {
		return horarioAsignado;
	}

	/**
	 * Modifica el horario asignado de la persona
	 * 
	 * @param horarioAsignado
	 */

	public void setHorarioAsignado(String horarioAsignado) {
		this.horarioAsignado = horarioAsignado;
	}

	/**
	 * Devuelve la hora de entrada de la persona
	 * 
	 * @return hora de entrada de la persona
	 */
	public int getHoraEntrada() {
		return horaEntrada;
	}

	/**
	 * Modifica el horario asignado de la persona
	 * 
	 * @param horaEntrada
	 */

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	/**
	 * Devuelve la hora de salida de la persona
	 * 
	 * @return hora de salida de la persona
	 */

	public int getHoraSalida() {
		return horaSalida;
	}

	/**
	 * Modifica la hora de salida de la persona
	 * 
	 * @param horaSalida
	 */

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}

}