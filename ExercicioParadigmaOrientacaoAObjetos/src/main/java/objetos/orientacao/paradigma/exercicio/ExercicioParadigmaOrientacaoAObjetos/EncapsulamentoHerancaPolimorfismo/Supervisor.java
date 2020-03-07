package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos.EncapsulamentoHerancaPolimorfismo;

public class Supervisor extends Funcionario {

    public Supervisor(String nome, double salario){
        super(nome,salario);
    }

    @Override
    public double calculaImposto(){
        return this.getSalario() * 0.05;
    }
}
