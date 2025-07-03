import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, digite o número da sua conta:");
    var conta = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Por favor, digite a sua agência (### - ##):");
    var agencia = scanner.nextLine();
    System.out.println("Digite o seu nome e sobrenome:");
    String nome = scanner.nextLine();
    System.out.println("Digite o saldo:");
    var soldo = scanner.nextFloat();
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", nome, agencia, conta, soldo);


    }
}
