public class Filme {
    String nome;
    String genero;

    public Filme(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void exibir() {
        System.out.println(nome + " - " + genero);
    }
}