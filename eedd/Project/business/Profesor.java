package eedd.Project.business;

/**
 * La clase Profesor
 * 
 * @author Jose Antonio Vazquez
 *
 */
public class Profesor extends Persona {

	private String especialidad;

	public Profesor() {
		super();
	}

	public Profesor(String especialidad) {
		super();
		/**
		 * Especialidad del profesor
		 */
		this.especialidad = especialidad;
	}

	/**
	 * Devuelve la especialidad del profesor
	 * 
	 * @return especialidad del profesor
	 */

	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * Modifica la especialidad del profesor
	 * 
	 * @param especialidad
	 */

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/**
	 * Devuelve el salario del profesor
	 * 
	 * @return salario=1900
	 */

	public float getSalario() {
		float result;

		result = 1900;
		return result;
	}

}
