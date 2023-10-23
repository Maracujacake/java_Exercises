import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double tempo = scanTempo();
		
		double distanciaPes = tempo * 1100;
		double distanciaMilhas = tempo / 5;
		double distanciaKM = tempo / 3;
		
		resposta(distanciaPes, distanciaMilhas, distanciaKM);
	}
	
	public static double scanTempo(){
	    System.out.println("Quanto tempo (em segundos) você demorou para ouvir o raio após vê-lo?");
		System.out.println("Cronometre e coloque abaixo:");
		Scanner x = new Scanner(System.in);
		return x.nextDouble();
	}
	
	public static void resposta(double distanciaPes, double distanciaMilhas, double distanciaKM){
	    System.out.println("De acordo com o tempo mencionado, você está a " + distanciaPes + " pés, " +
		                    distanciaMilhas + " milhas e " + distanciaKM + " KM de distância do raio.");
	}
}
