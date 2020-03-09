package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos.TrabalhandoComDatas;

import java.util.Calendar;

//Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que os juros sejam cobrados.
//Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte.
//Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar.

public class DataPagamentoFatura {
    public static void main(String[] args) {
        final Calendar dataAtual = Calendar.getInstance();
        Calendar dataVencimento = Calendar.getInstance();

        dataVencimento.set(2020, 02, 15);  //Define a data de vencimento para o dia 15/03/2020 00:00:00
        //Mês indicado como 2 porque a contagem de mês inicia em 0 (0-11)
        System.out.printf("Data de Vencimento original:  %tF\n", dataVencimento);

        dataVencimento.add(Calendar.DATE, 10);  //Adiciona mais 10 dias para pagamento sem juros
        System.out.printf("Prazo para pagamento sem juros: %tF\n", dataVencimento);

        //Estipulando a regra de pular dias caso seja sábado ou domingo
        int day = dataVencimento.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SATURDAY:
                dataVencimento.add(Calendar.DAY_OF_WEEK, 2);
                System.out.printf("Pagamento cairia num sábado. Nova data possível: %tF\n", dataVencimento);
                break;
            case Calendar.SUNDAY:
                dataVencimento.add(Calendar.DAY_OF_WEEK, 1);
                System.out.printf("Pagamento cairia num domingo. Nova data possível: %tF\n", dataVencimento);
                break;
            default:
                break;
        }

        System.out.printf("Hoje é dia: %tF\n", dataAtual);

        int diasParaPagar = 0;
        Calendar calculaDias = Calendar.getInstance();
        calculaDias = dataAtual;

        for (int i = 0; calculaDias.compareTo(dataVencimento) < 0; i++){
            calculaDias.add(calculaDias.DATE, 1);
            diasParaPagar = i;
        }

        System.out.println("Dias para pagar: " + diasParaPagar);

    }
}