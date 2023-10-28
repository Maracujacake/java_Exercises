public class whileTest{
    public static void main(String[] args) {
        try {
            System.out.println("Entre com caracteres do teclado, caso seja um '.' o programa será encerrado");
            int input;
            int contaEspacos = 0;
            
            while ((input = System.in.read()) != -1) {
                char inputChar = (char) input;
                if (inputChar == ' ') {
                    contaEspacos++;
                }
                if (inputChar == '.') {
                    break; // Sai do loop se um ponto for inserido.
                }
            }
            
            System.out.println("O número de espaços foi: " + contaEspacos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
