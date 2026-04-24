package Exercicio2;

abstract class Veiculo {
    private String marcaDoVeiculo;
    private String modeloDoVeiculo;

    public Veiculo (String marcaDoVeiculo, String modeloDoVeiculo) {
        this.marcaDoVeiculo = marcaDoVeiculo;
        this.modeloDoVeiculo = modeloDoVeiculo;
    }
        public abstract void acelerar();

        public void exibirDados() {
            System.out.println("Marca: " + marcaDoVeiculo);
            System.out.println("Modelo: " + modeloDoVeiculo);
        }
}
