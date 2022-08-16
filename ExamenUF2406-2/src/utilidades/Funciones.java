/**
 * Clase Funciones
 */
package utilidades;
/**
 * Clase que modela una serie de funciones establecidas.
 * <p>@author Araceli Cuadra</p>
 *
 */
public class Funciones {
	
	/**
	 * Método al que le pasas tres números enteros y nos devuelve el número que se encuentra
	 * en la posición de en medio, ordenados de menor a mayor.
	 * @param num1 int, el número deberá ser entero.
	 * @param num2 int, el número deberá ser entero.
	 * @param num3 int, el número deberá ser entero.
	 * @return int con el número que se encuentra en medio de los tres números.
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ( ((num1>num2) && (num1<num3)) || ((num1>num3) && (num1<num2))) {
			enMedio=num1;
		}  else if  ( ((num2>num1) && (num2<num3)) || ((num2>num3) && (num2<num1)) ){
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	
/**
 * Método que al pasarle como parámetro un año nos devolverá si es bisiesto o no.
 * El año debe estar comprendido entre 1700 y 2500.
 * @param anyo int El año que le pasamos por parámetro.
 * @return true si el año es bisiesto o false en el caso contrario.
 */
	public boolean esBisiesto(int anyo) {
		boolean bisiesto = false;
		if (anyo <1700 || anyo >2500) {
			throw new ArithmeticException("El a�o debe estar entre 1700 y 2500");
		}
		if (anyo %4 == 0 ) {
			if (anyo%100==0 && anyo%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else  {
			bisiesto=false;
		}
		return bisiesto;
	}
	

	
	
}
