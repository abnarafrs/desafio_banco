import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Abnara Rocha";
        String tipoDeConta = "Corrente";
        double saldo = 5387.57;
        int opcao = 0;

        System.out.println("**********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**********************************");

        String menu = """
                Operações:
                
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                
                Digite a opção desejada:
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            
            if (opcao == 1) {
                System.out.println("O saldo atual é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja transferir:");
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("O valor da transferência é maior que o saldo de sua conta! Por favor, digite um valor compatível!!");
                } else if (valor == 0) {
                    System.out.println("Digite um valor válido!!");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja receber:");
                double valor = leitura.nextDouble();

                if (valor == 0) {
                    System.out.println("Digite um valor válido!!");
                } else {
                    saldo += valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida!!");
            }

        }
    }
}
