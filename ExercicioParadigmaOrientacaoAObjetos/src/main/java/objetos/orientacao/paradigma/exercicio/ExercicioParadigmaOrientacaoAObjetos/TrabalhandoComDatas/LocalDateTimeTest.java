package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos.TrabalhandoComDatas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00

public class LocalDateTimeTest {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime momento = LocalDateTime.of(2010, 05, 15, 10, 0, 0);
        System.out.println(momento.format(formatter));

        LocalDateTime adicionaMomento = momento.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(adicionaMomento.format(formatter));

    }
}
