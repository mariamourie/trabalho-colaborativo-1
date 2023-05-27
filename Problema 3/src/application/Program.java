package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.BalaDeCanhao;
import entities.Ponto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ângulo inicial:");
		double angulo = sc.nextDouble();
		System.out.println("Digite a velocidade inicial:");
		double velocidadeInicial = sc.nextDouble();
		System.out.println("Digite o tempo em segundos:");
		int tempo = sc.nextInt();
		
		BalaDeCanhao bala = new BalaDeCanhao(0.0, 0.0);
		ArrayList<Ponto> pontos = bala.atirar(angulo, velocidadeInicial, tempo);
		
		for(Ponto ponto: pontos) {
			System.out.println("(" + ponto.getX() + ", " + ponto.getY() + ")");
		}
		sc.close();
	}
}
