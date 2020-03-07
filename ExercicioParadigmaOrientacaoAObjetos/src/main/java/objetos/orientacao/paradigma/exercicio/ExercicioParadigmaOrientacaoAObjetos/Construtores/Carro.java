package objetos.orientacao.paradigma.exercicio.ExercicioParadigmaOrientacaoAObjetos.Construtores;

public class Carro {
    private String marca, modelo, variante;
    private int ano;

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
}