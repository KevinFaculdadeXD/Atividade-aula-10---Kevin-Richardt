package Exercicio2;

class Carro extends Veiculo {
    public Carro(String marcaDoModelo, String modeloDoVeiculo){
        super(marcaDoModelo, modeloDoVeiculo);
    }

@Override
public void acelerar(){
    System.out.println("O Carro esta acelerando VRUUUUUUUUUUUUUUUUUUUUUUUUM");
}
}
