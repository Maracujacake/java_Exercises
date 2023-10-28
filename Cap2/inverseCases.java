import java.io.IOException;

public class inverseCases{
    public static void main(String[] args) {
        System.out.println("Entre com uma frase ou um caractere, ele será magicamente transformado.");
        int changesCount = 0;
        try {
            while (true) {
                int input = System.in.read();
                if (input == '.') {
                    break;
                }
            char caractere = (char) input;
            
            if(Character.isLowerCase(caractere)){
                caractere = Character.toUpperCase(caractere);
                changesCount++;
            }
            else if(Character.isUpperCase(caractere)){
                caractere = Character.toLowerCase(caractere);
                changesCount++;
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nNumber of case changes: " + changesCount);
    }
}
