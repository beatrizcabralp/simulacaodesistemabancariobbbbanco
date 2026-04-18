import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja muito bem vindo ao BBB - BibisBanco!!!");
        System.out.println("Por favor, digite o número de qual funcionalidade deseja acessar:\n");
        System.out.println("\n******************************\n           Menu\n******************************\n\n");
        System.out.println("1 - Criar Conta;");
        System.out.println("2 - Realizar Depósito;");
        System.out.println("3 - Realizar Saque;");
        System.out.println("4 - Realizar transferências;");
        System.out.println("5 - Listar Contas;");
        System.out.println("6 - Calcular Total de Tributos;");
        System.out.println("7 - Sair;");

        int numeroDigitado = scanner.nextInt();

        while(numeroDigitado < 1 || numeroDigitado > 7){
            System.out.println("Número inválido! Por favor, digite um número válido:");

            System.out.println("\n******************************\n           Menu\n******************************\n\n");
            System.out.println("1 - Criar Conta;");
            System.out.println("2 - Realizar Depósito;");
            System.out.println("3 - Realizar Saque;");
            System.out.println("4 - Realizar transferências;");
            System.out.println("5 - Listar Contas;");
            System.out.println("6 - Calcular Total de Tributos;");
            System.out.println("7 - Sair;");

            numeroDigitado = scanner.nextInt();
        }

        System.out.println("O número digitado foi " + numeroDigitado);
    }
}