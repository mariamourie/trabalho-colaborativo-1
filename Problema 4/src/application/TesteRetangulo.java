package application;

import entities.Retangulo;

public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo ret1 = new Retangulo();
		Retangulo ret2 = new Retangulo();
		
		ret1.setComprimento(2.0);
		ret1.setLargura(5.0);
		System.out.println("--RETÂNGULO 1--");
		System.out.printf("Perímetro: %.2f%n", ret1.perimetro());
		System.out.printf("Área: %.2f%n", ret1.area());
		
		System.out.println();
		
		ret2.setComprimento(3.0);
		ret2.setLargura(4.0);
		System.out.println("--RETÂNGULO 2--");
		System.out.printf("Perímetro: %.2f%n", ret2.perimetro());
		System.out.printf("Área: %.2f%n", ret2.area());
	}

}
