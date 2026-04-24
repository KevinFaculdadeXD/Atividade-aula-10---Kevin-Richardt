package Exercicio3;

class Vendedor extends Funcionario {
    public Vendedor(String nome, double salarioMixuruca){
        super(nome, salarioMixuruca);
    }

@Override
public double calcularBonus(){
    return getSalarioMixuruca() * 0.20;
}
}
