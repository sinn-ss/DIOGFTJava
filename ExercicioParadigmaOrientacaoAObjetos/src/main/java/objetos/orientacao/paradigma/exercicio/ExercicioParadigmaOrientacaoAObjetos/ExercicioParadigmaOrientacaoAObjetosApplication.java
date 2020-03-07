package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
