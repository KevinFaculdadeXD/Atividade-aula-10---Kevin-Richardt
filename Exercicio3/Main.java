package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Funcionario> NovosEscravos = new ArrayList<>();

        NovosEscravos.add(new Gerente("Roberto", 5000));
        NovosEscravos.add(new Vendedor("Carla", 1500));
        NovosEscravos.add(new Gerente("Gabriel", 2300));
        NovosEscravos.add(new Vendedor("João", 1800));

        for (Funcionario f : NovosEscravos){
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário: " + f.getSalarioMixuruca());
            System.out.println("Bônus: " + f.calcularBonus());
            System.out.println("-----------------------");
        }
    }
}
