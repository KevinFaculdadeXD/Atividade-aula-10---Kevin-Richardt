package Exercicio3;

abstract class Funcionario {
    private String nome;
    private double salarioMixuruca;

    public Funcionario(String nome, double salarioMixuruca) {
        this.nome = nome;
        this.salarioMixuruca = salarioMixuruca;

    }

    public abstract double calcularBonus();
    public String getNome() {
        return nome;
    }
    public double getSalarioMixuruca() {
        return salarioMixuruca;
    }
}
