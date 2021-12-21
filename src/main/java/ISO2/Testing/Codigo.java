package ISO2.Testing;

public class Codigo {

    public static int adecuacionFuncional(int comFun, int corFun, int perFun){
    	//Tabla de completitud Funcional
    	if(comFun >= 0 && comFun <10) comFun= 0;
    	else if(comFun >= 10  && comFun <35) comFun= 1;
    	else if(comFun >=  35 && comFun <70) comFun= 2;
    	else if(comFun >= 70  && comFun <90) comFun= 3;
    	else if(comFun >= 90  && comFun <=100) comFun= 4;
    	else comFun = -1;

    	//Tabla de correccion Funcional
    	if(corFun >= 0  && corFun <10) corFun= 0;
    	else if(corFun >= 10  && corFun <50) corFun= 1;
    	else if(corFun >=  50 && corFun <70) corFun= 2;
    	else if(corFun >= 70  && corFun <90) corFun= 3;
    	else if(corFun >= 90  && corFun <=100) corFun= 5;
    	else corFun = -1;

    	//Tabla de pertinencia Funcional
    	if(perFun >= 0  && perFun <10) perFun= 0;
    	else if(perFun >= 10  && perFun <50) perFun= 2;
    	else if(perFun >=  50 && perFun <70) perFun= 3;
    	else if(perFun >= 70  && perFun <90) perFun= 4;
    	else if(perFun >= 90  && perFun <=100) perFun= 5;
    	else perFun = -1;

    	int min = Math.min(Math.min(comFun, corFun), perFun);
    	return min;

    }
    
	public static int mantenibilidad(int mod, int reu, int ana, int capMod, int capProb){
		//Tabla de modularidad
		if(mod >= 0  && mod < 10) mod = 0;
		else if(mod >= 10  && mod < 35) mod = 1;
		else if(mod >= 35 && mod < 70) mod = 2;
		else if(mod >= 70  && mod < 90) mod = 3;
		else if(mod >= 90  && mod <= 100) mod = 4;
		else mod = -1;

		//Tabla de reusabilidad
		if(reu >= 0  && reu < 10) reu = 0;
		else if(reu >= 10  && reu < 35) reu = 1;
		else if(reu >= 35 && reu < 70) reu = 2;
		else if(reu >= 70  && reu < 90) reu = 3;
		else if(reu >= 90  && reu <= 100) reu = 5;
		else reu = -1;

		//Tabla de analizabilidad
		if(ana >= 0  && ana < 35) ana = 0;
		else if(ana >= 35  && ana < 50) ana = 1;
		else if(ana >= 50 && ana < 70) ana = 2;
		else if(ana >= 70  && ana < 90) ana = 3;
		else if(ana >= 90  && ana <= 100) ana = 5;
		else ana = -1;

		//Tabla de capacidad de ser modificado
		if(capMod >= 0  && capMod < 10) capMod = 0;
		else if(capMod >= 10  && capMod < 35) capMod = 1;
		else if(capMod >= 35  && capMod < 50) capMod = 2;
		else if(capMod >= 50 && capMod < 70) capMod = 3;
		else if(capMod >= 70  && capMod < 90) capMod = 4;
		else if(capMod >= 90  && capMod <= 100) capMod = 5;
		else capMod = -1;

		//Tabla de capacidad de ser probado
		if(capProb >= 0  && capProb < 10) capProb = 0;
		else if(capProb >= 10  && capProb < 50) capProb =1;
		else if(capProb >= 50 && capProb < 70) capProb = 2;
		else if(capProb >= 70  && capProb <= 100) capProb = 4;
		else capProb = -1;

		int min = Math.min(Math.min(mod, Math.min(reu, Math.min(ana, capMod))), capProb);
		return min;
	}
	

	public static int calidadGlobal(int man, int ade){

		if((man >=1 && man<=5 && ade== 1) || (ade==2 && man == 1)) return 1;
		else if((man >=2 && man<=5 && ade== 2) || (ade==3 && (man==1 || man== 2))) return 2;
		else if((man >=3 && man<=5 && ade== 3) || (ade==4 && man>=1 && man<=3) || (ade == 5 && (man==1 || man== 2))) return 3;
		else if((man==5 && ade== 4) || (ade==5 && (man==3 || man== 4)) || (ade == 4 && man == 4)) return 4;
		else if(man == 5 && ade == 5) return 5;
		
		return -1;

	}

}