package ejercicio1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PruebaEjercicio1{

	@Test
	public void test() {
		SoluciónEjercicio1 respuestaPrograma = P3_Ejercicio_1.Ejercicio1(CrearListaPuntos.crearPuntos());
		
		SoluciónEjercicio1  resMia = new SoluciónEjercicio1();
		Punto punto1 = new Punto(0, 0);
		Punto punto2 = new Punto(0, 1);
		resMia.setPunto1(punto1);
		resMia.setPunto2(punto2);
		resMia.setInstruc_ejecutadas(8);
		
		assertEquals(respuestaPrograma.getPunto1().getX(), resMia.getPunto1().getX());
		assertEquals(respuestaPrograma.getPunto1().getY(), resMia.getPunto1().getY());
		assertEquals(respuestaPrograma.getPunto2().getX(), resMia.getPunto2().getX());
		assertEquals(respuestaPrograma.getPunto2().getY(), resMia.getPunto2().getY());
		assertEquals(respuestaPrograma.getInstruc_ejecutadas(), resMia.getInstruc_ejecutadas());
	}

}
