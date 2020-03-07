package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Crie um carro com os seguintes atributos:
- Marca: String
- Modelo: String
- Ano: Integer
- Variante: String

Essa classe deve garantir que Mdelo, Marca e Ano sempre sejam passados na hora de instanciar um objeto
 */

@SpringBootApplication
public class Construtores {
    public static void main(String[] args) {
        Carro carro = new Carro("Renault", "Sandero",2014);

        Carro outroCarro = new Carro ("Volkswagen", "Kombi", 1990, "Variante?");

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno() + "\n");

        System.out.println("Marca: " + outroCarro.getMarca());
        System.out.println("Modelo: "+ outroCarro.getModelo());
        System.out.println("Ano: " + outroCarro.getAno());
        System.out.println("Variante: " + outroCarro.getVariante());
    }

}
