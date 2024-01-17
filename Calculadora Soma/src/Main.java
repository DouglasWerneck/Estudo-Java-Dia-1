import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double valor1 = input.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double valor2 = input.nextDouble();
        System.out.println("A soma é igual: " + (valor1 + valor2));
        input.close();
    }
    
}