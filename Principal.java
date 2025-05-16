package br.edu.principal;

import br.edu.figurasgeometricasplanas.*;

public class Principal {
	 
	public static void main(String[] args){
		
		Triangulo fg1 = new Triangulo();
		fg1.recebeAltura(7);
		fg1.recebeBase(10); 
		fg1.calcArea();
		fg1.mostrarArea();
		double recebeArea = fg1.mostrarAreacomRetorno();


				
		Quadrado fg2 = new Quadrado();
		fg2.recebeLado(8);
		fg2.calcArea();
		fg2.mostrarArea();
		recebeArea = fg2.mostrarAreaComRetorno();
		
		Circulo fg3 = new Circulo();
		fg3.recebaRaio(9);
		fg3.calcArea();
		fg3.mostrarArea(); 
		recebeArea= fg3.mostrarAreaComRetorno();
		
		Hexagono fg9= new Hexagono();
		fg9.recebaLado(4);
		fg9.calcArea();
		fg9.mostrarArea();
		recebeArea = fg9.mostrarAreaComRetorno();
		
	}
	
	
	}
	


