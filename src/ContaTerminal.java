import java.util.Scanner;

public class ContaTerminal {
    public void createAccount() {
        var scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        var name = scanner.next();
        scanner.nextLine();

        System.out.println("Please, type your bank agency:");
        var agencyNumber = scanner.next();
        scanner.nextLine();

        System.out.println("Now, type your account number:");
        var accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What's the account amount?(Decimals separated by ',')");
        var accountAmount = scanner.nextFloat();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",
                name,
                agencyNumber,
                accountNumber,
                accountAmount
        );
    }
}
