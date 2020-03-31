public class Main {

    public static void main(String[] args) {
        ContaBanco tipoConta = new ContaBanco();
        tipoConta.setTipo("Conta Corrente");
        tipoConta.abrirConta();
        System.out.println(tipoConta.getSaldo());
        tipoConta.depositar(10.00f);
        System.out.println(tipoConta.getSaldo());
        tipoConta.sacar(100.00f);
        System.out.println(tipoConta.getSaldo());
        tipoConta.pagarMensal();
        System.out.println(tipoConta.getSaldo());
    }

}
