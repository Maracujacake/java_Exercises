import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Olá, este programa tem a função de converter galões de gasolina em litros");
		System.out.println("Se deseja continuar, por favor, digite 1. Caso queira sair do programa, digite 2");
		
		// leitura de escolha do usuário
	    int escolha = 0;
	    Scanner x = new Scanner(System.in);
	    escolha = x.nextInt();
	    
	    // decisão conforme escolha do usuário
	    if(escolha == 1){
	        System.out.println("Digite o número de galões de gasolina que deseja converter para litros");
	        int galoes = 0;
	        Scanner g = new Scanner(System.in);
	        galoes = g.nextInt();
	        double litrosGasolina = galoes * 3.7854;
	        String litrosGArredondados = String.format("%.2f", litrosGasolina);
	        System.out.println(galoes + " galões de gasolina são equivalentes a " + litrosGArredondados + " litros de gasolina.");
	    }
	    else if(escolha == 2){
	        System.exit(0);
	    }
	}
}
