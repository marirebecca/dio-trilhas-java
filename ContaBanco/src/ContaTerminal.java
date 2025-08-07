import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor insira o Nome do Cliente: ");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor insira o Número da Conta: ");
        numero = scan.nextInt();

        System.out.println("Por favor insira o Número da Agência: ");
        agencia = scan.next();

        System.out.println("Por favor insira o Saldo Bancario: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta com o nosso banco, sua agência é " + agencia + ", conta " + numero + 
        " e seu saldo " + saldo + " já está disponivel para saque.");

    }
}

