public class ContaBancaria{
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nomeTitular, int numeroConta){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    public String getNomeTitular(){
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    public int getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public void depositar(double valor){
        if (valor > 0){
            saldo+=valor;
        } else { 
            System.out.println("Valor inválido para depósito.");
        }
    }
    public void sacar(double valor){
        if (valor <= saldo){
            saldo-=valor;
        } else { 
            System.out.println("Saldo insuficiente.");
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public void exibirDados(){
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
    }
}