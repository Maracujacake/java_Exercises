import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int escolha = menu();
		if(escolha == 1){
		    System.out.println("A gravidade da lua é cerca de 17% da gravidade terrestre. Sim, da pra dar pulinhos bem altos!");
		    System.exit(0);
		}
		else if(escolha == 2){
		    System.exit(0);
		}
		else{
		    System.out.println("Escolha um número válido, por favor (1 ou 2)");
		}
	}
	
	public static int menu(){
	    System.out.println("Gostaria de saber qual é a relação entre a gravidade da lua e a da terra?");
	    System.out.println("Digite 1 para sim e 2 para não");
	    Scanner x = new Scanner(System.in);
	    return x.nextInt();
	}
}
