package eedd.Project.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * La clase Utils
 * 
 * @author Jose Antonio Vazquez
 *
 */

public class Utils {
	/**
	 * Método que nos devuelve el formato largo de la hora actual
	 * 
	 * @return hora actual
	 */

	public static String horaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		// System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));

		return dtf.format(LocalDateTime.now());
	}

	/**
	 * Método que devuelve el formato corto de la hora actual
	 * 
	 * @return
	 */

	public static int horaCortaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");

		return Integer.parseInt(dtf.format(LocalDateTime.now()));
	}

	/**
	 * Método que nos devuelve la fecha actual
	 * 
	 * @return fecha actual
	 */

	public static String fechaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		// System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));

		return dtf.format(LocalDateTime.now());
	}

	/**
	 * Método para calcular las horas pendientes
	 * 
	 * @param horaSalida
	 * @return horas pendientes
	 */

	public static int calcularHorasPendientes(int horaSalida) {

		int result = 0;
		result = horaSalida - horaCortaActual();
		return result;
	}

}
