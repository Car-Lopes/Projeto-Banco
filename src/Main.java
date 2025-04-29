// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente carlos = new Cliente();
        carlos.setNome("Carlos");

        Conta cc = new ContaCorrente(carlos);
        cc.depositar(100);


        Conta cp = new ContaPoupanca(carlos);
        cc.transferir(50,cp);

        cc.impimirExtrato();
        cp.impimirExtrato();

    }
}