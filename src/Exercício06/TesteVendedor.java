package Exercício06;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Maria Silva");
        vendedor1.setEndereco("Rua I, 123");
        vendedor1.setTelefone("555-9876");
        vendedor1.setCodigoSetor(707);
        vendedor1.setSalarioBase(2500.0);
        vendedor1.setImposto(15.0);
        vendedor1.setValorVendas(30000.0);
        vendedor1.setComissao(10.0);

        System.out.println("Vendedor 1:");
        System.out.println("Nome: " + vendedor1.getNome());
        System.out.println("Endereço: " + vendedor1.getEndereco());
        System.out.println("Telefone: " + vendedor1.getTelefone());
        System.out.println("Código do Setor: " + vendedor1.getCodigoSetor());
        System.out.println("Salário Líquido: " + vendedor1.calcularSalario());

        Vendedor vendedor2 = new Vendedor("João Pereira", "Rua J, 456", "555-6543", 808, 3500.0, 10.0, 45000.0, 12.0);

        System.out.println("\nVendedor 2:");
        System.out.println("Nome: " + vendedor2.getNome());
        System.out.println("Endereço: " + vendedor2.getEndereco());
        System.out.println("Telefone: " + vendedor2.getTelefone());
        System.out.println("Código do Setor: " + vendedor2.getCodigoSetor());
        System.out.println("Salário Líquido: " + vendedor2.calcularSalario());
    }
}

