package Exercicio2;

public class Main {
    
    public static void main(String[] args) {

        Carro Carro = new Carro("Subaru", "Impreza 98");
        Moto Moto = new Moto("Harley-Davidson", "Fat Boy");

        System.out.println("---/Subaru Impreza/---");
        Carro.acelerar();
        Carro.exibirDados();

        System.out.println("---/Harley D. Fat Boy/---");
        Moto.acelerar();
        Moto.exibirDados();
    }
}
