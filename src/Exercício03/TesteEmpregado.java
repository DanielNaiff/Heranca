package Exercício03;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        empregado1.setNome("João Silva");
        empregado1.setEndereco("Rua C, 789");
        empregado1.setTelefone("555-9876");
        empregado1.setCodigoSetor(101);
        empregado1.setSalarioBase(5000.0);
        empregado1.setImposto(15.0);

        System.out.println("Empregado 1:");
        System.out.println("Nome: " + empregado1.getNome());
        System.out.println("Endereço: " + empregado1.getEndereco());
        System.out.println("Telefone: " + empregado1.getTelefone());
        System.out.println("Código do Setor: " + empregado1.getCodigoSetor());
        System.out.println("Salário Líquido: " + empregado1.calcularSalario());

        Empregado empregado2 = new Empregado("Maria Oliveira", "Rua D, 321", "555-6543", 202, 7000.0, 10.0);

        System.out.println("\nEmpregado 2:");
        System.out.println("Nome: " + empregado2.getNome());
        System.out.println("Endereço: " + empregado2.getEndereco());
        System.out.println("Telefone: " + empregado2.getTelefone());
        System.out.println("Código do Setor: " + empregado2.getCodigoSetor());
        System.out.println("Salário Líquido: " + empregado2.calcularSalario());
    }
}

