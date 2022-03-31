

public class Main {
    public static void main(String[] args) {

        Cliente ygor = new Cliente();
        ygor.setNome("Ygor Pretto");

        Conta cc = new ContaCorrente(ygor);
        Conta poupanca = new ContaPopanca(ygor);

        cc.depositar(100);
        cc.transferir(75,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
