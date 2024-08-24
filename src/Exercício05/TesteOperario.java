package Exercício05;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario1 = new Operario();
        operario1.setNome("José Souza");
        operario1.setEndereco("Rua G, 789");
        operario1.setTelefone("555-7789");
        operario1.setCodigoSetor(505);
        operario1.setSalarioBase(3000.0);
        operario1.setImposto(10.0);
        operario1.setValorProducao(50000.0);
        operario1.setComissao(5.0);

        System.out.println("Operário 1:");
        System.out.println("Nome: " + operario1.getNome());
        System.out.println("Endereço: " + operario1.getEndereco());
        System.out.println("Telefone: " + operario1.getTelefone());
        System.out.println("Código do Setor: " + operario1.getCodigoSetor());
        System.out.println("Salário Líquido: " + operario1.calcularSalario());

        Operario operario2 = new Operario("Paulo Gomes", "Rua H, 101", "555-8890", 606, 4000.0, 12.0, 70000.0, 8.0);

        System.out.println("\nOperário 2:");
        System.out.println("Nome: " + operario2.getNome());
        System.out.println("Endereço: " + operario2.getEndereco());
        System.out.println("Telefone: " + operario2.getTelefone());
        System.out.println("Código do Setor: " + operario2.getCodigoSetor());
        System.out.println("Salário Líquido: " + operario2.calcularSalario());
    }
}

