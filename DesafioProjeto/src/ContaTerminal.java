import java.util.Scanner;

public class ContaTerminal {
    private int numeroConta;
    private double saldo;

    public ContaTerminal(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de " + valor + "realizado com sucesso");
    }
    public void sacar(double valor){
        if(saldo <= valor){
            saldo -= valor;
            System.err.println("Saque de "+ valor + "realizado com sucesso");
            }else{
            System.err.println("Saldo insuficiente");
        }
        public double getSaldo(){
            return saldo;
        }
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o numero da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite o saldo da conta: ");
            double saldo = scanner.nextDouble();
            
        }

    }
        
}