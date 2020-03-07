package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos;

/*Crie uma classe Carro. Nessa classe você deverá ter a quantidade de pessoas que estão dentro do carro.
E também é preciso que tenha uma forma de adicionar e remover pessoas de dentro do carro
 */

public class Carro {
    private int numeroPessoas=1;

    public Integer getNumeroPessoas(){
        return numeroPessoas;
    }

    public Integer adicionaPessoas(){
        return numeroPessoas += 1;
    }

    public Integer removePessoas(){
        return numeroPessoas -= 1;
    }

}
