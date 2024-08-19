import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        // envia mensagem e permite inserção de dados no terminal conforme o tipo
        System.out.println("Digite o número da Agência: ");
        int numAgencia = leitor.nextInt();

        System.out.println("Digite a Agência: ");
        String agencia = leitor.next();
        leitor.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o saldo inicial: (ex.: 123.45) ");
        double saldo = leitor.nextDouble();

        // envia mensagem de conclusão concatenando com as variaveis
        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numAgencia + " e seu saldo " + saldo + " já está disponível para saque!");

        // encerra o scanner
        leitor.close();
    }
}