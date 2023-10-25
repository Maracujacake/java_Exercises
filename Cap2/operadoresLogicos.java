public class Main
{
	public static void main(String[] args) {
		menu();
		construcaoTabela();
	}
	
	public static void menu(){
	    System.out.println("Abaixo, será mostrada uma tabela das relações entre operadores lógicos na matemática e em java\n");
	}
	
	public static void construcaoTabela(){
	   boolean p, q;
	   System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
	   
	   // caso em que ambos são verdadeiros
	   p = true;
	   q = true;
	   System.out.print(p + "\t" + q + "\t");
	   System.out.print((p & q) + "\t" + (p | q) + "\t");
	   System.out.println((p^q) + "\t" + !q + "\t");
	   
	   // caso em que ambos são falsos
	   p = false;
	   q = false;
	   System.out.print(p + "\t" + q + "\t");
	   System.out.print((p & q) + "\t" + (p | q) + "\t");
	   System.out.println((p^q) + "\t" + !q + "\t");
	   
	   // caso em que um deles é falso e o outro verdadeiro
	   p = false;
	   q = true;
	   System.out.print(p + "\t" + q + "\t");
	   System.out.print((p & q) + "\t" + (p | q) + "\t");
	   System.out.println((p^q) + "\t" + !q + "\t");
	   
	   // relação inversa da mostrada anteriormente
	   p = true;
	   q = false;
	   System.out.print(p + "\t" + q + "\t");
	   System.out.print((p & q) + "\t" + (p | q) + "\t");
	   System.out.println((p^q) + "\t" + !q + "\t");
	}
}
