package Exercício04;

import Exercício03.Empregado;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador() {
        super();
        this.ajudaDeCusto = 0.0;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Redefinição do método calcularSalario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
