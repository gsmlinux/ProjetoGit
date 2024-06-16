import java.util.Scanner;

public class Teste {
    public static void main (String[] args) {
        System.out.println("Olá terminal do computador!!!");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira sua idade");
        double idade = entrada.nextDouble();

        System.out.println("Sua idade é " + idade + " anos.");

        entrada.close();
    }
}