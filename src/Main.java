import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner idadeScanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idadeCliente = idadeScanner.nextInt();
        System.out.println("Idade do cliente: " + idadeCliente);
        idadeScanner.close();
    }
}