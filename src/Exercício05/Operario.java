package Exercício05;

import Exercício03.Empregado;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario() {
        this.valorProducao = 0.0;
        this.comissao = 0.0;
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + (this.comissao/100 * this.valorProducao);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
