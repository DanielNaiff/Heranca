package Exercício02;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("Empresa XYZ");
        fornecedor1.setEndereco("Rua A, 123");
        fornecedor1.setTelefone("555-1234");
        fornecedor1.setValorCredito(50000.0);
        fornecedor1.setValorDivida(20000.0);

        System.out.println("Fornecedor 1:");
        System.out.println("Nome: " + fornecedor1.getNome());
        System.out.println("Endereço: " + fornecedor1.getEndereco());
        System.out.println("Telefone: " + fornecedor1.getTelefone());
        System.out.println("Saldo: " + fornecedor1.obterSaldo());

        Fornecedor fornecedor2 = new Fornecedor("Empresa ABC", "Rua B, 456", "555-5678", 30000.0, 10000.0);

        System.out.println("\nFornecedor 2:");
        System.out.println("Nome: " + fornecedor2.getNome());
        System.out.println("Endereço: " + fornecedor2.getEndereco());
        System.out.println("Telefone: " + fornecedor2.getTelefone());
        System.out.println("Saldo: " + fornecedor2.obterSaldo());
    }
}

