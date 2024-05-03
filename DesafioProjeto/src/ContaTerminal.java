import java.util.Scanner;

public class ContaTerminal {
    private static boolean ContaTerminal;
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numeroConta, String agencia, String nomeCliente, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de "+valor+"feito com sucesso!");
    }
    public double sacar (double valor){
        if(saldo < valor){
            saldo -= valor;
            System.out.println("Saque de "+valor+"feito com sucesso!");
        }
        return valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua conta");
        int numeroConta = scan.nextInt();
        System.out.println("Digite sua agencia");
        String agencia = scan.next();
        System.out.println("Digite seu nome");
        String nomeCliente = scan.next();
        System.out.println("Digite seu saldo");
        double saldo = scan.nextDouble();

        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nomeCliente, saldo);
        if (ContaTerminal = true) {
            System.out.println("Ola cliente "+nomeCliente+"Obrigado por criar uma conta no nosso banco, sua agencia é: "+agencia+"conta: "+numeroConta+"e seu saldo: "+saldo+"já está disponivel para saque.");
            
        }
    }
}