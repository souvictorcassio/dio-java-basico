import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero;
        String agencia;
        String nome;
        Double saldo;

        System.out.print("Digite o número da sua conta: ");
        numero = scan.nextInt();
        
        scan.nextLine();

        System.out.print("Digite o número da agência: ");
        agencia = scan.nextLine();

        System.out.print("Digite o seu nome completo: ");
        nome = scan.nextLine();

        System.out.print("Digite o valor que deseja depositar: ");
        saldo = scan.nextDouble();

        System.out.println("\nOlá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
