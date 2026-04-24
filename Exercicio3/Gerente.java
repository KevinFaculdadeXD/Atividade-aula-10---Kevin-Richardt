package Exercicio3;

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioMixuruca){
        super(nome, salarioMixuruca);
    }

@Override
public double calcularBonus(){
    return getSalarioMixuruca() * 0.20;
}
}