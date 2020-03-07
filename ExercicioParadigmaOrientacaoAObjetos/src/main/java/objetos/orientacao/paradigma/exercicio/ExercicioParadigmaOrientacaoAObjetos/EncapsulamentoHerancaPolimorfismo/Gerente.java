package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos.EncapsulamentoHerancaPolimorfismo;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calculaImposto(){
        return this.getSalario() * 0.1;
    }
}
