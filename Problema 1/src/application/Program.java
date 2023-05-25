package application;

import java.util.Scanner;

import entities.Cargueiro;
import entities.Cruzeiro;
import entities.Navio;

public class Program {

	final static int numNavios = 3;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nomeNavio, anoFabricado;
		int numMaxCap, capacidadeCarga;
		
		Navio[] navios = new Navio[numNavios];
		
		System.out.println("-- NAVIO 1 --");
		System.out.println("Digite o nome do navio: ");
		nomeNavio = sc.nextLine();
		System.out.println("Digite o ano em que o navio foi construído");
		anoFabricado = sc.nextLine();
		navios[0] = new Navio();
		navios[0].setNome(nomeNavio);
		navios[0].setAno(anoFabricado);
		
		
		System.out.println("-- NAVIO 2 --");
		System.out.println("Digite o nome do navio: ");
		nomeNavio = sc.nextLine();
		System.out.println("Digite o ano em que o navio foi construído");
		anoFabricado = sc.nextLine();
		System.out.println("Digite o número máximo de passageiros do navio: ");
		numMaxCap = sc.nextInt();
		Cruzeiro cruzeiro = new Cruzeiro();
		cruzeiro.setNome(nomeNavio);
		cruzeiro.setAno(anoFabricado);
		cruzeiro.setNumMax(numMaxCap);
		navios[1] = cruzeiro;
		
		System.out.println("-- NAVIO 3 --");
		System.out.println("Digite o nome do navio: ");
		nomeNavio = sc.next();
		System.out.println("Digite o ano em que o navio foi construído");
		anoFabricado = sc.nextLine();
		System.out.println("Digite a capacidade máxima em toneladas");
		capacidadeCarga = sc.nextInt();
		Cargueiro cargueiro = new Cargueiro();
		cargueiro.setNome(nomeNavio);
		cargueiro.setAno(anoFabricado);
		cargueiro.setCapacidadeCarga(capacidadeCarga);
		navios[2] = cargueiro;
		
		System.out.println();
		
		for(Navio navio: navios) {
			System.out.println(navio.toString());
		}
	}

}
