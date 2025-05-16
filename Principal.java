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
	
		
		
	}
	
	
	}
	


