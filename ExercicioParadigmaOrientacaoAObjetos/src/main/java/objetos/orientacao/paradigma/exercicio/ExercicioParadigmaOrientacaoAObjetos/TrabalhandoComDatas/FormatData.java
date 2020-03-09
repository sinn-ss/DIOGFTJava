package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos.TrabalhandoComDatas;

import java.text.SimpleDateFormat;
import java.util.Date;

//Converta a data atual no formato DD/MM/YYYY HH:MM:SS:MMM

public class FormatData {
    public static void main(String[] args) {
        Date dataAtual = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        String dataFormatada = formatter.format(dataAtual);
        System.out.println(dataFormatada);
    }
}
