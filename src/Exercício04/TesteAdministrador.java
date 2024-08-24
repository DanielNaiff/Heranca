package Exercício04;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador admin1 = new Administrador();
        admin1.setNome("Carlos Almeida");
        admin1.setEndereco("Rua E, 135");
        admin1.setTelefone("555-1122");
        admin1.setCodigoSetor(303);
        admin1.setSalarioBase(8000.0);
        admin1.setImposto(20.0);
        admin1.setAjudaDeCusto(2000.0);

        System.out.println("Administrador 1:");
        System.out.println("Nome: " + admin1.getNome());
        System.out.println("Endereço: " + admin1.getEndereco());
        System.out.println("Telefone: " + admin1.getTelefone());
        System.out.println("Código do Setor: " + admin1.getCodigoSetor());
        System.out.println("Salário Líquido: " + admin1.calcularSalario());

        Administrador admin2 = new Administrador("Ana Pereira", "Rua F, 246", "555-3344", 404, 9000.0, 15.0, 2500.0);

        System.out.println("\nAdministrador 2:");
        System.out.println("Nome: " + admin2.getNome());
        System.out.println("Endereço: " + admin2.getEndereco());
        System.out.println("Telefone: " + admin2.getTelefone());
        System.out.println("Código do Setor: " + admin2.getCodigoSetor());
        System.out.println("Salário Líquido: " + admin2.calcularSalario());
    }
}

