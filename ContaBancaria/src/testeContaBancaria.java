public class testeContaBancaria{
    public static void main (String[]args){
        ContaBancaria conta = new ContaBancaria("Emily", 4793);

        conta.depositar(455);
        conta.sacar(302);

        System.out.println("Nome do titular: " + conta.getNomeTitular());
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$" + conta.getSaldo());
        System.out.println("Saldo final da conta: R$" +conta.getSaldo());
    }
}
