import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("CRIE UMA CONTA NO BANCO DIO!");
        System.out.printf("****************************\n");

        System.out.print("Por favor, digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o número da agência: ");
        String agencia = sc.next();
        System.out.print("Digite o número da conta: ");
        String conta = sc.next();
        double saldo = 237.48;
        System.out.println();

        System.out.println("Olá " + nome + ", obrigado por criar um conta em nosso banco!");
        System.out.println("Sua agência é: " + agencia + ", conta: " + conta + " e seu saldo é: " + saldo);


        sc.close();
    }
}
