package ejercicio1;

import java.util.List;

public class P3_Ejercicio_1 {
	
	public static SoluciónEjercicio1 Ejercicio1(List<Punto> puntos){
		SoluciónEjercicio1 respuesta = new SoluciónEjercicio1();
		if(puntos.size() == 2){
			respuesta.setPunto1(puntos.get(0));
			respuesta.setPunto2(puntos.get(1));
		}else{
			List<Punto> puntos1 = puntos.subList(0, puntos.size()/2);
			List<Punto> puntos2 = puntos.subList(puntos.size()/2, puntos.size());
			SoluciónEjercicio1 respuestaPuntos1 = Ejercicio1(puntos1);
			SoluciónEjercicio1 respuestaPuntos2 = Ejercicio1(puntos2);
			int distancia1 = modulo(respuestaPuntos1.getPunto1(), respuestaPuntos1.getPunto2());
			int distancia2 = modulo(respuestaPuntos2.getPunto1(), respuestaPuntos2.getPunto2());
			if(distancia1 < distancia2){
				respuestaPuntos1.setInstruc_ejecutadas(respuestaPuntos1.getInstruc_ejecutadas() + 2);
				return respuestaPuntos1;
			}else{
				respuestaPuntos2.setInstruc_ejecutadas(respuestaPuntos1.getInstruc_ejecutadas() + 2);
				return respuestaPuntos2;
			}
		}
		
		return respuesta;
	}
	
	private static int modulo(Punto punto1, Punto punto2){
		int cordenadax = (punto1.getX() + punto2.getX())*(punto1.getX() + punto2.getX());
		int cordenaday = (punto1.getY() + punto2.getY())*(punto1.getY() + punto2.getY());
		
		return (int) Math.sqrt((cordenadax+cordenaday));
	}

}
