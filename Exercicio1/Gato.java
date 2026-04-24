package Exercicio1;

class Gato extends animal{
    public Gato(String nomeAnimalBrabo) { super(nomeAnimalBrabo);}
    @Override
    void emitirSom() {
        System.out.println("Au au :D");
    }
}
