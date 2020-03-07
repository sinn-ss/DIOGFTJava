package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos.EncapsulamentoHerancaPolimorfismo;

public class Atendente extends Funcionario {

    public Atendente(String nome, double salario){
        super(nome,salario);
    }

    @Override
    public double calculaImposto() {
        return this.getSalario() * 0.01;
    }
}
