import model.Conta;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ContaTerminal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o número da Conta: ");
        conta.setNumero(Integer.parseInt(scanner.nextLine()));

        System.out.println("Por favor, digite o nome do Cliente: ");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Por favor, digite o saldo do Cliente: ");
        conta.setSaldo(Double.parseDouble(scanner.nextLine()));

        System.out.println(conta);
    }
}