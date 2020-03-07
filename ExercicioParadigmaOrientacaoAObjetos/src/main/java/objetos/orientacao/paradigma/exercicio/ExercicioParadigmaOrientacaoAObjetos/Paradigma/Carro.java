package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos.Paradigma;

public class Carro {
    private int numeroPessoas=1;

    public Integer getNumeroPessoas(){
        return numeroPessoas;
    }

    public void adicionaPessoas(){
        this.numeroPessoas++;
    }

    public void removePessoas(){
        this.numeroPessoas--;
    }

}
