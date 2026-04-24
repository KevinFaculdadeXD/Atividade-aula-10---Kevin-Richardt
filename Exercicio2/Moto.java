package Exercicio2;

class Moto extends Veiculo {
    public Moto(String marcaDoModelo, String modeloDoVeiculo){
        super(marcaDoModelo, modeloDoVeiculo);
    }

@Override
public void acelerar(){
    System.out.println("A moto esta acelerando VRUUUUUUUUUUUUUUUUUUUUUUUUM");
}
}
