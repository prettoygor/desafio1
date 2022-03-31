public class ContaPopanca extends Conta{

    public ContaPopanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato Conta Poupanca");
        super.ImprimirInfosComuns();
    }

}
