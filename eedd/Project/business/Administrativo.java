package eedd.Project.business;

/**
 * La clase Administrativo
 * 
 * @author vazquez
 *
 */
public class Administrativo extends Persona {

	private String categoria;

	public Administrativo() {
		super();
	}

	public Administrativo(String categoria) {
		super();
		/**
		 * Categoria del administrativo
		 */
		this.categoria = categoria;
	}

	/**
	 * Devuelve la categoria del administrativo
	 * 
	 * @return categoria del administrativo
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * Modifica la categoria del administrativo
	 * 
	 * @param categoria
	 */

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * M�todo que devuelve el salario del administrativo
	 * 
	 * @return salario
	 */
	public float getSalario() {
		/**
		 * Una condici�n si la categoria del administartivo es A , el salario es 1500,
		 * sino es de 1200.
		 */
		float result = 0;
		if (this.categoria.equals("A"))
			result = 1500;
		else
			result = 1200;

		return result;
	}

}
