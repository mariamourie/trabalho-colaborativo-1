package application;

import entities.Retangulo;
import java.util.Scanner;

public class TesteRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret1 = new Retangulo();
		Retangulo ret2 = new Retangulo();
		
		double comprimento;
		double largura;
		
		System.out.println("--RETÂNGULO 1--");
		System.out.println("Insira um valor para o comprimento");
		comprimento = sc.nextDouble();
		System.out.println("Insira um valor para a largura");
		largura = sc.nextDouble();
		ret1.setComprimento(comprimento);
		ret1.setLargura(largura);
		System.out.printf("Perímetro: %.2f%n", ret1.perimetro());
		System.out.printf("Área: %.2f%n", ret1.area());
		
		System.out.println();
		
		System.out.println("--RETÂNGULO 2--");
		System.out.println("Insira um valor para o comprimento");
		comprimento = sc.nextDouble();
		System.out.println("Insira um valor para a largura");
		largura = sc.nextDouble();
		ret2.setComprimento(comprimento);
		ret2.setLargura(largura);
		System.out.printf("Perímetro: %.2f%n", ret2.perimetro());
		System.out.printf("Área: %.2f%n", ret2.area());
	
		sc.close();
	}
}
