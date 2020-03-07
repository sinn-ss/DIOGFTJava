package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos;

public class Carro {
    private int numeroPessoas=1;
    private String marca, modelo, variante;
    private int ano;

    public Carro (){

    }

    public Carro (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro (String marca, String modelo, int ano, String variante){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.variante = variante;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Integer getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getVariante(){
        return variante;
    }

    public void setVariante(String variante){
        this.variante = variante;
    }

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
