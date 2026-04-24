package Exercicio1;

class Cachorro extends animal{
    public Cachorro(String nomeAnimalBrabo) { super(nomeAnimalBrabo);}
    @Override
    void emitirSom() {
        System.out.println("Au au :D");
    }
}
