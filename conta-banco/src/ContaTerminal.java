import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Boas vindas
        System.out.println("Olá, sejam bem vindos ao Banco Dio.");

        //Solicita o numero da conta
        System.out.println("Por favor, digite o número da sua conta: ");
        int conta = scanner.nextInt();

        //Solicita o numero da agencia
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        //Solicita o nome cmpleto
        System.out.println("Por favor digite seu nome: ");
        String nomeCliente = scanner.next();

        //Solicita o saldo
        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso Banco Dio, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + ", já está disponível para saque.");
    }
}