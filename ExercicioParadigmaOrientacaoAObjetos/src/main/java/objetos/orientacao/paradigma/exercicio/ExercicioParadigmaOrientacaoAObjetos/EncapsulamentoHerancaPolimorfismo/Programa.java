package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos.EncapsulamentoHerancaPolimorfismo;

/*
Vamos pensar em um cenário onde temos Funcionários.
Esses funcionários podem ser: Gerente, Supervisor e Atendente.
Cada tipo de funcionários desses tem políticas diferentes de impostos:
- Gerente paga 0,1% do salário;
- Supervisor paga 0,05% do salário;
- Atendente paga 0,01% do salário;

Monte um modelo que atenda este cenário.
 */

public class Programa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 800);
        System.out.println("Funcionário: " + funcionario.getNome() + ". Salário: R$ " + funcionario.getSalario());
        System.out.println("Valor do imposto: R$ " + funcionario.calculaImposto());

        Atendente atendente = new Atendente("Maria",1200);
        System.out.println("Atendente: " + atendente.getNome() + ". Salário: R$ " + atendente.getSalario());
        System.out.println("Valor do imposto: R$ " + atendente.calculaImposto());

        Supervisor supervisor = new Supervisor("Patricia", 2000);
        System.out.println("Supervisor: " + supervisor.getNome() + ". Salário: R$ " + supervisor.getSalario());
        System.out.println("Valor do imposto: R$ " + supervisor.calculaImposto());

        Gerente gerente = new Gerente("Cristiano", 5000);
        System.out.println("Gerente: " + gerente.getNome() + ". Salário: R$ " + gerente.getSalario());
        System.out.println("Valor do imposto: R$ " + gerente.calculaImposto());

    }
}
