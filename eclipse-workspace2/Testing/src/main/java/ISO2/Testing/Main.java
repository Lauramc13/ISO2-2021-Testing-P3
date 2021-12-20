package ISO2.Testing;

public class Main {
	public static void main(String[] args) {
		
		int completitudFun = 55;
		int correccionFun = 86;
		int pertinenciaFun = 19;
		int modularidad = 24;
		int reusabilidad = 67;
		int analizabilidad = 72;
		int modificado = 4;
		int probado = 12;
	
		int adecuacionFun = Codigo.adecuacionFuncional(completitudFun, correccionFun, pertinenciaFun);
		int mantenibilidad = Codigo.mantenibilidad(modularidad, reusabilidad, analizabilidad, modificado, probado); 
		
		
		int calidadGlobal = Codigo.calidadGlobal(adecuacionFun, mantenibilidad);
		
		System.out.println("~~~~~~~~~~~~~~~~ Informe ~~~~~~~~~~~~~~~~");
		System.out.println("El nivel de calidad del software es: " + calidadGlobal );
				
	}
}
