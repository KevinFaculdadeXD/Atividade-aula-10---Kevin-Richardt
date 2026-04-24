package Exercicio1;

abstract class animal {
    private String nomeAnimalBrabo;
    private int idadeAnimalBrabo;

    public animal(String nomeAnimalBrabo) {
        this.nomeAnimalBrabo = nomeAnimalBrabo;
    }
    public void setnomeAnimalBrabo(String nomeAnimalBrabo){
        this.nomeAnimalBrabo = nomeAnimalBrabo;
    }

    public void setidadeAnimaBrabo(int idadeAnimalBrabo){
        this.idadeAnimalBrabo = idadeAnimalBrabo;
    }

    abstract void emitirSom();

    void dormirMIMIMIMIMI() {
        System.out.println(nomeAnimalBrabo + "estás a mimir, nao atrapalhe seu boco");
    }
}


