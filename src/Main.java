import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static int proximoNumero = 101;
    static ArrayList<criarConta> contas = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean executando = true;

        while(executando){

            System.out.println("\nOlá, seja muito bem vindo ao BBB - BibisBanco!!!");
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

            while(numeroDigitado < 1 || numeroDigitado > 8){
                System.out.println("Número inválido! Por favor, digite um número válido:");

                System.out.println("\n******************************\n           Menu\n******************************\n\n");
                System.out.println("1 - Criar Conta;");
                System.out.println("2 - Realizar Depósito;");
                System.out.println("3 - Realizar Saque;");
                System.out.println("4 - Realizar transferências;");
                System.out.println("5 - Listar Contas;");
                System.out.println("6 - Calcular Total de Tributos;");
                System.out.println("7 - Sair.");

                numeroDigitado = scanner.nextInt();
            }

            System.out.println("O número digitado foi " + numeroDigitado);

            if(numeroDigitado == 1){
                System.out.println("Digite a opção de qual tipo de conta você deseja abrir\n");

                System.out.println("1 - Conta corrente;");
                System.out.println("2 - Conta poupança");

                int criarTipodeConta = scanner.nextInt();
                scanner.nextLine();

                while(criarTipodeConta != 1 && criarTipodeConta != 2){

                    System.out.println("Número inválido! Por favor, digite um número válido:");

                    System.out.println("1 - Conta corrente;");
                    System.out.println("2 - Conta poupança");

                    criarTipodeConta = scanner.nextInt();
                    scanner.nextLine();
                }

                System.out.println("\nPor favor, digite seu nome: ");
                String nome = scanner.nextLine();

                String tipodeConta;
                criarConta novaConta;

                if(criarTipodeConta == 1){

                    System.out.println("Você selecionou a opção 1: Criar Conta Corrente.\n" + criarTipodeConta);

                    tipodeConta = "Corrente";
                    novaConta = new contaCorrente(proximoNumero, nome);

                }
                else{

                    System.out.println("Você selecionou a opção 2: Criar Conta Poupança. " + criarTipodeConta);

                    tipodeConta = "Poupança";
                    novaConta = new contaPoupanca(proximoNumero, nome);
                }

                contas.add(novaConta);

                System.out.println("Conta criada com sucesso!");
                System.out.println("Número da conta: " + proximoNumero);
                System.out.println("Tipo de conta: " + tipodeConta);
                System.out.println("Cliente: " + nome);
                System.out.println("\n\nProcesso concluído!! Voltando para o menu principal!\n\n");

                proximoNumero++;

            } else if(numeroDigitado == 2){
                System.out.println("Você selecionou a opção realizar depósito.\nPor favor, digite a quantia que deseja depositar.");
                System.out.print("Digite o número da conta: ");

                int numeroConta = scanner.nextInt();

                criarConta contaEncontrada = null;

                for(criarConta c : contas){
                    if(c.getNumero() == numeroConta){
                        contaEncontrada = c;
                        break;
                    }
                }

                if(contaEncontrada == null){
                    System.out.println("Conta não encontrada!");
                }
                else {
                    System.out.print("Digite o valor para depósito: ");
                    double valor = scanner.nextDouble();

                    contaEncontrada.depositar(valor);

                    System.out.println("Depósito realizado com sucesso!!");
                    System.out.println("Novo saldo: " + contaEncontrada.getSaldo());
                }

            } else if(numeroDigitado == 3){
                System.out.println("Você selecionou a opção realizar saque.\nPor favor, digite a quantia que deseja sacar.");

                System.out.print("Digite o número da conta: ");
                int numeroConta = scanner.nextInt();

                criarConta contaEncontrada = null;

                for(criarConta c : contas){
                    if(c.getNumero() == numeroConta){
                        contaEncontrada = c;
                        break;
                    }
                }

                if(contaEncontrada == null){
                    System.out.println("Conta não encontrada!");
                } else {

                    System.out.print("Digite o valor do saque: ");
                    double valor = scanner.nextDouble();

                    double saldoAntes = contaEncontrada.getSaldo();

                    contaEncontrada.sacar(valor);

                    if(contaEncontrada.getSaldo() < saldoAntes){
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Saldo atual: " + contaEncontrada.getSaldo());
                    }
                }
            } else if(numeroDigitado == 4){
                System.out.println("Você selecionou a opção realizar transferência.\nPor favor, digite.");
            } else if(numeroDigitado == 5){
                System.out.println("Você selecionou a opção Listar Contas.\n Aqui estão às listas das contas");
            } else if(numeroDigitado == 6){
                System.out.println("Você selecionou a opção calcular total de tributos.\nAqui está o total de tributos");
            } else if(numeroDigitado == 7){
                System.out.println("Você selecionou a opção sair.\n Até breve!!! :)");
                executando = false;
            } else{
                System.out.println("Número inválido! Por favor, digite novamente um número válido");

                int numeroDigitadodois = scanner.nextInt();

                while(numeroDigitadodois < 1 || numeroDigitadodois > 8){
                    System.out.println("Número inválido! Por favor, digite um número válido:");

                    System.out.println("\n******************************\n           Menu\n******************************\n\n");
                    System.out.println("1 - Criar Conta;");
                    System.out.println("2 - Realizar Depósito;");
                    System.out.println("3 - Realizar Saque;");
                    System.out.println("4 - Realizar transferências;");
                    System.out.println("5 - Listar Contas;");
                    System.out.println("6 - Calcular Total de Tributos;");
                    System.out.println("7 - Sair.");

                    numeroDigitadodois = scanner.nextInt();
                }
            }
        }

        scanner.close();
    }
}