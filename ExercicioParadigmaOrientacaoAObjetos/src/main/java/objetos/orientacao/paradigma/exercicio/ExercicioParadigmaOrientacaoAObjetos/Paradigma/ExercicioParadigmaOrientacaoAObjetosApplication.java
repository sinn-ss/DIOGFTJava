package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos.Paradigma;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/*Crie uma classe Carro. Nessa classe você deverá ter a quantidade de pessoas que estão dentro do carro.
E também é preciso que tenha uma forma de adicionar e remover pessoas de dentro do carro
 */

@SpringBootApplication
public class ExercicioParadigmaOrientacaoAObjetosApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ExercicioParadigmaOrientacaoAObjetosApplication.class, args);

		Carro carro = new Carro();

		System.out.println("Olá! Atualmente o carro possui " + carro.getNumeroPessoas() + " pessoas.");
		System.out.println("Vamos adicionar uma pessoa.");
		carro.adicionaPessoas();
		System.out.println("Pronto. Agora o carro possui " + carro.getNumeroPessoas() + " pessoas.");
		System.out.println("Vamor tirar uma pessoa?");
		carro.removePessoas();
		System.out.println("Pronto. Agora o carro possui " + carro.getNumeroPessoas() + " pessoas.");

	}

}
