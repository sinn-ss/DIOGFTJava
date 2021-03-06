package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos.TrabalhandoComDatas;
import java.util.Calendar;
import java.util.Date;

//Descubra o Time in Millis do dia em que você nasceu
//Converta em um objeto Date
//Verifique se ele é anterior ou posterior a 15 de maio de 2010

public class DataNascimento {
    public static void main(String[] args) {

        Date dataNascimento = new Date (654122700000L);
        System.out.println(dataNascimento);

        Date dataReferencia = new Date (1273956300000L);

        int comparar = dataNascimento.compareTo(dataReferencia);
        System.out.println(comparar);

        if (comparar < 0){
            System.out.println("O nascimento veio antes");
        } else {
            System.out.println("O nascimento veio depois");
        }

        Calendar agora = Calendar.getInstance();
        System.out.println(agora);
    }
}
