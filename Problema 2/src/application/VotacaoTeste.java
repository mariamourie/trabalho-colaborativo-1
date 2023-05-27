package eleicoes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class VotacaoTeste {
    final static int MaxCandidatos = 7;

    public static void main(String[] args) throws IOException {
       Scanner entrada = new Scanner(new FileReader("votos.txt"));
       PrintWriter saida = new PrintWriter(new FileWriter("resultados.txt"));
       Candidato[] candidato = new Candidato[MaxCandidatos+1];

       for (int c = 1; c <= MaxCandidatos; c++)
          candidato[c] = new Candidato(entrada.nextLine(), 0);

       ContagemVotos contagem = processarVotos(candidato, MaxCandidatos, entrada, saida);
       imprimirResultados(saida, candidato, MaxCandidatos, contagem);
       entrada.close();
       saida.close();
    } 

    public static ContagemVotos processarVotos(Candidato[] lista, int max, Scanner entrada, PrintWriter saida) {
       ContagemVotos votos = new ContagemVotos(0, 0); 
       int voto = entrada.nextInt();
       while (voto != 0) {
          if (voto < 1 || voto > max) {
             saida.printf("Voto invalido: %d\n", voto);
             ++votos.invalidos;
          }
          else {
             ++lista[voto].numVotos;
             ++votos.validos;
          }
          voto = entrada.nextInt();
       } 
       return votos;
    } 

    public static void imprimirResultados(PrintWriter out, Candidato[] lista, int max, ContagemVotos votos) {
       out.printf("\nNumero de votantes: %d\n", votos.validos + votos.invalidos);
       out.printf("Numero de votos validos: %d\n", votos.validos);
       out.printf("Numero de votos invalidos: %d\n", votos.invalidos);
       out.printf("\nCandidato          Num de votos\n\n");

       for (int h = 1; h <= MaxCandidatos; h++)
          out.printf("%-18s %3d\n", lista[h].nome, lista[h].numVotos);

       out.printf("\nCandidato(s) eleitos(s)\n");
       int ganhador = encontrarMaisVotado(lista, 1, MaxCandidatos);
       int votosNoGanhador = lista[ganhador].numVotos;
       for (int candidato = 1; candidato <= MaxCandidatos; candidato++)
          if (lista[candidato].numVotos == votosNoGanhador)
        	  out.printf("   %s\n", lista[candidato].nome);
       
       int menosVotado = encontrarMenosVotado(lista, 1, MaxCandidatos);
       int votosNoMenosVotado = lista[menosVotado].numVotos;
       out.printf("\n Candidato(s) com menor número de votos: \n");
       for(int candidato = 1; candidato <= MaxCandidatos; candidato++) {
    	   if(lista[candidato].numVotos == votosNoMenosVotado) {
    		   out.printf("%s \n", lista[candidato].nome);
    	   }
       }
    } 

    public static int encontrarMenosVotado(Candidato[] lista, int primeiro, int ultimo) {
    	int menosVotado = primeiro;
		for (int candidato = primeiro + 1; candidato <= ultimo; candidato++) {
			if (lista[candidato].numVotos < lista[menosVotado].numVotos) {
				menosVotado = candidato;
			}
		}
		return menosVotado;
    }
    
    public static int encontrarMaisVotado(Candidato[] lista, int pri, int ult) {
       int maisVotado = pri;
       for (int candidato = pri + 1; candidato <= ult; candidato++)
          if (lista[candidato].numVotos > lista[maisVotado].numVotos)
        	  maisVotado = candidato;
       return maisVotado;
    }
 } 
