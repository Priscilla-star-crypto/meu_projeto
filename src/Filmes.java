public class Filmes {
    private String nome;
    private String genero;
    private float duracao;
    private int ano;
    private double nota;


    public void status(){

        System.out.println("---------FILME----------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Metragem: " + this.getDuracao()+" mim");
        System.out.println("Ano: " + this.getAno());
        System.out.println("Nota: " + this.getNota());
        System.out.println("----------------------------");

    }




    public Filmes(String nome , String genero ,float duracao, int ano , double nota ) {
        this.setNome(nome) ;
        this.setGenero(genero);
        this.setDuracao(duracao);
        this.setAno(ano);
        this.setNota(nota);
    }


    public void metragem(){
        if(this.getDuracao() > 70){
            System.out.println("É um filme de longa metragem ");
        } else if (this.getDuracao() > 15 && this.getDuracao() < 70) {
            System.out.println("É um filme de media metragem ");
        }else
            System.out.println("É um filme de curta metragem ");
    }

    public void nnota(){
        if(this.getNota() > 9){
            System.out.println("É um filme otimo ");
        } else if (getNota()  > 5 && getNota()  < 8) {
            System.out.println("É um filme e bom ");
        }else
            System.out.println("É um filme ruim");
    }






    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
