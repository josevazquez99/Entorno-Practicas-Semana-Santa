package eedd.Project.main;

import java.util.Scanner;
/**
 * La clase Main principal
 */

import eedd.Project.business.Administrativo;
import eedd.Project.business.Profesor;
import eedd.Project.business.Director;
import eedd.Project.utils.Utils;

public class MenuApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		mostrarPresentacion();
		// Preguntamos el nombre de la persona
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		// Preguntamos el primer apellido de la persona
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = sc.nextLine();

		mostrarPresentacionBienvenida(nombre, primerApellido);

		administrativo(sc);

		profesor(sc);

		calcularSalarioDirector(nombre, primerApellido);

		sc.close();

	}

	/**
	 * Método que nos devuelve el salario de los profesores que hayamos introducdo
	 * 
	 * @param sc
	 */

	private static void profesor(Scanner sc) {
		// Preguntamos el número de profesores
		System.out.println("Introduce el número de profesores : ");
		int numProf = sc.nextInt();
		Profesor[] listaProf = new Profesor[numProf];
		/**
		 * Un bucle , dependiendo del número de profesores que hayamos introducido nos
		 * dará los salarios de cada profesor.
		 */
		for (int i = 0; i < numProf; i++) {
			listaProf[i] = new Profesor();
			listaProf[i].getSalario();
			System.out.println("El salario del profesor es: " + listaProf[i].getSalario());
		}
	}

	/**
	 * Método que devuelve el salario de los administrativos que hayamos introducido
	 * 
	 * @param sc
	 */
	private static void administrativo(Scanner sc) {
		// Preguntamos el número de administartivos
		System.out.println("Introduce el número de administrativos : ");
		int numAdmins = sc.nextInt();
		Administrativo[] listaAdmins = new Administrativo[numAdmins];
		/**
		 * Un bucle , dependiendo del número de administrativos que hayamos introducido nos
		 * dará los salarios de cada administrativo.
		 */
		for (int i = 0; i < numAdmins; i++) {
			listaAdmins[i] = new Administrativo();
			if (i < 2)
				listaAdmins[i].setCategoria("A");
			else
				listaAdmins[i].setCategoria("B");
			// listaAdmins[i].getSalario();
			System.out.println("El salario del administrativo es: " + listaAdmins[i].getSalario());
		}
	}

	/**
	 * Método que devuelve una presentación de bienvenida con tu nombre y primer
	 * apellido
	 * 
	 * @param nombre
	 * @param primerApellido
	 */

	private static void mostrarPresentacionBienvenida(String nombre, String primerApellido) {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fechaActual());
		System.out.println("/*** " + Utils.horaActual());
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}

	/**
	 * Método que devuelve una presentación de que hay que eliminar los malos olores
	 */

	private static void mostrarPresentacion() {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     Y DE NUEVO...                                                       ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}

	/**
	 * Método que devuelve el salario del director
	 * 
	 * @param n
	 * @param a
	 */
	private static void calcularSalarioDirector(String n, String a) {
		Director d = new Director();
		d.setNombre(n);
		d.setApellidos(a);

		System.out.println("El salario del director es: " + d.getSalario());
	}

}
